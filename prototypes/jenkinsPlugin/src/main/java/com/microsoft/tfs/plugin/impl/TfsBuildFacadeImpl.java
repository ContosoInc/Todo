package com.microsoft.tfs.plugin.impl;

import com.microsoft.teamfoundation.build.webapi.model.Build;
import com.microsoft.teamfoundation.build.webapi.model.BuildResult;
import com.microsoft.teamfoundation.build.webapi.model.BuildStatus;
import com.microsoft.teamfoundation.distributedtask.webapi.DistributedTaskHttpClient;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskLog;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskResult;
import com.microsoft.teamfoundation.distributedtask.webapi.model.Timeline;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TimelineRecord;
import com.microsoft.tfs.plugin.TfsBuildFacade;
import com.microsoft.visualstudio.services.webapi.model.VssJsonCollectionWrapper;
import hudson.model.AbstractBuild;
import hudson.plugins.git.Revision;
import hudson.plugins.git.util.BuildData;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.logging.Logger;

import static com.microsoft.teamfoundation.distributedtask.webapi.model.TimelineRecordState.*;
import static hudson.model.Result.*;

/**
 * This class is a facade to update TFS build from Jenkins.
 *
 * All updates to TFS build should go through this class.  Also deliberately this
 * class only contains IDs and does not keep state.  All build update operation are PATCH
 * based, and this object maybe out of sync with what is really happening on TFS,
 * so we GET the object from the IDs and then PATCH the server
 */
public class TfsBuildFacadeImpl implements TfsBuildFacade {

    private static Logger logger = Logger.getLogger(TfsBuildFacadeImpl.class.getName());

    /*
     * Constants
     */
    private static String JOB_RECORD_TYPE = "Job";
    private static String JOB_RECORD_NAME = "Build";
    private static String JENKINS_RECORD_TYPE = "Task";
    private static String JENKINS_RECORD_NAME = "Jenkins Build";
    private static String JENKINS_WORKER_NAME = "Jenkins";

    /*
     * The Jenkins build which is running
     */
    private AbstractBuild jenkinsBuild;

    /*
     * The ID of the build container running on TFS
     */
    private int tfsBuildId;

    /*
     * The ID of the orchestration plan for this jenkins build on TFS
     */
    private UUID planId;

    /*
     * The ID of the timeline for this jenkins build on TFS
     */
    private UUID timelineId;

    /*
     * The ID of the job record
     */
    private UUID jobRecordId;

    /*
     * The job log id for the job record
     */
    private int jobLogId;

    /*
     * The TFS REST client
     */
    private TfsClient client;

    /* should only be instantiated from TfsBuildFacadeFactoryImpl from same package */
    /* default */
    TfsBuildFacadeImpl(final Build tfsBuild, final AbstractBuild jenkinsBuild, final TfsClient tfsClient) {

        // populate timeline
        UUID planId = tfsBuild.getOrchestrationPlan().getPlanId();
        Timeline timeline = getTimeline(tfsClient, planId);

        // populate timeline record
        List<TimelineRecord> records = tfsClient.getDistributedTaskHttpClient().getRecords(planId, timeline.getId(), null);
        if (records == null || records.isEmpty()) {
            records = new ArrayList<TimelineRecord>();
        }

        TimelineRecord jobRecord = null;
        TimelineRecord jenkinsTaskRecord = null;

        for (TimelineRecord record : records) {
            if (record.getType().equalsIgnoreCase(JOB_RECORD_TYPE)) {
                jobRecord = record;
            } else if (record.getType().equalsIgnoreCase(JENKINS_RECORD_TYPE)) {
                jenkinsTaskRecord = record;
            }
        }

        if (jobRecord == null) {
            jobRecord = createTimelineJobRecord();
            records.add(jobRecord);
        }

        if (jenkinsTaskRecord == null) {
            records.add(getTimelineJenkinsTaskRecord(jobRecord));
        }

        tfsClient.getDistributedTaskHttpClient().updateRecords(createWrapper(records), planId, timeline.getId());

        // populate fields
        this.tfsBuildId = tfsBuild.getId();
        this.jenkinsBuild = jenkinsBuild;
        this.planId = tfsBuild.getOrchestrationPlan().getPlanId();
        this.jobLogId = -1;
        this.client = tfsClient;
        this.timelineId = timeline.getId();
        this.jobRecordId = jobRecord.getId();
    }

    /**
     * Get the build container ID on TFS
     *
     * @return tfs build id
     */
    public int getTfsBuildId() {
        return tfsBuildId;
    }

    /**
     * Update TFS Build status to started with starting time
     */
    public void startBuild() {
        Build b = queryTfsBuild();

        b.setStartTime(new Date());
        b.setStatus(BuildStatus.IN_PROGRESS);

        getClient().getBuildClient().updateBuild(b, b.getProject().getId(), b.getId());
    }

    /**
     * Update TFS Build status to finished with Jenkins status
     */
    public void finishBuild() {
        Build b = queryTfsBuild();
        b.setFinishTime(new Date());

        AbstractBuild jenkinsBuild = getJenkinsBuild();
        BuildResult jenkinsResult;
        if (jenkinsBuild.getResult() == SUCCESS) {
            jenkinsResult = BuildResult.SUCCEEDED;
        } else if (jenkinsBuild.getResult() == ABORTED) {
            jenkinsResult = BuildResult.CANCELED;
        } else {
            // Assume FAILURE (and other cases that aren't successful)
            jenkinsResult = BuildResult.FAILED;
        }

        b.setResult(jenkinsResult);
        b.setStatus(BuildStatus.COMPLETED);

        String commitSha1 =  getSourceCommit();
        logger.info("Setting TFS build sourceVersion to: " + commitSha1);
        b.setSourceVersion(commitSha1);

        getClient().getBuildClient().updateBuild(b, b.getProject().getId(), b.getId());
    }

    /**
     * Update all tasks' status to inProgress, this is because we only have one
     * Jenkins task at the moment.
     */
    public void startAllTaskRecords() {
        List<TimelineRecord> records = queryTfsTimelineRecords();
        for (TimelineRecord record : records) {
            record.setState(IN_PROGRESS);
            record.setStartTime(new Date());
            record.setWorkerName(JENKINS_WORKER_NAME);
        }

        getClient().getDistributedTaskHttpClient().updateRecords(createWrapper(records), getPlanId(), getTimelineId());
    }

    /**
     * Update all tasks' status to Jenkins's build status, this is because we only have one
     * Jenkins task at the moment.
     */
    public void finishAllTaskRecords() {
        List<TimelineRecord> records = queryTfsTimelineRecords();

        TaskResult result;
        if (this.getJenkinsBuild().getResult() == SUCCESS) {
            result = TaskResult.SUCCEEDED;
        } else if (this.getJenkinsBuild().getResult() == FAILURE) {
            result = TaskResult.FAILED;
        } else if (this.getJenkinsBuild().getResult() == ABORTED) {
            result = TaskResult.CANCELED;
        } else {
            result = TaskResult.ABANDONED;
        }

        for (TimelineRecord record : records) {
            record.setState(COMPLETED);
            record.setFinishTime(new Date());
            record.setResult(result);
        }

        getClient().getDistributedTaskHttpClient().updateRecords(createWrapper(records), getPlanId(), getTimelineId());
    }

    /**
     * Posting lines to TFS build console
     *
     * The console feed and log appears to be the same due to we have only one task (jenkins) in this build container
     *
     * @param lines
     */
    public void appendJobLog(List<String> lines) {
        if (lines == null || lines.size() == 0) {
            return;
        }

        if (!hasLogRecord()) {
            this.jobLogId = createLogForJobRecord();
        }

        DistributedTaskHttpClient distributedTaskHttpClient = getClient().getDistributedTaskHttpClient();

        // post console feed
        distributedTaskHttpClient.postLines(createWrapper(lines), getPlanId(), getTimelineId(), getJobRecordId());

        // append the feed to its log
        /* TODO: Need client fix
        try {
            distributedTaskHttpClient.appendLog(getPlanId(), getJobLogId(), getByteArrayInputStream(lines));
        } catch (IOException e) {
            logger.severe("Failed to send log to Microsoft TFS: "+e.getMessage());
        }
        */
    }

    private InputStream getByteArrayInputStream(List<String> lines) throws IOException {
        // assuming each line is 256-bytes long to avoid grow constantly
        ByteArrayOutputStream os = new ByteArrayOutputStream(lines.size() * 256);
        byte[] newLine = String.format("%n").getBytes(Charset.defaultCharset());
        for (String line : lines) {
            os.write(line.getBytes(Charset.defaultCharset()));
            os.write(newLine);
        }

        return new ByteArrayInputStream(os.toByteArray());
    }

    private Build queryTfsBuild() {
        return getClient().getBuildClient().getBuild(getTfsBuildId(), null);
    }

    private List<TimelineRecord> queryTfsTimelineRecords() {
        return getClient().getDistributedTaskHttpClient().getRecords(getPlanId(), getTimelineId(), null);
    }

    /**
     * Create a log reference for the job record
     *
     * @return jobId
     */
    private int createLogForJobRecord() {
        List<TaskLog> logs = getClient().getDistributedTaskHttpClient().getLogs(getPlanId());
        TaskLog jobLog;
        if (logs == null || logs.isEmpty()) {
            // if log is not created, create it now
            TaskLog log = new TaskLog();
            log.setId(0);
            log.setPath("logs\\\\" + UUID.randomUUID());
            logger.info("There is no log defined. Creating log for plan: " + getPlanId());
            getClient().getDistributedTaskHttpClient().createLog(log, getPlanId());

            logs = getClient().getDistributedTaskHttpClient().getLogs(getPlanId());
        }

        if (logs == null || logs.size() < 1) {
            throw new RuntimeException("Could not create a job log for this build.");
        }

        jobLog = logs.get(0);

        // Should only patch log information for job record
        List<TimelineRecord> records = queryTfsTimelineRecords();
        TimelineRecord jobRecord = null;
        for (TimelineRecord record : records) {
            if (record.getType().equalsIgnoreCase(JOB_RECORD_TYPE)) {
                jobRecord = record;
                jobRecord.setId(getJobRecordId());
                jobRecord.setLog(jobLog);
                logger.info("Setting up record log path: "+jobLog.getPath()+" log id: "+jobLog.getId());
            }
        }

        getClient().getDistributedTaskHttpClient().updateRecords(createWrapper(Collections.singletonList(jobRecord)), getPlanId(), getTimelineId());

        return jobLog.getId();
    }

    private TimelineRecord createTimelineJobRecord() {
        TimelineRecord jobRecord = new TimelineRecord();
        jobRecord.setId(UUID.randomUUID());
        jobRecord.setType(JOB_RECORD_TYPE);
        jobRecord.setName(JOB_RECORD_NAME);
        jobRecord.setState(PENDING);

        return jobRecord;
    }

    private TimelineRecord getTimelineJenkinsTaskRecord(TimelineRecord jobRecord) {
        TimelineRecord jenkinsTaskRecord;

        jenkinsTaskRecord = new TimelineRecord();
        jenkinsTaskRecord.setId(UUID.randomUUID());
        jenkinsTaskRecord.setType(JENKINS_RECORD_TYPE);
        jenkinsTaskRecord.setName(JENKINS_RECORD_NAME);
        jenkinsTaskRecord.setParentId(jobRecord.getId());
        jenkinsTaskRecord.setState(PENDING);

        return jenkinsTaskRecord;
    }

    private Timeline getTimeline(TfsClient tfsClient, UUID planId) {
        List<Timeline> timelines = tfsClient.getDistributedTaskHttpClient().getTimelines(planId);

        if (timelines == null || timelines.isEmpty()) {
            // create a new timeline if there is none
            Timeline t = new Timeline();
            t.setId(UUID.randomUUID());
            t = tfsClient.getDistributedTaskHttpClient().createTimeline(t, planId);
            timelines = Collections.singletonList(t);
        }

        for (Timeline timeline : timelines) {
            logger.info(String.format("Timeline id: %s", timeline.getId()));
        }

        if (timelines.size() > 1) {
            logger.warning("Multiple timelines found for this build, default to use the first timeline");
        }

        return timelines.get(0);
    }

    private String getSourceCommit() {
        String sourceVersion = getGitSourceCommit();
        if (sourceVersion != null) {
            return sourceVersion;
        }

        // could add action to get other SCM revision string here
        return "undetermined";
    }

    private String getGitSourceCommit() {
        // depend on git plugin
        for (BuildData data : getJenkinsBuild().getActions(BuildData.class)) {
            Revision revision = data.getLastBuiltRevision();
            if (revision != null) {
                return revision.getSha1String();
            }
        }

        return null;
    }

    private boolean hasLogRecord() {
        return getJobLogId() != -1;
    }

    private UUID getPlanId() {
        return planId;
    }

    private UUID getTimelineId() {
        return timelineId;
    }

    private UUID getJobRecordId() {
        return jobRecordId;
    }

    private int getJobLogId() {
        return jobLogId;
    }

    private AbstractBuild getJenkinsBuild() {
        return jenkinsBuild;
    }

    private TfsClient getClient() { return client; }

    private <T> VssJsonCollectionWrapper<List<T>> createWrapper(List<T> list) {
        return VssJsonCollectionWrapper.newInstance(list);
    }
}
