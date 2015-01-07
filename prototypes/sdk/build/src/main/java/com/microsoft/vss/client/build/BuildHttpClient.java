package com.microsoft.vss.client.build;

import java.net.URI;
import java.nio.file.AccessDeniedException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import com.microsoft.vss.client.build.exception.BuildAgentDeletionException;
import com.microsoft.vss.client.build.exception.BuildAgentNotFoundException;
import com.microsoft.vss.client.build.exception.BuildAgentUpdateException;
import com.microsoft.vss.client.build.exception.BuildControllerDeletionException;
import com.microsoft.vss.client.build.exception.BuildControllerNotFoundException;
import com.microsoft.vss.client.build.exception.BuildControllerUpdateException;
import com.microsoft.vss.client.build.exception.BuildDefinitionDisabledException;
import com.microsoft.vss.client.build.exception.BuildDefinitionDoesNotExistException;
import com.microsoft.vss.client.build.exception.BuildNotFoundException;
import com.microsoft.vss.client.build.exception.BuildProcessTemplateDeletionException;
import com.microsoft.vss.client.build.exception.BuildProcessTemplateNotFoundException;
import com.microsoft.vss.client.build.exception.BuildRequestNotFoundException;
import com.microsoft.vss.client.build.exception.BuildRequestPropertyInvalidException;
import com.microsoft.vss.client.build.exception.BuildRequestUpdateException;
import com.microsoft.vss.client.build.exception.BuildRequestValidationFailedException;
import com.microsoft.vss.client.build.exception.BuildServerNotFoundException;
import com.microsoft.vss.client.build.exception.CannotDeleteDefinitionBuildExistsException;
import com.microsoft.vss.client.build.exception.DefinitionNotFoundException;
import com.microsoft.vss.client.build.model.Build;
import com.microsoft.vss.client.build.model.BuildDefinition;
import com.microsoft.vss.client.build.model.BuildDefinitions;
import com.microsoft.vss.client.build.model.Builds;
import com.microsoft.vss.client.build.model.enumeration.BuildReason;
import com.microsoft.vss.client.build.model.enumeration.BuildResult;
import com.microsoft.vss.client.build.model.enumeration.BuildStatus;
import com.microsoft.vss.client.core.StringUtil;
import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;

public class BuildHttpClient
    extends VssHttpClientBase {

    private final static ApiResourceVersion API_VERSION = new ApiResourceVersion(2, 0, 2);
    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    private final static String externalizedStringSample = Messages.getString("BuildHttpClient.SampleMessage"); //$NON-NLS-1$
    private final static String externalizedFormattedStringSample = MessageFormat.format(
        Messages.getString("BuildHttpClient.SampleFormat"), " "); //$NON-NLS-1$ //$NON-NLS-2$

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
        TRANSLATED_EXCEPTIONS.put("BuildNotFoundException", BuildNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildRequestNotFoundException", BuildRequestNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildDefinitionDoesNotExistException", BuildDefinitionDoesNotExistException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildDefinitionDisabledException", BuildDefinitionDisabledException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildRequestUpdateException", BuildRequestUpdateException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildRequestPropertyInvalidException", BuildRequestPropertyInvalidException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("DefinitionNotFoundException", DefinitionNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildControllerNotFoundException", BuildControllerNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildControllerDeletionException", BuildControllerDeletionException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildControllerUpdateException", BuildControllerUpdateException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildAgentNotFoundException", BuildAgentNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildAgentDeletionException", BuildAgentDeletionException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildAgentUpdateException", BuildAgentUpdateException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildServerNotFoundException", BuildServerNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("CannotDeleteDefinitionBuildExistsException", //$NON-NLS-1$
            CannotDeleteDefinitionBuildExistsException.class);
        TRANSLATED_EXCEPTIONS.put("BuildProcessTemplateNotFoundException", BuildProcessTemplateNotFoundException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("BuildProcessTemplateDeletionException", BuildProcessTemplateDeletionException.class); //$NON-NLS-1$
        TRANSLATED_EXCEPTIONS.put("AccessDeniedException", AccessDeniedException.class); //$NON-NLS-1$
    }

    protected BuildHttpClient(final Client rsClient, final URI baseUrl) {
        super(rsClient, baseUrl);
    }

    public BuildDefinition AddDefinition(final BuildDefinition definition) {
        return super.post(definition, BuildResourceIds.Definitions, API_VERSION, BuildDefinition.class);
    }

    public BuildDefinition getDefinition(final UUID projectId, final int definitionId) {
        return getDefinition(projectId, definitionId, null);
    }

    public BuildDefinition getDefinition(final UUID projectId, final int definitionId, final int revision) {
        return getDefinition(projectId, (Integer) definitionId, (Integer) revision);
    }

    private BuildDefinition getDefinition(final UUID projectId, final Number definitionId, final Number revision) {

        final Map<String, Object> routeValues = new HashMap<String, Object>() {
            {
                put("definitionId", definitionId.intValue()); //$NON-NLS-1$
            }
        };

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("project", projectId.toString()); //$NON-NLS-1$
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$

        return super.get(BuildResourceIds.Definitions, routeValues, API_VERSION, queryParameters, BuildDefinition.class);
    }

    public BuildDefinitions getDefinitions(final UUID projectId) {
        return getDefinitions(projectId, "*"); //$NON-NLS-1$
    }

    public BuildDefinitions getDefinitions(final UUID projectId, final String name) {

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("project", projectId.toString()); //$NON-NLS-1$

        if (!StringUtil.isNullOrEmpty(name) && name != "*") { //$NON-NLS-1$
            queryParameters.put("name", name); //$NON-NLS-1$
        }
        return super.get(BuildResourceIds.Definitions, API_VERSION, queryParameters, BuildDefinitions.class);
    }

    public BuildDefinition updateDefinition(final BuildDefinition definition) {
        final Map<String, Object> routeValues = new HashMap<String, Object>() {
            {
                put("definitionId", definition); //$NON-NLS-1$
            }
        };
        return super.put(definition, BuildResourceIds.Definitions, routeValues, API_VERSION, BuildDefinition.class);
    }

    public Build getBuild(final int buildId, final List<String> propertyFilters) {
        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>() {
            {
                put("buildId", buildId); //$NON-NLS-1$
            }
        };
        return super.get(BuildResourceIds.Builds, routeValues, API_VERSION, queryParameters, Build.class);
    }

    public Builds getBuilds(final UUID projectId, final List<Integer> definitionIds, final List<Integer> queueIds,
        final String buildNumber, final Date minFinishTime, final Date maxFinishTime, final String requestedFor,
        final BuildReason reasonFilter, final BuildStatus statusFilter, final BuildResult resultFilter,
        final List<String> propertyFilters, final List<String> tagFilters, final Integer maxBuilds) {

        final NameValueCollection queryParameters = new NameValueCollection() {
            {
                put("project", projectId.toString()); //$NON-NLS-1$
            }
        };

        queryParameters.addIfNotEmpty("definitions", definitionIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("queues", queueIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("tagFilters", tagFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", maxBuilds); //$NON-NLS-1$

        return super.get(BuildResourceIds.Builds, API_VERSION, queryParameters, Builds.class);
    }

    public Build queueBuild(final Build build) {
        return queueBuild(build, false);
    }

    public Build queueBuild(final Build build, final boolean ignoreWarnings) {

        final NameValueCollection queryParameters = new NameValueCollection();

        if (ignoreWarnings) {
            queryParameters.put("ignoreWarnings", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        final Response response = super.post(build, BuildResourceIds.Builds, null, API_VERSION, queryParameters);

        if (response.getStatusInfo() == Response.Status.CONFLICT) {
            final BuildRequestValidationFailedException validationException =
                response.readEntity(BuildRequestValidationFailedException.class);
            throw validationException;
        } else {
            super.handleResponse(response);
            return response.readEntity(Build.class);
        }
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

}
