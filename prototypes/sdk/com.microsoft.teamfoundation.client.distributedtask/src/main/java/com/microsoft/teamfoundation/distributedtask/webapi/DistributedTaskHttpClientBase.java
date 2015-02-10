/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.microsoft.vss.client.core.*;
import com.microsoft.vss.client.core.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
public abstract class DistributedTaskHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public DistributedTaskHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** <summary>
     * 
     * </summary>
     * @param agent 
     *            
     * @param poolId 
     *            
     */
    public TaskAgent addAgent(final TaskAgent agent, final int poolId) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, agent, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public void deleteAgent(final int poolId, final int agentId) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     */
    public Response getAgent(final int poolId, final int agentId, final Boolean includeCapabilities, final String propertyFilters) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param agentName 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     */
    public List<TaskAgent> getAgents(final int poolId, final String agentName, final Boolean includeCapabilities, final String propertyFilters) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("agentName", agentName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskAgent>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public TaskAgent putAgent(final TaskAgent agent, final int poolId, final int agentId) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, agent, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param taskId 
     *            
     * @param versionString 
     *            
     */
    public Response getTaskHelp(final UUID taskId, final String versionString) {
        final UUID locationId = UUID.fromString("c7701e23-91ea-48d6-9520-8050efc046c2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param eventData 
     *            
     * @param planId 
     *            
     * @param jobId 
     *            
     * @param eventName 
     *            
     */
    public void postEvent(final JobEvent eventData, final UUID planId, final UUID jobId, final String eventName) {
        final UUID locationId = UUID.fromString("dfed02fb-deee-4039-a04d-aa21d0241995"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (jobId != null)
        {
            queryParameters.addIfNotNull("jobId", jobId); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("eventName", eventName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, eventData, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param lines 
     *            
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     */
    public void postLines(final VssJsonCollectionWrapper<List<String>> lines, final UUID planId, final UUID timelineId, final UUID recordId) {
        final UUID locationId = UUID.fromString("9ae056f6-d4e4-4d0c-bd26-aee2a22f01f2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, lines, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param taskId 
     *            
     * @param versionString 
     *            
     */
    public Response getTaskIcon(final UUID taskId, final String versionString) {
        final UUID locationId = UUID.fromString("63463108-174d-49d4-b8cb-235eea42a5e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     */
    public void deleteRequest(final int poolId, final long requestId, final UUID lockToken) {
        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (lockToken != null)
        {
            queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param requestId 
     *            
     */
    public TaskAgentJobRequest getRequest(final int poolId, final long requestId) {
        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param request 
     *            
     * @param poolId 
     *            
     */
    public TaskAgentJobRequest queueRequest(final TaskAgentJobRequest request, final int poolId) {
        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, request, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param request 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     */
    public TaskAgentJobRequest updateRequest(final TaskAgentJobRequest request, final int poolId, final long requestId, final UUID lockToken) {
        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (lockToken != null)
        {
            queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, request, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     * @param logId 
     *            
     */
    public Response appendLog(final UUID planId, final int logId) {
        final UUID locationId = UUID.fromString("15344176-9e77-4cf4-a7c3-8bc4d0a3c4eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param log 
     *            
     * @param planId 
     *            
     */
    public TaskLog createLog(final TaskLog log, final UUID planId) {
        final UUID locationId = UUID.fromString("15344176-9e77-4cf4-a7c3-8bc4d0a3c4eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, log, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskLog.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     */
    public Response getLog(final UUID planId, final int logId, final Integer startLine, final Integer endLine) {
        final UUID locationId = UUID.fromString("15344176-9e77-4cf4-a7c3-8bc4d0a3c4eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     */
    public List<TaskLog> getLogs(final UUID planId) {
        final UUID locationId = UUID.fromString("15344176-9e77-4cf4-a7c3-8bc4d0a3c4eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskLog>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param messageId 
     *            
     * @param sessionId 
     *            
     */
    public Response deleteMessageAsync(final int poolId, final long messageId, final UUID sessionId) {
        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (sessionId != null)
        {
            queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param sessionId 
     *            
     * @param lastMessageId 
     *            
     */
    public Response getMessageAsync(final int poolId, final UUID sessionId, final Integer lastMessageId) {
        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (sessionId != null)
        {
            queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("lastMessageId", lastMessageId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<Response>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param message 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     */
    public void sendMessage(final TaskAgentMessage message, final int poolId, final int requestId) {
        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("requestId", String.valueOf(requestId)); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, message, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * This method can return any of the following depending on the parameters: packages -- list of packages packages/{packageType}/{propertyName} -- package property packages/{packageType} -- package stream other -- BadRequest
     * </summary>
     * @param packageType 
     *            
     * @param propertyName 
     *            
     * @param properties 
     *            
     */
    public Response getPackage(final String packageType, final String propertyName, final String properties) {
        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$
        routeValues.put("propertyName", propertyName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     */
    public Response getPlan(final UUID planId) {
        final UUID locationId = UUID.fromString("f8d10759-6e90-48bc-96b0-d19440116797"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param pool 
     *            
     */
    public TaskAgentPool addPool(final TaskAgentPool pool) {
        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, pool, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param properties 
     *            
     */
    public Response getPool(final int poolId, final String properties) {
        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolName 
     *            
     * @param properties 
     *            
     */
    public List<TaskAgentPool> getPools(final String poolName, final String properties) {
        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("poolName", poolName); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskAgentPool>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     */
    public List<TimelineRecord> getRecords(final UUID planId, final UUID timelineId, final Integer changeId) {
        final UUID locationId = UUID.fromString("50170d5d-f122-492f-9816-e2ef9f8d1756"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TimelineRecord>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param records 
     *            
     * @param planId 
     *            
     * @param timelineId 
     *            
     */
    public List<TimelineRecord> updateRecords(final VssJsonCollectionWrapper<List<TimelineRecord>> records, final UUID planId, final UUID timelineId) {
        final UUID locationId = UUID.fromString("50170d5d-f122-492f-9816-e2ef9f8d1756"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, records, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TimelineRecord>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param session 
     *            
     * @param poolId 
     *            
     */
    public TaskAgentSession createSession(final TaskAgentSession session, final int poolId) {
        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, session, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentSession.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param poolId 
     *            
     * @param sessionId 
     *            
     */
    public void deleteSession(final int poolId, final UUID sessionId) {
        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("sessionId", sessionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param definition 
     *            
     * @param overwrite 
     *            
     */
    public Response createTaskDefinition(final TaskDefinition definition, final Boolean overwrite) {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("overwrite", overwrite); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     */
    public void deleteTaskDefinitions() {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param taskId 
     *            
     * @param versionString 
     *            
     */
    public Response getTaskContent(final UUID taskId, final String versionString) {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     */
    public List<TaskDefinition> getTaskDefinitions() {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskDefinition>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param overwrite 
     *            
     */
    public Response uploadTaskContent(final UUID taskId, final String versionString, final Boolean overwrite) {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("overwrite", overwrite); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<Response>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param timeline 
     *            
     * @param planId 
     *            
     */
    public Timeline createTimeline(final Timeline timeline, final UUID planId) {
        final UUID locationId = UUID.fromString("ffe38397-3a9d-4ca6-b06d-49303f287ba5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, timeline, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     * @param timelineId 
     *            
     */
    public void deleteTimeline(final UUID planId, final UUID timelineId) {
        final UUID locationId = UUID.fromString("ffe38397-3a9d-4ca6-b06d-49303f287ba5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @param includeRecords 
     *            
     */
    public Response getTimeline(final UUID planId, final UUID timelineId, final Integer changeId, final Boolean includeRecords) {
        final UUID locationId = UUID.fromString("ffe38397-3a9d-4ca6-b06d-49303f287ba5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRecords", includeRecords); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param planId 
     *            
     */
    public List<Timeline> getTimelines(final UUID planId) {
        final UUID locationId = UUID.fromString("ffe38397-3a9d-4ca6-b06d-49303f287ba5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Timeline>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param userCapabilities 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public Response updateUserCapabilities(final HashMap<String,String> userCapabilities, final int poolId, final int agentId) {
        final UUID locationId = UUID.fromString("30ba3ada-fedf-4da8-bbb5-dacf2f82e176"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, userCapabilities, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }
}
