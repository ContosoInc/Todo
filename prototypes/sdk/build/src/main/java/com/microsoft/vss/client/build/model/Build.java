package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.BuildReason;
import com.microsoft.vss.client.build.model.enumeration.BuildResult;
import com.microsoft.vss.client.build.model.enumeration.BuildStatus;
import com.microsoft.vss.client.build.model.enumeration.QueuePriority;
import com.microsoft.vss.client.core.model.IdentityRef;
import com.microsoft.vss.client.core.model.TeamProjectReference;

import java.util.Date;

/**
 * Created by yacao on 12/12/2014.
 */
public class Build {

    private int id;
    private BuildDefinitionReference definition;
    private String buildNumber;
    private TeamProjectReference project;
    private String uri;
    private String sourceBranch;
    private String sourceVersion;
    private BuildStatus status;
    private QueueReference queue;
    private Date QueueTime;
    private Integer QueuePosition;
    private QueuePriority priority;
    private Date startTime;
    private Date finishTime;
    private BuildReason reason;
    private BuildResult result;
    private IdentityRef requestedFor;
    private IdentityRef requestedBy;
    private Date lastChangedDate;
    private IdentityRef lastChangedBy;
    private String parameters;
    private TaskOrchestrationPlanReference orchestrationPlan;
    private LogLocationReference log;
    private BuildRepository repository;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public BuildDefinitionReference getDefinition() {
        return definition;
    }

    public void setDefinition(BuildDefinitionReference definition) {
        this.definition = definition;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public IdentityRef getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(IdentityRef lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public LogLocationReference getLog() {
        return log;
    }

    public void setLog(LogLocationReference log) {
        this.log = log;
    }

    public TaskOrchestrationPlanReference getOrchestrationPlan() {
        return orchestrationPlan;
    }

    public void setOrchestrationPlan(TaskOrchestrationPlanReference orchestrationPlan) {
        this.orchestrationPlan = orchestrationPlan;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public QueuePriority getPriority() {
        return priority;
    }

    public void setPriority(QueuePriority priority) {
        this.priority = priority;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(TeamProjectReference project) {
        this.project = project;
    }

    public QueueReference getQueue() {
        return queue;
    }

    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    public Integer getQueuePosition() {
        return QueuePosition;
    }

    public void setQueuePosition(Integer queuePosition) {
        QueuePosition = queuePosition;
    }

    public Date getQueueTime() {
        return QueueTime;
    }

    public void setQueueTime(Date queueTime) {
        QueueTime = queueTime;
    }

    public BuildReason getReason() {
        return reason;
    }

    public void setReason(BuildReason reason) {
        this.reason = reason;
    }

    public BuildRepository getRepository() {
        return repository;
    }

    public void setRepository(BuildRepository repository) {
        this.repository = repository;
    }

    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    public void setRequestedFor(IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    public BuildResult getResult() {
        return result;
    }

    public void setResult(BuildResult result) {
        this.result = result;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public String getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BuildStatus getStatus() {
        return status;
    }

    public void setStatus(BuildStatus status) {
        this.status = status;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
