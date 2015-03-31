/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.microsoft.vss.client.core.*;
import com.microsoft.vss.client.core.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
public abstract class BuildHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public BuildHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /**
     * Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(final BuildArtifact artifact, final int buildId) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, artifact, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /**
     * Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(final BuildArtifact artifact, final String project, final int buildId) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, artifact, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /**
     * Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(final BuildArtifact artifact, final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, artifact, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /**
     * Gets artifacts, optionally filtered by name
     * 
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return List<BuildArtifact>
     */
    public List<BuildArtifact> getArtifacts(final int buildId, final String artifactName) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("artifactName", artifactName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildArtifact>>() {});
    }

    /**
     * Gets artifacts, optionally filtered by name
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return List<BuildArtifact>
     */
    public List<BuildArtifact> getArtifacts(final String project, final int buildId, final String artifactName) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("artifactName", artifactName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildArtifact>>() {});
    }

    /**
     * Gets artifacts, optionally filtered by name
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return List<BuildArtifact>
     */
    public List<BuildArtifact> getArtifacts(final UUID project, final int buildId, final String artifactName) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("artifactName", artifactName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildArtifact>>() {});
    }

    /**
     * Get Badge
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param branchName 
     *            
     * @return Response
     */
    public Response getBadge(final String project, final int definitionId, final String branchName) {
        final UUID locationId = UUID.fromString("de6a4df8-22cd-44ee-af2d-39f6aa7a4261"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Get Badge
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param branchName 
     *            
     * @return Response
     */
    public Response getBadge(final UUID project, final int definitionId, final String branchName) {
        final UUID locationId = UUID.fromString("de6a4df8-22cd-44ee-af2d-39f6aa7a4261"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Deletes a build
     * 
     * @param buildId 
     *            
     * 
     */
    public void deleteBuild(final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Deletes a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * 
     */
    public void deleteBuild(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Deletes a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * 
     */
    public void deleteBuild(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Gets a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(final String project, final int buildId, final String propertyFilters) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Gets a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(final UUID project, final int buildId, final String propertyFilters) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Gets a build
     * 
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(final int buildId, final String propertyFilters) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Get Builds
     * 
     * @param project 
     *            Project ID or project name
     * @param definitions 
     *            
     * @param queues 
     *            
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            
     * @param propertyFilters 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @return List<Build>
     */
    public List<Build> getBuilds(final String project, final List<Integer> definitions, final List<Integer> queues, final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor, final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter, final List<String> tagFilters, final List<String> propertyFilters, final Integer top, final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null)
        {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null)
        {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null)
        {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null)
        {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null)
        {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null)
        {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null)
        {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null)
        {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * Get Builds
     * 
     * @param project 
     *            Project ID
     * @param definitions 
     *            
     * @param queues 
     *            
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            
     * @param propertyFilters 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @return List<Build>
     */
    public List<Build> getBuilds(final UUID project, final List<Integer> definitions, final List<Integer> queues, final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor, final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter, final List<String> tagFilters, final List<String> propertyFilters, final Integer top, final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null)
        {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null)
        {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null)
        {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null)
        {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null)
        {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null)
        {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null)
        {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null)
        {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * Get Builds
     * 
     * @param definitions 
     *            
     * @param queues 
     *            
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            
     * @param propertyFilters 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @return List<Build>
     */
    public List<Build> getBuilds(final List<Integer> definitions, final List<Integer> queues, final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor, final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter, final List<String> tagFilters, final List<String> propertyFilters, final Integer top, final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null)
        {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null)
        {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null)
        {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null)
        {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null)
        {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null)
        {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null)
        {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null)
        {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * Queues a build
     * 
     * @param build 
     *            
     * @param ignoreWarnings 
     *            
     * @return Build
     */
    public Build queueBuild(final Build build, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, build, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Queues a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID or project name
     * @param ignoreWarnings 
     *            
     * @return Build
     */
    public Build queueBuild(final Build build, final String project, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, build, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Queues a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID
     * @param ignoreWarnings 
     *            
     * @return Build
     */
    public Build queueBuild(final Build build, final UUID project, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, build, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Updates a build
     * 
     * @param build 
     *            
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(final Build build, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, build, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Updates a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(final Build build, final String project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, build, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Updates a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(final Build build, final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, build, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * Gets the changes associated with a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @return List<Change>
     */
    public List<Change> getBuildCommits(final String project, final int buildId, final Integer top) {
        final UUID locationId = UUID.fromString("54572c7b-bbd3-45d4-80dc-28be08941620"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Change>>() {});
    }

    /**
     * Gets the changes associated with a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @return List<Change>
     */
    public List<Change> getBuildCommits(final UUID project, final int buildId, final Integer top) {
        final UUID locationId = UUID.fromString("54572c7b-bbd3-45d4-80dc-28be08941620"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Change>>() {});
    }

    /**
     * Add Definition
     * 
     * @param definition 
     *            
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final Integer definitionToCloneId, final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Add Definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final String project, final Integer definitionToCloneId, final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Add Definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final UUID project, final Integer definitionToCloneId, final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Deletes a definition
     * 
     * @param definitionId 
     *            
     * 
     */
    public void deleteDefinition(final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Deletes a definition
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * 
     */
    public void deleteDefinition(final String project, final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Deletes a definition
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * 
     */
    public void deleteDefinition(final UUID project, final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Get Definition
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(final String project, final int definitionId, final Integer revision, final List<String> propertyFilters) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Get Definition
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(final UUID project, final int definitionId, final Integer revision, final List<String> propertyFilters) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Get Definition
     * 
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(final int definitionId, final Integer revision, final List<String> propertyFilters) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        if (propertyFilters != null)
        {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Gets definitions, optionally filtered by name
     * 
     * @param project 
     *            Project ID or project name
     * @param name 
     *            
     * @return List<BuildDefinitionReference>
     */
    public List<BuildDefinitionReference> getDefinitions(final String project, final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * Gets definitions, optionally filtered by name
     * 
     * @param project 
     *            Project ID
     * @param name 
     *            
     * @return List<BuildDefinitionReference>
     */
    public List<BuildDefinitionReference> getDefinitions(final UUID project, final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * Gets definitions, optionally filtered by name
     * 
     * @param name 
     *            
     * @return List<BuildDefinitionReference>
     */
    public List<BuildDefinitionReference> getDefinitions(final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * Updates an existing definition
     * 
     * @param definition 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Updates an existing definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition, final String project) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Updates an existing definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition, final UUID project) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, definition, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * Post InputValuesQuery
     * 
     * @param inputValuesQuery 
     *            
     * @param project 
     *            Project ID or project name
     * @return Response
     */
    public Response postInputValuesQuery(final InputValuesQuery inputValuesQuery, final String project) {
        final UUID locationId = UUID.fromString("2182a7f0-b363-4b2d-b89e-ed0a0b721e95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, inputValuesQuery, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Post InputValuesQuery
     * 
     * @param inputValuesQuery 
     *            
     * @param project 
     *            Project ID
     * @return Response
     */
    public Response postInputValuesQuery(final InputValuesQuery inputValuesQuery, final UUID project) {
        final UUID locationId = UUID.fromString("2182a7f0-b363-4b2d-b89e-ed0a0b721e95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, inputValuesQuery, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Gets logs for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return Response
     */
    public Response getBuildLogs(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Gets logs for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return Response
     */
    public Response getBuildLogs(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * Get BuildOptionDefinitions
     * 
     * @return List<BuildOptionDefinition>
     */
    public List<BuildOptionDefinition> getBuildOptionDefinitions() {
        final UUID locationId = UUID.fromString("591cb5a4-2d46-4f3a-a697-5cd42b6bd332"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildOptionDefinition>>() {});
    }

    /**
     * Creates a build queue
     * 
     * @param queue 
     *            
     * @return AgentPoolQueue
     */
    public AgentPoolQueue createQueue(final AgentPoolQueue queue) {
        final UUID locationId = UUID.fromString("09f2a4b8-08c9-4991-85c3-d698937568be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, queue, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AgentPoolQueue.class);
    }

    /**
     * Gets queues, optionally filtered by name
     * 
     * @param name 
     *            
     * @return List<AgentPoolQueue>
     */
    public List<AgentPoolQueue> getQueues(final String name) {
        final UUID locationId = UUID.fromString("09f2a4b8-08c9-4991-85c3-d698937568be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AgentPoolQueue>>() {});
    }

    /**
     * Gets revisions of a definition
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @return List<BuildDefinitionRevision>
     */
    public List<BuildDefinitionRevision> getDefinitionRevisions(final String project, final int definitionId) {
        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionRevision>>() {});
    }

    /**
     * Gets revisions of a definition
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @return List<BuildDefinitionRevision>
     */
    public List<BuildDefinitionRevision> getDefinitionRevisions(final UUID project, final int definitionId) {
        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionRevision>>() {});
    }

    /**
     * Get BuildSettings
     * 
     * @return BuildSettings
     */
    public BuildSettings getBuildSettings() {
        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /**
     * Updates the build settings
     * 
     * @param settings 
     *            
     * @return BuildSettings
     */
    public BuildSettings updateBuildSettings(final BuildSettings settings) {
        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, 
                                apiVersion, settings, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /**
     * Adds a tag to a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return List<String>
     */
    public List<String> addBuildTag(final String project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Adds a tag to a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return List<String>
     */
    public List<String> addBuildTag(final UUID project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Deletes a tag from a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return List<String>
     */
    public List<String> deleteBuildTag(final String project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Deletes a tag from a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return List<String>
     */
    public List<String> deleteBuildTag(final UUID project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Gets the tags for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return List<String>
     */
    public List<String> getBuildTags(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Gets the tags for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return List<String>
     */
    public List<String> getBuildTags(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Get Tags
     * 
     * @param project 
     *            Project ID or project name
     * @return List<String>
     */
    public List<String> getTags(final String project) {
        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Get Tags
     * 
     * @param project 
     *            Project ID
     * @return List<String>
     */
    public List<String> getTags(final UUID project) {
        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * Deletes a definition template
     * 
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * 
     */
    public void deleteTemplate(final String project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Deletes a definition template
     * 
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * 
     */
    public void deleteTemplate(final UUID project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * Gets definition template filtered by id
     * 
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate getTemplate(final String project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * Gets definition template filtered by id
     * 
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate getTemplate(final UUID project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * Get Templates
     * 
     * @param project 
     *            Project ID or project name
     * @return List<BuildDefinitionTemplate>
     */
    public List<BuildDefinitionTemplate> getTemplates(final String project) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionTemplate>>() {});
    }

    /**
     * Get Templates
     * 
     * @param project 
     *            Project ID
     * @return List<BuildDefinitionTemplate>
     */
    public List<BuildDefinitionTemplate> getTemplates(final UUID project) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionTemplate>>() {});
    }

    /**
     * Saves a definition template
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate saveTemplate(final BuildDefinitionTemplate template, final String project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, template, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * Saves a definition template
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate saveTemplate(final BuildDefinitionTemplate template, final UUID project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, template, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }
}
