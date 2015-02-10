/*
 * --------------------------------------------------------- Copyright(C)
 * Microsoft Corporation. All rights reserved.
 * ---------------------------------------------------------
 * 
 * --------------------------------------------------------- Generated file, DO
 * NOT EDIT ---------------------------------------------------------
 */
package com.microsoft.teamfoundation.build.webapi;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.microsoft.teamfoundation.build.webapi.model.AgentPoolQueue;
import com.microsoft.teamfoundation.build.webapi.model.Build;
import com.microsoft.teamfoundation.build.webapi.model.BuildArtifact;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinition;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionReference;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionRevision;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionTemplate;
import com.microsoft.teamfoundation.build.webapi.model.BuildOptionDefinition;
import com.microsoft.teamfoundation.build.webapi.model.BuildReason;
import com.microsoft.teamfoundation.build.webapi.model.BuildResult;
import com.microsoft.teamfoundation.build.webapi.model.BuildSettings;
import com.microsoft.teamfoundation.build.webapi.model.BuildStatus;
import com.microsoft.teamfoundation.build.webapi.model.Change;
import com.microsoft.visualstudio.services.forminput.model.InputValuesQuery;
import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.core.model.NameValueCollection;

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
     * <summary> Associates an artifact with a build </summary>
     * @param artifact
     * 
     * @param buildId
     * 
     */
    public BuildArtifact createArtifact(final BuildArtifact artifact, final int buildId) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, artifact, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /**
     * <summary> Gets artifacts, optionally filtered by name </summary>
     * @param buildId
     * 
     * @param artifactName
     * 
     */
    public List<BuildArtifact> getArtifacts(final int buildId, final String artifactName) {
        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("artifactName", artifactName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildArtifact>>() {});
    }

    /**
     * <summary> Deletes a build </summary>
     * @param buildId
     * 
     */
    public void deleteBuild(final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Deletes a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     */
    public void deleteBuild(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Deletes a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     */
    public void deleteBuild(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Gets a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     * @param propertyFilters
     *            A comma-delimited list of properties to include in the results
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
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Gets a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     * @param propertyFilters
     *            A comma-delimited list of properties to include in the results
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
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Gets a build </summary>
     * @param buildId
     * 
     * @param propertyFilters
     *            A comma-delimited list of properties to include in the results
     */
    public Build getBuild(final int buildId, final String propertyFilters) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary>
     * 
     * </summary>
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
     */
    public List<Build> getBuilds(final String project, final List<Integer> definitions, final List<Integer> queues,
        final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor,
        final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter,
        final List<String> tagFilters, final List<String> propertyFilters, final Integer top,
        final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null) {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null) {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null) {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null) {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null) {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null) {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null) {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null) {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null) {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
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
     */
    public List<Build> getBuilds(final UUID project, final List<Integer> definitions, final List<Integer> queues,
        final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor,
        final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter,
        final List<String> tagFilters, final List<String> propertyFilters, final Integer top,
        final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null) {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null) {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null) {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null) {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null) {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null) {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null) {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null) {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null) {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
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
     */
    public List<Build> getBuilds(final List<Integer> definitions, final List<Integer> queues, final String buildNumber,
        final Date minFinishTime, final Date maxFinishTime, final String requestedFor, final BuildReason reasonFilter,
        final BuildStatus statusFilter, final BuildResult resultFilter, final List<String> tagFilters,
        final List<String> propertyFilters, final Integer top, final String continuationToken) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (definitions != null) {
            queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        }
        if (queues != null) {
            queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        if (minFinishTime != null) {
            queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        }
        if (maxFinishTime != null) {
            queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        }
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        if (reasonFilter != null) {
            queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        }
        if (statusFilter != null) {
            queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        }
        if (resultFilter != null) {
            queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        }
        if (tagFilters != null) {
            queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        }
        if (propertyFilters != null) {
            queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Build>>() {});
    }

    /**
     * <summary> Queues a build </summary>
     * @param build
     * 
     * @param ignoreWarnings
     * 
     */
    public Build queueBuild(final Build build, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, apiVersion, build, APPLICATION_JSON_TYPE, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Queues a build </summary>
     * @param build
     * 
     * @param project
     *            Project ID or project name
     * @param ignoreWarnings
     * 
     */
    public Build queueBuild(final Build build, final String project, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, build, APPLICATION_JSON_TYPE,
                queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Queues a build </summary>
     * @param build
     * 
     * @param project
     *            Project ID
     * @param ignoreWarnings
     * 
     */
    public Build queueBuild(final Build build, final UUID project, final Boolean ignoreWarnings) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, build, APPLICATION_JSON_TYPE,
                queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Updates a build </summary>
     * @param build
     * 
     * @param buildId
     * 
     */
    public Build updateBuild(final Build build, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, apiVersion, build, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Updates a build </summary>
     * @param build
     * 
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     */
    public Build updateBuild(final Build build, final String project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, apiVersion, build, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Updates a build </summary>
     * @param build
     * 
     * @param project
     *            Project ID
     * @param buildId
     * 
     */
    public Build updateBuild(final Build build, final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, apiVersion, build, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /**
     * <summary> Gets the changes associated with a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     * @param top
     *            The maximum number of changes to return
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
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Change>>() {});
    }

    /**
     * <summary> Gets the changes associated with a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     * @param top
     *            The maximum number of changes to return
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
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Change>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param definition
     * 
     * @param definitionToCloneId
     * 
     * @param definitionToCloneRevision
     * 
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final Integer definitionToCloneId,
        final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, apiVersion, definition, APPLICATION_JSON_TYPE,
                queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param definition
     * 
     * @param project
     *            Project ID or project name
     * @param definitionToCloneId
     * 
     * @param definitionToCloneRevision
     * 
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final String project,
        final Integer definitionToCloneId, final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, definition,
                APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param definition
     * 
     * @param project
     *            Project ID
     * @param definitionToCloneId
     * 
     * @param definitionToCloneRevision
     * 
     */
    public BuildDefinition addDefinition(final BuildDefinition definition, final UUID project,
        final Integer definitionToCloneId, final Integer definitionToCloneRevision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, definition,
                APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary> Deletes a definition </summary>
     * @param definitionId
     * 
     */
    public void deleteDefinition(final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Deletes a definition </summary>
     * @param project
     *            Project ID or project name
     * @param definitionId
     * 
     */
    public void deleteDefinition(final String project, final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Deletes a definition </summary>
     * @param project
     *            Project ID
     * @param definitionId
     * 
     */
    public void deleteDefinition(final UUID project, final int definitionId) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param project
     *            Project ID or project name
     * @param definitionId
     * 
     * @param revision
     * 
     */
    public BuildDefinition getDefinition(final String project, final int definitionId, final Integer revision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param project
     *            Project ID
     * @param definitionId
     * 
     * @param revision
     * 
     */
    public BuildDefinition getDefinition(final UUID project, final int definitionId, final Integer revision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param definitionId
     * 
     * @param revision
     * 
     */
    public BuildDefinition getDefinition(final int definitionId, final Integer revision) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary> Gets definitions, optionally filtered by name </summary>
     * @param project
     *            Project ID or project name
     * @param name
     * 
     */
    public List<BuildDefinitionReference> getDefinitions(final String project, final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * <summary> Gets definitions, optionally filtered by name </summary>
     * @param project
     *            Project ID
     * @param name
     * 
     */
    public List<BuildDefinitionReference> getDefinitions(final UUID project, final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, queryParameters,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * <summary> Gets definitions, optionally filtered by name </summary>
     * @param name
     * 
     */
    public List<BuildDefinitionReference> getDefinitions(final String name) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionReference>>() {});
    }

    /**
     * <summary> Updates an existing definition </summary>
     * @param definition
     * 
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, apiVersion, definition, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary> Updates an existing definition </summary>
     * @param definition
     * 
     * @param project
     *            Project ID or project name
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition, final String project) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, definition, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary> Updates an existing definition </summary>
     * @param definition
     * 
     * @param project
     *            Project ID
     */
    public BuildDefinition updateDefinition(final BuildDefinition definition, final UUID project) {
        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, definition, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param inputValuesQuery
     * 
     * @param project
     *            Project ID or project name
     */
    public Response postInputValuesQuery(final InputValuesQuery inputValuesQuery, final String project) {
        final UUID locationId = UUID.fromString("2182a7f0-b363-4b2d-b89e-ed0a0b721e95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, inputValuesQuery,
                APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param inputValuesQuery
     * 
     * @param project
     *            Project ID
     */
    public Response postInputValuesQuery(final InputValuesQuery inputValuesQuery, final UUID project) {
        final UUID locationId = UUID.fromString("2182a7f0-b363-4b2d-b89e-ed0a0b721e95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, apiVersion, inputValuesQuery,
                APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * <summary> Gets logs for a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     */
    public Response getBuildLogs(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * <summary> Gets logs for a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     */
    public Response getBuildLogs(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /**
     * <summary>
     * 
     * </summary>
     */
    public List<BuildOptionDefinition> getBuildOptionDefinitions() {
        final UUID locationId = UUID.fromString("591cb5a4-2d46-4f3a-a697-5cd42b6bd332"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildOptionDefinition>>() {});
    }

    /**
     * <summary> Creates a build queue </summary>
     * @param queue
     * 
     */
    public AgentPoolQueue createQueue(final AgentPoolQueue queue) {
        final UUID locationId = UUID.fromString("09f2a4b8-08c9-4991-85c3-d698937568be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, apiVersion, queue, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AgentPoolQueue.class);
    }

    /**
     * <summary> Gets queues, optionally filtered by name </summary>
     * @param name
     * 
     */
    public List<AgentPoolQueue> getQueues(final String name) {
        final UUID locationId = UUID.fromString("09f2a4b8-08c9-4991-85c3-d698937568be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AgentPoolQueue>>() {});
    }

    /**
     * <summary> Gets revisions of a definition </summary>
     * @param project
     *            Project ID or project name
     * @param definitionId
     * 
     */
    public List<BuildDefinitionRevision> getDefinitionRevisions(final String project, final int definitionId) {
        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionRevision>>() {});
    }

    /**
     * <summary> Gets revisions of a definition </summary>
     * @param project
     *            Project ID
     * @param definitionId
     * 
     */
    public List<BuildDefinitionRevision> getDefinitionRevisions(final UUID project, final int definitionId) {
        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<BuildDefinitionRevision>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
     */
    public BuildSettings getBuildSettings() {
        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /**
     * <summary> Updates the build settings </summary>
     * @param settings
     * 
     */
    public BuildSettings updateBuildSettings(final BuildSettings settings) {
        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, apiVersion, settings, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /**
     * <summary> Adds a tag to a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     * @param tag
     * 
     */
    public List<String> addBuildTag(final String project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Adds a tag to a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     * @param tag
     * 
     */
    public List<String> addBuildTag(final UUID project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Deletes a tag from a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     * @param tag
     * 
     */
    public List<String> deleteBuildTag(final String project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Deletes a tag from a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     * @param tag
     * 
     */
    public List<String> deleteBuildTag(final UUID project, final int buildId, final String tag) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Gets the tags for a build </summary>
     * @param project
     *            Project ID or project name
     * @param buildId
     * 
     */
    public List<String> getBuildTags(final String project, final int buildId) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Gets the tags for a build </summary>
     * @param project
     *            Project ID
     * @param buildId
     * 
     */
    public List<String> getBuildTags(final UUID project, final int buildId) {
        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param project
     *            Project ID or project name
     */
    public List<String> getTags(final String project) {
        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary>
     * 
     * </summary>
     * @param project
     *            Project ID
     */
    public List<String> getTags(final UUID project) {
        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<String>>() {});
    }

    /**
     * <summary> Deletes a definition template </summary>
     * @param project
     *            Project ID or project name
     * @param templateId
     * 
     */
    public void deleteTemplate(final String project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Deletes a definition template </summary>
     * @param project
     *            Project ID
     * @param templateId
     * 
     */
    public void deleteTemplate(final UUID project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /**
     * <summary> Gets definition templates, optionally filtered by id </summary>
     * @param project
     *            Project ID or project name
     * @param templateId
     * 
     */
    public BuildDefinitionTemplate getTemplate(final String project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * <summary> Gets definition templates, optionally filtered by id </summary>
     * @param project
     *            Project ID
     * @param templateId
     * 
     */
    public BuildDefinitionTemplate getTemplate(final UUID project, final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * <summary> Saves a definition template </summary>
     * @param template
     * 
     * @param project
     *            Project ID or project name
     * @param templateId
     * 
     */
    public BuildDefinitionTemplate saveTemplate(final BuildDefinitionTemplate template, final String project,
        final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, template, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /**
     * <summary> Saves a definition template </summary>
     * @param template
     * 
     * @param project
     *            Project ID
     * @param templateId
     * 
     */
    public BuildDefinitionTemplate saveTemplate(final BuildDefinitionTemplate template, final UUID project,
        final String templateId) {
        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, apiVersion, template, APPLICATION_JSON_TYPE,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }
}
