/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.microsoft.vss.client.core.*;
import com.microsoft.vss.client.core.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.Proxy;
import com.microsoft.visualstudio.services.webapi.model.*;
public abstract class CoreHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public CoreHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** <summary>
     * 
     * </summary>
     * @param projectId 
     *            
     */
    public List<WebApiConnectedService> getConnectedServices(final String projectId) {
        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<WebApiConnectedService>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param projectId 
     *            
     * @param name 
     *            
     */
    public WebApiConnectedService getConnectedServices(final String projectId, final String name) {
        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiConnectedService.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public Response deleteIdentityMru(final IdentityData mruData, final String mruName) {
        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param mruName 
     *            
     */
    public List<IdentityRef> getIdentityMru(final String mruName) {
        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public Response patchIdentityMru(final IdentityData mruData, final String mruName) {
        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, mruData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public Response postIdentityMru(final IdentityData mruData, final String mruName) {
        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, mruData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<IdentityRef> getTeamMembers(final String projectId, final String teamId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("294c494c-2600-4d7e-b76c-3dd50c3c95be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRef>>() {});
    }

    /** <summary>
     * Get project collection with the specified id or name.
     * </summary>
     * @param collectionId 
     *            
     */
    public TeamProjectCollection getProjectCollection(final String collectionId) {
        final UUID locationId = UUID.fromString("8031090f-ef1d-4af6-85fc-698cd75d42bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("collectionId", collectionId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamProjectCollection.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TeamProjectCollectionReference> getProjectCollections(final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("8031090f-ef1d-4af6-85fc-698cd75d42bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TeamProjectCollectionReference>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param projectId 
     *            
     * @param includeCapabilities 
     *            
     * @param includeHistory 
     *            
     */
    public TeamProject getProject(final String projectId, final Boolean includeCapabilities, final Boolean includeHistory) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeHistory", includeHistory); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamProject.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param stateFilter 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (stateFilter != null)
        {
            queryParameters.addIfNotNull("stateFilter", stateFilter); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TeamProjectReference>>() {});
    }

    /** <summary>
     * Queue a project creation.
     * </summary>
     * @param projectToCreate 
     *            The project to create.
     */
    public Response queueCreateProject(final TeamProject projectToCreate) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, projectToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Queue a project deletion.
     * </summary>
     * @param projectId 
     *            The project id of the project to delete.
     */
    public Response queueDeleteProject(final UUID projectId) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Update an existing project's name, abbreviation, or description.
     * </summary>
     * @param projectUpdate 
     *            The updates for the project.
     * @param projectId 
     *            The project id of the project to update.
     */
    public TeamProject updateProject(final TeamProject projectUpdate, final UUID projectId) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, projectUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamProject.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param proxyUrl 
     *            
     */
    public List<Proxy> getProxies(final String proxyUrl) {
        final UUID locationId = UUID.fromString("ec1f4311-f2b4-4c15-b2b8-8990b80d2908"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("proxyUrl", proxyUrl); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<Proxy>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public Response getTeams(final String projectId, final String teamId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }
}
