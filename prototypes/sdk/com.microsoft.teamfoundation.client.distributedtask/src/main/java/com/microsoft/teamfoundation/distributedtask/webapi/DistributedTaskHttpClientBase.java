/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.distributedtask.webapi;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import com.microsoft.teamfoundation.distributedtask.webapi.model.JobEvent;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskLog;
import com.microsoft.teamfoundation.distributedtask.webapi.model.Timeline;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TimelineRecord;
import com.microsoft.visualstudio.services.webapi.model.VssJsonCollectionWrapper;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.core.model.NameValueCollection;
import com.microsoft.vss.client.core.VssHttpClientBase;

public abstract class DistributedTaskHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of DistributedTaskHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    public DistributedTaskHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * @param eventData 
     *            
     * @param planId 
     *            
     * @param jobId 
     *            
     * @param eventName 
     *            
     */
    public void postEvent(
        final JobEvent eventData, 
        final UUID planId, 
        final UUID jobId, 
        final String eventName) {

        final UUID locationId = UUID.fromString("557624af-b29e-4c20-8ab0-0399d2204f3f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
            queryParameters.addIfNotNull("jobId", jobId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("eventName", eventName); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.POST,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           eventData,
                                                           APPLICATION_JSON_TYPE,
                                                           queryParameters,
                                                           APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param lines 
     *            
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     */
    public void postLines(
        final VssJsonCollectionWrapper<List<String>> lines, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId) {

        final UUID locationId = UUID.fromString("858983e4-19bd-4c5e-864c-507b59b58b12"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.POST,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           lines,
                                                           APPLICATION_JSON_TYPE,
                                                           APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param planId 
     *            
     * @param logId 
     *            
     * @return Response
     */
    public Response appendLog(
        final UUID planId, 
        final int logId) {

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.POST,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest);
    }

    /** 
     * @param log 
     *            
     * @param planId 
     *            
     * @return TaskLog
     */
    public TaskLog createLog(
        final TaskLog log, 
        final UUID planId) {

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.POST,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           log,
                                                           APPLICATION_JSON_TYPE,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskLog.class);
    }

    /** 
     * @param planId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return Response
     */
    public Response getLog(
        final UUID planId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) {

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           queryParameters,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest);
    }

    /** 
     * @param planId 
     *            
     * @return List<TaskLog>
     */
    public List<TaskLog> getLogs(
        final UUID planId) {

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskLog>>() {});
    }

    /** 
     * @param planId 
     *            
     * @return Response
     */
    public Response getPlan(
        final UUID planId) {

        final UUID locationId = UUID.fromString("5cecd946-d704-471e-a45f-3b4064fcfaba"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest);
    }

    /** 
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @return List<TimelineRecord>
     */
    public List<TimelineRecord> getRecords(
        final UUID planId, 
        final UUID timelineId, 
        final Integer changeId) {

        final UUID locationId = UUID.fromString("8893bc5b-35b2-4be7-83cb-99e683551db4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           queryParameters,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TimelineRecord>>() {});
    }

    /** 
     * @param records 
     *            
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @return List<TimelineRecord>
     */
    public List<TimelineRecord> updateRecords(
        final VssJsonCollectionWrapper<List<TimelineRecord>> records, 
        final UUID planId, 
        final UUID timelineId) {

        final UUID locationId = UUID.fromString("8893bc5b-35b2-4be7-83cb-99e683551db4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.PATCH,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           records,
                                                           APPLICATION_JSON_TYPE,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TimelineRecord>>() {});
    }

    /** 
     * @param timeline 
     *            
     * @param planId 
     *            
     * @return Timeline
     */
    public Timeline createTimeline(
        final Timeline timeline, 
        final UUID planId) {

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.POST,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           timeline,
                                                           APPLICATION_JSON_TYPE,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** 
     * @param planId 
     *            
     * @param timelineId 
     *            
     */
    public void deleteTimeline(
        final UUID planId, 
        final UUID timelineId) {

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.DELETE,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @param includeRecords 
     *            
     * @return Response
     */
    public Response getTimeline(
        final UUID planId, 
        final UUID timelineId, 
        final Integer changeId, 
        final Boolean includeRecords) {

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRecords", includeRecords); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           queryParameters,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest);
    }

    /** 
     * @param planId 
     *            
     * @return List<Timeline>
     */
    public List<Timeline> getTimelines(
        final UUID planId) {

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                                                           locationId,
                                                           routeValues,
                                                           apiVersion,
                                                           APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Timeline>>() {});
    }
}
