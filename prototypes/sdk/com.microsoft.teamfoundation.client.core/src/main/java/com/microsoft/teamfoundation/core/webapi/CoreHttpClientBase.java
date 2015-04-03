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

package com.microsoft.teamfoundation.core.webapi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.core.model.NameValueCollection;
import com.microsoft.teamfoundation.common.model.ProjectState;
import com.microsoft.teamfoundation.core.webapi.model.ConnectedServiceKind;
import com.microsoft.teamfoundation.core.webapi.model.IdentityData;
import com.microsoft.teamfoundation.core.webapi.model.Proxy;
import com.microsoft.teamfoundation.core.webapi.model.TeamProject;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectCollection;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectCollectionReference;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.teamfoundation.core.webapi.model.WebApiConnectedService;
import com.microsoft.teamfoundation.core.webapi.model.WebApiConnectedServiceDetails;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.net.URI;
public abstract class CoreHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of CoreHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    public CoreHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * @param connectedServiceCreationData 
     *            
     * @param projectId 
     *            
     * @return WebApiConnectedService
     */
    public WebApiConnectedService createConnectedService(final WebApiConnectedServiceDetails connectedServiceCreationData, final String projectId) {
        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, connectedServiceCreationData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiConnectedService.class);
    }

    /** 
     * @param projectId 
     *            
     * @param name 
     *            
     * @return WebApiConnectedServiceDetails
     */
    public WebApiConnectedServiceDetails getConnectedServiceDetails(final String projectId, final String name) {
        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiConnectedServiceDetails.class);
    }

    /** 
     * @param projectId 
     *            
     * @param kind 
     *            
     * @return List<WebApiConnectedService>
     */
    public List<WebApiConnectedService> getConnectedServices(final String projectId, final ConnectedServiceKind kind) {
        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (kind != null) {
            queryParameters.addIfNotNull("kind", kind); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<WebApiConnectedService>>() {});
    }

    /** 
     * @param mruData 
     *            
     * @param mruName 
     *            
     * @return Response
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

    /** 
     * @param mruName 
     *            
     * @return List<IdentityRef>
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

    /** 
     * @param mruData 
     *            
     * @param mruName 
     *            
     * @return Response
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

    /** 
     * @param mruData 
     *            
     * @param mruName 
     *            
     * @return Response
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

    /** 
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List<IdentityRef>
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

    /** 
     * Get project collection with the specified id or name.
     * 
     * @param collectionId 
     *            
     * @return TeamProjectCollection
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

    /** 
     * @param top 
     *            
     * @param skip 
     *            
     * @return List<TeamProjectCollectionReference>
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

    /** 
     * @param projectId 
     *            
     * @param includeCapabilities 
     *            
     * @param includeHistory 
     *            
     * @return TeamProject
     */
    public TeamProject getProject(final String projectId, final Boolean includeCapabilities, final Boolean includeHistory) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$

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

    /** 
     * @param stateFilter 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List<TeamProjectReference>
     */
    public List<TeamProjectReference> getProjects(final ProjectState stateFilter, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (stateFilter != null) {
            queryParameters.addIfNotNull("stateFilter", stateFilter); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TeamProjectReference>>() {});
    }

    /** 
     * Queue a project creation.
     * 
     * @param projectToCreate 
     *            The project to create.
     * @return Response
     */
    public Response queueCreateProject(final TeamProject projectToCreate) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, projectToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** 
     * Queue a project deletion.
     * 
     * @param projectId 
     *            The project id of the project to delete.
     * @return Response
     */
    public Response queueDeleteProject(final UUID projectId) {
        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** 
     * @param proxyUrl 
     *            
     * @return List<Proxy>
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

    /** 
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return Response
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
