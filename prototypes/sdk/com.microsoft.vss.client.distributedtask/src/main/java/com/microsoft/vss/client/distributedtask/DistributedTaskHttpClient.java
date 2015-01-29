package com.microsoft.vss.client.distributedtask;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.core.model.NameValueCollection;
import com.microsoft.vss.client.distributedtask.model.TaskLog;
import com.microsoft.vss.client.distributedtask.model.Timeline;

public class DistributedTaskHttpClient
    extends VssHttpClientBase {

    private final static ApiResourceVersion API_VERSION = new ApiResourceVersion(1, 0);
    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    public DistributedTaskHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    public Timeline getTimeline(final UUID planId, final UUID timelineId) {
        return getTimeline(planId, timelineId, 0, null);
    }

    public Timeline getTimeline(final UUID planId, final UUID timelineId, final int changeId) {
        return getTimeline(planId, timelineId, changeId, null);
    }

    public Timeline getTimeline(final UUID planId, final UUID timelineId, final boolean includeRecords) {
        return getTimeline(planId, timelineId, 0, (Boolean) includeRecords);
    }

    public Timeline getTimeline(final UUID planId, final UUID timelineId, final int changeId,
        final boolean includeRecords) {
        return getTimeline(planId, timelineId, changeId, (Boolean) includeRecords);
    }

    private Timeline getTimeline(final UUID planId, final UUID timelineId, final int changeId,
        final Boolean includeRecords) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (changeId != 0) {
            queryParameters.put("changeId", String.valueOf(changeId)); //$NON-NLS-1$
        }

        if (includeRecords != null && includeRecords.booleanValue()) {
            queryParameters.put("includeRecords", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        return super.get(TaskResourceIds.Timelines, routeValues, API_VERSION, queryParameters, Timeline.class);
    }

    public Timeline createTimeline(final UUID planId, final Timeline timeline) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        return super.post(timeline, TaskResourceIds.Timelines, routeValues, API_VERSION, Timeline.class);
    }

    public void deleteTimeline(final UUID planId, final UUID timelineId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        super.delete(TaskResourceIds.Timelines, routeValues, API_VERSION);
    }

    public Response appendTimelineRecordFeed(final UUID planId, final UUID timelineId, final UUID recordId,
        final List<String> lines) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$

        return super.post(lines, TaskResourceIds.TimelineRecordFeeds, routeValues, API_VERSION);
    }

    public TaskLog createLog(final UUID planId, final TaskLog log) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        return super.post(log, TaskResourceIds.Logs, routeValues, API_VERSION, TaskLog.class);
    }

    public TaskLog appendLog(final UUID planId, final int logId, final InputStream content) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final Invocation request =
            createRequest(HttpMethod.POST, TaskResourceIds.Logs, routeValues, API_VERSION, content,
                MediaType.APPLICATION_OCTET_STREAM_TYPE, null, MediaType.APPLICATION_JSON_TYPE);

        return sendRequest(request, TaskLog.class);
    }

    public List<String> getLogLines(final UUID planId, final int logId) {
        return getLogLines(planId, logId, (Number) null, null);
    }

    public List<String> getLogLines(final UUID planId, final int logId, final long startLine) {
        return getLogLines(planId, logId, startLine, null);
    }

    public List<String> getLogLines(final UUID planId, final int logId, final long startLine, final long endLine) {
        return getLogLines(planId, logId, (Number) startLine, (Number) endLine);
    }

    private List<String> getLogLines(final UUID planId, final int logId, final Number startLine, final Number endLine) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();

        if (startLine != null) {
            routeValues.put("startLine", startLine.toString()); //$NON-NLS-1$ }
        }

        if (endLine != null) {
            routeValues.put("endLine", endLine.toString()); //$NON-NLS-1$ }
        }

        return super.get(TaskResourceIds.TimelineRecordFeeds, routeValues, API_VERSION, queryParameters,
            new GenericType<List<String>>() {});
    }
}
