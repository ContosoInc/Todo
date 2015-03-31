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

    /**
     * Add Agent
     * 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @return TaskAgent
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

    /**
     * Delete Agent
     * 
     * @param poolId 
     *            
     * @param agentId 
     *            
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

    /**
     * Get Agent
     * 
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     * @return Response
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

    /**
     * Get Agents
     * 
     * @param poolId 
     *            
     * @param agentName 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     * @param demands 
     *            
     * @return List<TaskAgent>
     */
    public List<TaskAgent> getAgents(final int poolId, final String agentName, final Boolean includeCapabilities, final String propertyFilters, final String demands) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("agentName", agentName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("demands", demands); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskAgent>>() {});
    }

    /**
     * Patch Agent
     * 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent patchAgent(final TaskAgent agent, final int poolId, final int agentId) {
        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, agent, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /**
     * Put Agent
     * 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
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

    /**
     * Get TaskHelp
     * 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @return Response
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

    /**
     * Get TaskIcon
     * 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @return Response
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

    /**
     * Delete Request
     * 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
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

    /**
     * Get Request
     * 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @return TaskAgentJobRequest
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

    /**
     * Queue Request
     * 
     * @param request 
     *            
     * @param poolId 
     *            
     * @return TaskAgentJobRequest
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

    /**
     * Update Request
     * 
     * @param request 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     * @return TaskAgentJobRequest
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

    /**
     * Delete MessageAsync
     * 
     * @param poolId 
     *            
     * @param messageId 
     *            
     * @param sessionId 
     *            
     * @return Response
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

    /**
     * Get MessageAsync
     * 
     * @param poolId 
     *            
     * @param sessionId 
     *            
     * @param lastMessageId 
     *            
     * @return Response
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

    /**
     * SendMessage
     * 
     * @param message 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
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

    /**
     * This method can return any of the following depending on the parameters: packages -- list of TaskPackageMetadata that has url, type, version packages/{packageType} -- package stream OR TaskPackageMetadata if requested for json other -- BadRequest
     * 
     * @param packageType 
     *            
     * @return Response
     */
    public Response getPackage(final String packageType) {
        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Add Pool
     * 
     * @param pool 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool addPool(final TaskAgentPool pool) {
        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, pool, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /**
     * Get Pool
     * 
     * @param poolId 
     *            
     * @param properties 
     *            
     * @return Response
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

    /**
     * Get Pools
     * 
     * @param poolName 
     *            
     * @param properties 
     *            
     * @return List<TaskAgentPool>
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

    /**
     * Create Session
     * 
     * @param session 
     *            
     * @param poolId 
     *            
     * @return TaskAgentSession
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

    /**
     * Delete Session
     * 
     * @param poolId 
     *            
     * @param sessionId 
     *            
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

    /**
     * Create TaskDefinition
     * 
     * @param definition 
     *            
     * @param overwrite 
     *            
     * @return Response
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

    /**
     * Delete TaskDefinitions
     * 
     * 
     */
    public void deleteTaskDefinitions() {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Get TaskContent
     * 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @return Response
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

    /**
     * Get TaskDefinitions
     * 
     * @return List<TaskDefinition>
     */
    public List<TaskDefinition> getTaskDefinitions() {
        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TaskDefinition>>() {});
    }

    /**
     * Upload TaskContent
     * 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param overwrite 
     *            
     * @return Response
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

    /**
     * Update UserCapabilities
     * 
     * @param userCapabilities 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return Response
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
