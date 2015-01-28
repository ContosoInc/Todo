package com.microsoft.vss.client.project;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import com.microsoft.vss.client.core.CoreConstants;
import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.core.model.NameValueCollection;
import com.microsoft.vss.client.core.model.OperationReference;
import com.microsoft.vss.client.core.model.TeamProject;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.serialization.TeamProjectReferences;

public class ProjectHttpClient
    extends VssHttpClientBase {

    private final static ApiResourceVersion API_VERSION = new ApiResourceVersion(1, 0, 2);
    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS =
        new HashMap<String, Class<? extends Exception>>();

    public ProjectHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /**
     * Get project with the specified id or name.
     * 
     * @param projectId
     *            The name or id of the project.
     * @return
     */
    public TeamProject getProject(String projectId) {
        return getProject(projectId, null, false);
    }

    /**
     * Get project with the specified id or name, optionally including
     * capabilities.
     * 
     * @param projectId
     *            The name or id of the project.
     * @param includeCapabilities
     *            Include capabilities (such as source control) in the team
     *            project result.
     * @return
     */
    public TeamProject getProject(String projectId, boolean includeCapabilities) {
        return getProject(projectId, (Boolean) includeCapabilities, (Boolean) false);
    }

    /**
     * Get project with the specified id or name, optionally including
     * capabilities.
     * 
     * @param projectId
     *            The name or id of the project.
     * @param includeCapabilities
     *            Include capabilities (such as source control) in the team
     *            project result.
     * @param includeHistory
     *            Search within renamed projects (that had such name in the
     *            past).
     * @return
     */
    public TeamProject getProject(String projectId, boolean includeCapabilities, boolean includeHistory) {
        return getProject(projectId, (Boolean) includeCapabilities, (Boolean) includeHistory);
    }

    private TeamProject getProject(String projectId, Boolean includeCapabilities, Boolean includeHistory) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull(QueryParamConstants.IncludeCapabilities, includeCapabilities);
        queryParameters.addIfNotNull(QueryParamConstants.IncludeHistory, includeHistory);

        return super.get(CoreConstants.ProjectsLocationId, routeValues, API_VERSION, queryParameters, TeamProject.class);
    }

    /**
     * Get all projects
     */
    public List<TeamProjectReference> getProjects() {
        return getProjects(null);
    }

    /**
     * Get projects with the specified state.
     * 
     * @param stateFilter
     *            Filter on team projects in a specific team project state.
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter) {
        return getProjects(stateFilter, null, null);
    }

    /**
     * Get projects with the specified state.
     * 
     * @param stateFilter
     *            Filter on team projects in a specific team project state.
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, int top, int skip) {
        return getProjects(stateFilter, (Integer) top, (Integer) skip);
    }

    private List<TeamProjectReference> getProjects(final ProjectState stateFilter, Number top, Number skip) {
        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull(QueryParamConstants.StateFilter, stateFilter);
        queryParameters.addIfNotNull(QueryParamConstants.Top, top);
        queryParameters.addIfNotNull(QueryParamConstants.Skip, skip);

        final TeamProjectReferences result =
            super.get(CoreConstants.ProjectsLocationId, API_VERSION, queryParameters, TeamProjectReferences.class);

        return result.getValue();
    }

    /**
     * Queue a project creation with a specific Name, Abbreviation,
     * Capabilities.VersionControl, Capabilities.ProcessTemplate, and optionally
     * Description.
     * 
     * @param projectToCreate
     *            The project to create.
     * @return Reference to the create operation.
     */
    public OperationReference queueCreateProject(final TeamProject projectToCreate) {
        return super.post(projectToCreate, CoreConstants.ProjectsLocationId, API_VERSION, OperationReference.class);
    }

    /**
     * Queue a project deletion.
     * 
     * @param projectId
     *            The project id of the project to delete.
     * @return Reference to the create operation.
     */
    public OperationReference queueDeleteProject(final UUID projectId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Response response = super.delete(CoreConstants.ProjectsLocationId, routeValues, API_VERSION);

        return response.readEntity(OperationReference.class);
    }

    /**
     * Queue a project deletion.
     * 
     * @param projectToUpdateId
     *            The project id of the project to delete.
     * @return Reference to the create operation.
     */
    public TeamProject updateProject(final UUID projectToUpdateId, final TeamProject projectUpdate) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectToUpdateId); //$NON-NLS-1$

        return super.patch(projectUpdate, CoreConstants.ProjectsLocationId, routeValues, API_VERSION, TeamProject.class);
    }
}
