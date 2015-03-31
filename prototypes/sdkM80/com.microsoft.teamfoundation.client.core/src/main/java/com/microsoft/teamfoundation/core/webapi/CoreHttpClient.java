package com.microsoft.teamfoundation.core.webapi;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.common.model.ProjectState;
import com.microsoft.teamfoundation.core.webapi.model.TeamProject;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.vss.client.core.utils.ArgumentUtility;

public class CoreHttpClient
    extends CoreHttpClientBase {

    public CoreHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
     * Get TeamProject
     * @param projectId
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId) {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, null, null);
    }

    /**
     * Get TeamProject
     * @param projectId
     * @param includeCapabilities
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId, final boolean includeCapabilities) {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, includeCapabilities, null);
    }

    /**
     * Get TeamProject
     * @param projectId
     * @param includeCapabilities
     * @param includeHistory
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId, final boolean includeCapabilities,
        final boolean includeHistory) {
        ArgumentUtility.checkStringForNullOrEmpty(projectId, "projectId", true); //$NON-NLS-1$
        return super.getProject(projectId, includeCapabilities, includeHistory);
    }

    /**
     * Get TeamProjects
     * @return List<TeamProjectReference>
     */
    public List<TeamProjectReference> getProjects() {
        return super.getProjects(null, null, null);
    }

    /**
     * Get TeamProjects
     * @param stateFilter
     * @return List<TeamProjectReference>
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter) {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, null, null);
    }

    /**
     * Get TeamProjects
     * @param stateFilter
     * @param top
     * @return List<TeamProjectReference>
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final int top) {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, top, null);
    }

    /**
     * Get TeamProjects
     * @param stateFilter
     * @param top
     * @param skip
     * @return List<TeamProjectReference>
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final int top, final int skip) {
        ArgumentUtility.checkForNull(stateFilter, "stateFilter"); //$NON-NLS-1$
        return super.getProjects(stateFilter, top, skip);
    }
}
