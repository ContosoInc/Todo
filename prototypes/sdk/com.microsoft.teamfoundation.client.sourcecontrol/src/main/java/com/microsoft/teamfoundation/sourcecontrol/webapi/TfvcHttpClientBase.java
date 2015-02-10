/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.microsoft.vss.client.core.*;
import com.microsoft.vss.client.core.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
public abstract class TfvcHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public TfvcHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** <summary>
     * Get a single branch hierarchy at the given path with parents or children (if specified)
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     */
    public TfvcBranch getBranch(final String project, final String path, final Boolean includeParent, final Boolean includeChildren) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcBranch.class);
    }

    /** <summary>
     * Get a single branch hierarchy at the given path with parents or children (if specified)
     * </summary>
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     */
    public TfvcBranch getBranch(final UUID project, final String path, final Boolean includeParent, final Boolean includeChildren) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcBranch.class);
    }

    /** <summary>
     * Get a single branch hierarchy at the given path with parents or children (if specified)
     * </summary>
     * @param path 
     *            
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     */
    public TfvcBranch getBranch(final String path, final Boolean includeParent, final Boolean includeChildren) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcBranch.class);
    }

    /** <summary>
     * Get a collection of branch roots -- first-level children, branches with no parents
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranch> getBranches(final String project, final Boolean includeParent, final Boolean includeChildren, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranch>>() {});
    }

    /** <summary>
     * Get a collection of branch roots -- first-level children, branches with no parents
     * </summary>
     * @param project 
     *            Project ID
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranch> getBranches(final UUID project, final Boolean includeParent, final Boolean includeChildren, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranch>>() {});
    }

    /** <summary>
     * Get a collection of branch roots -- first-level children, branches with no parents
     * </summary>
     * @param includeParent 
     *            
     * @param includeChildren 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranch> getBranches(final Boolean includeParent, final Boolean includeChildren, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeParent", includeParent); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeChildren", includeChildren); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranch>>() {});
    }

    /** <summary>
     * Get branch hierarchies below the specified scopePath
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param scopePath 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranchRef> getBranchRefs(final String project, final String scopePath, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranchRef>>() {});
    }

    /** <summary>
     * Get branch hierarchies below the specified scopePath
     * </summary>
     * @param project 
     *            Project ID
     * @param scopePath 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranchRef> getBranchRefs(final UUID project, final String scopePath, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranchRef>>() {});
    }

    /** <summary>
     * Get branch hierarchies below the specified scopePath
     * </summary>
     * @param scopePath 
     *            
     * @param includeDeleted 
     *            
     * @param includeLinks 
     *            
     */
    public List<TfvcBranchRef> getBranchRefs(final String scopePath, final Boolean includeDeleted, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("bc1f417e-239d-42e7-85e1-76e80cb2d6eb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcBranchRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param id 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<TfvcChange> getChangesetChanges(final Integer id, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("f32b86f2-15b9-4fe6-81b1-6f8938617ee5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChange>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param id 
     *            
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public TfvcChangeset getChangeset(final String project, final int id, final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcChangeset.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param id 
     *            
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public TfvcChangeset getChangeset(final UUID project, final int id, final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcChangeset.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param id 
     *            
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public TfvcChangeset getChangeset(final int id, final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcChangeset.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public List<TfvcChangesetRef> getChangesets(final String project, final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChangesetRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public List<TfvcChangesetRef> getChangesets(final UUID project, final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChangesetRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param maxChangeCount 
     *            
     * @param includeDetails 
     *            
     * @param includeWorkItems 
     *            
     * @param maxCommentLength 
     *            
     * @param includeSourceRename 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param orderby 
     *            
     * @param searchCriteria 
     *            
     */
    public List<TfvcChangesetRef> getChangesets(final Integer maxChangeCount, final Boolean includeDetails, final Boolean includeWorkItems, final Integer maxCommentLength, final Boolean includeSourceRename, final Integer skip, final Integer top, final String orderby, final TfvcChangesetSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("0bc8f0a4-6bfb-42a9-ba84-139da7b99c49"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxChangeCount", maxChangeCount); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDetails", includeDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItems", includeWorkItems); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceRename", includeSourceRename); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChangesetRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param changesetsRequestData 
     *            
     */
    public List<TfvcChangesetRef> getBatchedChangesets(final TfvcChangesetsRequestData changesetsRequestData) {
        final UUID locationId = UUID.fromString("b7e7c173-803c-4fea-9ec8-31ee35c5502a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, changesetsRequestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChangesetRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param id 
     *            
     */
    public List<AssociatedWorkItem> getChangesetWorkItems(final Integer id) {
        final UUID locationId = UUID.fromString("64ae0bea-1d71-47c9-a9e5-fe73f5ea0ff4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * Post for retrieving a set of items given a list of paths or a long path. Allows for specifying the recursionLevel and version descriptors for each path.
     * </summary>
     * @param itemRequestData 
     *            
     */
    public List<List<TfvcItem>> getItemsBatch(final TfvcItemRequestData itemRequestData) {
        final UUID locationId = UUID.fromString("fe6f827b-5f64-480f-b8af-1eca3b80e833"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, itemRequestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<TfvcItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a set of items given a list of paths or a long path. Allows for specifying the recursionLevel and version descriptors for each path.
     * </summary>
     * @param itemRequestData 
     *            
     * @param project 
     *            Project ID or project name
     */
    public List<List<TfvcItem>> getItemsBatch(final TfvcItemRequestData itemRequestData, final String project) {
        final UUID locationId = UUID.fromString("fe6f827b-5f64-480f-b8af-1eca3b80e833"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, itemRequestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<TfvcItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a set of items given a list of paths or a long path. Allows for specifying the recursionLevel and version descriptors for each path.
     * </summary>
     * @param itemRequestData 
     *            
     * @param project 
     *            Project ID
     */
    public List<List<TfvcItem>> getItemsBatch(final TfvcItemRequestData itemRequestData, final UUID project) {
        final UUID locationId = UUID.fromString("fe6f827b-5f64-480f-b8af-1eca3b80e833"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, itemRequestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<TfvcItem>>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public TfvcItem getItem(final String project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public TfvcItem getItem(final UUID project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public TfvcItem getItem(final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final String project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final UUID project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get a list of Tfvc items
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<TfvcItem> getItems(final String project, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeLinks, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcItem>>() {});
    }

    /** <summary>
     * Get a list of Tfvc items
     * </summary>
     * @param project 
     *            Project ID
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<TfvcItem> getItems(final UUID project, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeLinks, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcItem>>() {});
    }

    /** <summary>
     * Get a list of Tfvc items
     * </summary>
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<TfvcItem> getItems(final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeLinks, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final String project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final UUID project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final String project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final UUID project, final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param path 
     *            
     * @param fileName 
     *            
     * @param download 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final String path, final String fileName, final Boolean download, final String scopePath, final VersionControlRecursionType recursionLevel, final TfvcVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("ba9fc436-9a38-4578-89d6-e4f3241f5040"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param labelId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcItem> getLabelItems(final String labelId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("06166e34-de17-4b60-8cd1-23182a346fda"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("labelId", labelId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcItem>>() {});
    }

    /** <summary>
     * Get a single deep label.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param labelId 
     *            Unique identifier of label
     * @param requestData 
     *            maxItemCount
     */
    public TfvcLabel getLabel(final String project, final String labelId, final TfvcLabelRequestData requestData) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("labelId", labelId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcLabel.class);
    }

    /** <summary>
     * Get a single deep label.
     * </summary>
     * @param project 
     *            Project ID
     * @param labelId 
     *            Unique identifier of label
     * @param requestData 
     *            maxItemCount
     */
    public TfvcLabel getLabel(final UUID project, final String labelId, final TfvcLabelRequestData requestData) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("labelId", labelId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcLabel.class);
    }

    /** <summary>
     * Get a single deep label.
     * </summary>
     * @param labelId 
     *            Unique identifier of label
     * @param requestData 
     *            maxItemCount
     */
    public TfvcLabel getLabel(final String labelId, final TfvcLabelRequestData requestData) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("labelId", labelId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcLabel.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param requestData 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcLabelRef> getLabels(final String project, final TfvcLabelRequestData requestData, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcLabelRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param requestData 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcLabelRef> getLabels(final UUID project, final TfvcLabelRequestData requestData, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcLabelRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param requestData 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcLabelRef> getLabels(final TfvcLabelRequestData requestData, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("a5d9bd7f-b661-4d0e-b9be-d9c16affae54"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcLabelRef>>() {});
    }

    /** <summary>
     * Retrieve the version control information for a given Team Project
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param projectId 
     *            The id (or name) of the team project
     */
    public VersionControlProjectInfo getProjectInfo(final String project, final UUID projectId) {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (projectId != null)
        {
            queryParameters.addIfNotNull("projectId", projectId); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, VersionControlProjectInfo.class);
    }

    /** <summary>
     * Retrieve the version control information for a given Team Project
     * </summary>
     * @param project 
     *            Project ID
     * @param projectId 
     *            The id (or name) of the team project
     */
    public VersionControlProjectInfo getProjectInfo(final UUID project, final UUID projectId) {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (projectId != null)
        {
            queryParameters.addIfNotNull("projectId", projectId); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, VersionControlProjectInfo.class);
    }

    /** <summary>
     * Retrieve the version control information for a given Team Project
     * </summary>
     * @param projectId 
     *            The id (or name) of the team project
     */
    public VersionControlProjectInfo getProjectInfo(final UUID projectId) {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (projectId != null)
        {
            queryParameters.addIfNotNull("projectId", projectId); //$NON-NLS-1$
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, VersionControlProjectInfo.class);
    }

    /** <summary>
     * 
     * </summary>
     */
    public List<VersionControlProjectInfo> getProjectInfos() {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<VersionControlProjectInfo>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     */
    public List<VersionControlProjectInfo> getProjectInfos(final String project) {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<VersionControlProjectInfo>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     */
    public List<VersionControlProjectInfo> getProjectInfos(final UUID project) {
        final UUID locationId = UUID.fromString("252d9c40-0643-41cf-85b2-044d80f9b675"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<VersionControlProjectInfo>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param shelvesetId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcChange> getShelvesetChanges(final String shelvesetId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("dbaf075b-0445-4c34-9e5b-82292f856522"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("shelvesetId", shelvesetId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcChange>>() {});
    }

    /** <summary>
     * Get a single deep shelveset.
     * </summary>
     * @param shelvesetId 
     *            Shelveset's unique ID
     * @param requestData 
     *            includeDetails, includeWorkItems, maxChangeCount, and maxCommentLength
     */
    public TfvcShelveset getShelveset(final String shelvesetId, final TfvcShelvesetRequestData requestData) {
        final UUID locationId = UUID.fromString("e36d44fb-e907-4b0a-b194-f83f1ed32ad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("shelvesetId", shelvesetId); //$NON-NLS-1$
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TfvcShelveset.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param requestData 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     */
    public List<TfvcShelvesetRef> getShelvesets(final TfvcShelvesetRequestData requestData, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("e36d44fb-e907-4b0a-b194-f83f1ed32ad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (requestData != null)
        {
            addModelAsQueryParams(queryParameters, requestData);
        }
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<TfvcShelvesetRef>>() {});
    }

    /** <summary>
     * Get work items associated with a shelveset.
     * </summary>
     * @param shelvesetId 
     *            Shelveset's unique ID
     */
    public List<AssociatedWorkItem> getShelvesetWorkItems(final String shelvesetId) {
        final UUID locationId = UUID.fromString("a7a0c1c1-373e-425a-b031-a519474d743d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("shelvesetId", shelvesetId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }
}
