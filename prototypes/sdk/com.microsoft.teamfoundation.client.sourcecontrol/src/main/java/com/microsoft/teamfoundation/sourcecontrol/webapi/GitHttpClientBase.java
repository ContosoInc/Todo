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
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
public abstract class GitHttpClientBase 
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public GitHttpClientBase(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final String project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final String project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final UUID project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final UUID project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public GitBlobRef getBlob(final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final String project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final String project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final UUID project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final UUID project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobContent(final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final String repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final UUID repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final String project, final String repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final String project, final UUID repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final UUID project, final String repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param blobIds 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param filename 
     *            
     */
    public InputStream getBlobsZip(final List<String> blobIds, final UUID project, final UUID repositoryId, final String filename) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, blobIds, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final String project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final String project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final UUID project, final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final UUID project, final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final String repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Gets a single blob.
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     */
    public InputStream getBlobZip(final UUID repositoryId, final String sha1, final Boolean download, final String fileName) {
        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final String project, final String repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final String project, final UUID repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final UUID project, final String repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final UUID project, final UUID repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final String repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about a single branch.
     * </summary>
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     */
    public GitBranchStats getBranch(final UUID repositoryId, final String name, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final String project, final String repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final String project, final UUID repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final UUID project, final String repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final UUID project, final UUID repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final String repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve statistics about all branches within a repository.
     * </summary>
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     */
    public List<GitBranchStats> getBranches(final UUID repositoryId, final GitVersionDescriptor baseVersionDescriptor) {
        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitBranchStats>>() {});
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final String project, final String commitId, final String repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final String project, final String commitId, final UUID repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final UUID project, final String commitId, final String repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final UUID project, final String commitId, final UUID repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final String commitId, final String repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * Retrieve changes for a particular commit.
     * </summary>
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     */
    public GitCommitChanges getChanges(final String commitId, final UUID repositoryId, final Integer top, final Integer skip) {
        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final String project, final String repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final String project, final UUID repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final UUID project, final String repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final UUID project, final UUID repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final String repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param diffCommonCommit 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     */
    public GitCommitDiffs getCommitDiffs(final UUID repositoryId, final Boolean diffCommonCommit, final Integer top, final Integer skip, final GitBaseVersionDescriptor baseVersionDescriptor, final GitTargetVersionDescriptor targetVersionDescriptor) {
        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        if (baseVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        }
        if (targetVersionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, targetVersionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final String repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final UUID repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final String project, final String repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final UUID project, final String repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Create a git commit for a project
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     */
    public GitCommit createCommit(final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final String project, final String commitId, final String repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final String project, final String commitId, final UUID repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final UUID project, final String commitId, final String repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final UUID project, final String commitId, final UUID repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final String commitId, final String repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * Retrieve a particular commit.
     * </summary>
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     */
    public GitCommit getCommit(final String commitId, final UUID repositoryId, final Integer changeCount) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final String project, final String repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final String project, final UUID repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final UUID project, final String repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final UUID project, final UUID repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final String repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommits(final UUID repositoryId, final GitQueryCommitsCriteria searchCriteria, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final String project, final String repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final String project, final UUID repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final UUID project, final String repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final UUID project, final UUID repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final String repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Retrieve a list of commits associated with a particular push.
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return ("get the top x commits").
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     */
    public List<GitCommitRef> getPushCommits(final UUID repositoryId, final int pushId, final Integer top, final Integer skip, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final String repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final UUID repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final String project, final String repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final String project, final UUID repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final UUID project, final String repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitCommitRef> getCommitsBatch(final GitQueryCommitsCriteria searchCriteria, final UUID project, final UUID repositoryId, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, searchCriteria, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitCommitRef>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final String project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final String project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final UUID project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final UUID project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public GitItem getItem(final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final String project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final String project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final UUID project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final UUID project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemContent(final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final String project, final String repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final String project, final UUID repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final UUID project, final String repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final UUID project, final UUID repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final String repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     */
    public List<GitItem> getItems(final UUID repositoryId, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final Boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        if (versionDescriptor != null)
        {
            addModelAsQueryParams(queryParameters, versionDescriptor);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitItem>>() {});
    }

    /** <summary>
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final String project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final String project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final UUID project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final UUID project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemText(final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final String project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final String project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final UUID project, final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final UUID project, final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final String repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn't apply to zipped content which is always returned as a download.
     * </summary>
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     */
    public InputStream getItemZip(final UUID repositoryId, final String path, final String scopePath, final VersionControlRecursionType recursionLevel, final Boolean includeContentMetadata, final Boolean latestProcessedChange, final Boolean download, final GitVersionDescriptor versionDescriptor) {
        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        if (recursionLevel != null)
        {
            queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        }
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
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
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final String repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final String project, final String repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final UUID project, final String repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * </summary>
     * @param requestData 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public List<List<GitItem>> getItemsBatch(final GitItemRequestData requestData, final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, requestData, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<List<GitItem>>>() {});
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final String repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final UUID repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final String project, final String repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final String project, final UUID repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final UUID project, final String repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets the Git media object contents or metadata by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     * @param includeLinks 
     *            
     */
    public Response getMediaObjectOrReference(final UUID project, final UUID repositoryId, final String mediaObjectId, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$
        routeValues.put("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final String project, final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final String project, final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final UUID project, final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Gets whether the current user has permission to write a Git media object by the specified identifier.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response hasMediaObjectWritePermission(final UUID project, final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.OPTIONS, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final String project, final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final String project, final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final UUID project, final String repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Creates a Git media object with the data in the request stream.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param mediaObjectId 
     *            
     */
    public Response uploadMediaObject(final UUID project, final UUID repositoryId, final String mediaObjectId) {
        final UUID locationId = UUID.fromString("33645b30-4853-4236-ab87-ffed6ea1b5d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("mediaObjectId", mediaObjectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final String project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final String project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final UUID project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds a reviewer to a git pull request
     * </summary>
     * @param reviewer 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote createPullRequestReviewer(final IdentityRefWithVote reviewer, final UUID project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PUT, locationId, routeValues, 
                                apiVersion, reviewer, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final String project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final String project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final UUID project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param reviewers 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> createPullRequestReviewers(final IdentityRef[] reviewers, final UUID project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, reviewers, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final String project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final String project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final UUID project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Adds reviewers to a git pull request
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public Response deletePullRequestReviewer(final UUID project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Response.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final String project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final String project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final UUID project, final String repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a reviewer from a pull request
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public IdentityRefWithVote getPullRequestReviewer(final UUID project, final UUID repositoryId, final int pullRequestId, final String reviewerId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final String project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final String project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final UUID project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Retrieve a pull request reviewers
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public List<IdentityRefWithVote> getPullRequestReviewers(final UUID project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<IdentityRefWithVote>>() {});
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final String repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final String project, final String repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final UUID project, final String repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Create a git pull request
     * </summary>
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public GitPullRequest createPullRequest(final GitPullRequest gitPullRequestToCreate, final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitPullRequestToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final String project, final String repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final String project, final UUID repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final UUID project, final String repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final UUID project, final UUID repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final String repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public GitPullRequest getPullRequest(final UUID repositoryId, final int pullRequestId, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final String project, final String repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final String project, final UUID repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final UUID project, final String repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final UUID project, final UUID repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final String repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     */
    public List<GitPullRequest> getPullRequests(final UUID repositoryId, final GitPullRequestSearchCriteria searchCriteria, final Integer maxCommentLength, final Integer skip, final Integer top) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPullRequest>>() {});
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final String project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final String project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final UUID project, final String repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * Updates a pull request
     * </summary>
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     */
    public GitPullRequest updatePullRequest(final GitPullRequest gitPullRequestToUpdate, final UUID project, final UUID repositoryId, final int pullRequestId) {
        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, gitPullRequestToUpdate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final String project, final String repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final String project, final UUID repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final UUID project, final String repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final UUID project, final UUID repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final String repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param commitsTop 
     *            
     * @param commitsSkip 
     *            
     */
    public List<AssociatedWorkItem> getPullRequestWorkItems(final UUID repositoryId, final int pullRequestId, final Integer commitsTop, final Integer commitsSkip) {
        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("commitsTop", commitsTop); //$NON-NLS-1$
        queryParameters.addIfNotNull("commitsSkip", commitsSkip); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<AssociatedWorkItem>>() {});
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final String project, final String repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final String project, final UUID repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final UUID project, final String repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final UUID project, final UUID repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final String repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * Retrieve a particular push.
     * </summary>
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     */
    public GitPush getPush(final UUID repositoryId, final int pushId, final Integer includeCommits, final Boolean includeRefUpdates) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final String project, final String repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final String project, final UUID repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final UUID project, final String repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final UUID project, final UUID repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final String repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     */
    public List<GitPush> getPushes(final UUID repositoryId, final Integer skip, final Integer top, final GitPushSearchCriteria searchCriteria) {
        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        if (searchCriteria != null)
        {
            addModelAsQueryParams(queryParameters, searchCriteria);
        }

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitPush>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final String project, final String repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final String project, final UUID repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final UUID project, final String repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final UUID project, final UUID repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final String repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param refType 
     *            
     * @param includeLinks 
     *            
     */
    public List<GitRef> getRefs(final UUID repositoryId, final String refType, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRef>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final String repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final UUID repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final String project, final String repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final String project, final UUID repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final UUID project, final String repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param refUpdates 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param projectId 
     *            
     */
    public List<GitRefUpdateResult> updateRefs(final List<GitRefUpdate> refUpdates, final UUID project, final UUID repositoryId, final String projectId) {
        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, refUpdates, APPLICATION_JSON_TYPE, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRefUpdateResult>>() {});
    }

    /** <summary>
     * Create a git repository
     * </summary>
     * @param gitRepositoryToCreate 
     *            
     */
    public GitRepository createRepository(final GitRepository gitRepositoryToCreate) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, 
                                apiVersion, gitRepositoryToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Create a git repository
     * </summary>
     * @param gitRepositoryToCreate 
     *            
     * @param project 
     *            Project ID or project name
     */
    public GitRepository createRepository(final GitRepository gitRepositoryToCreate, final String project) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitRepositoryToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Create a git repository
     * </summary>
     * @param gitRepositoryToCreate 
     *            
     * @param project 
     *            Project ID
     */
    public GitRepository createRepository(final GitRepository gitRepositoryToCreate, final UUID project) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.POST, locationId, routeValues, 
                                apiVersion, gitRepositoryToCreate, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Delete a git repository
     * </summary>
     * @param repositoryId 
     *            
     */
    public void deleteRepository(final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * Delete a git repository
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public void deleteRepository(final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * Delete a git repository
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public void deleteRepository(final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.DELETE, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** <summary>
     * Retrieve git repositories.
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param includeLinks 
     *            
     */
    public List<GitRepository> getRepositories(final String project, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRepository>>() {});
    }

    /** <summary>
     * Retrieve git repositories.
     * </summary>
     * @param project 
     *            Project ID
     * @param includeLinks 
     *            
     */
    public List<GitRepository> getRepositories(final UUID project, final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRepository>>() {});
    }

    /** <summary>
     * Retrieve git repositories.
     * </summary>
     * @param includeLinks 
     *            
     */
    public List<GitRepository> getRepositories(final Boolean includeLinks) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new GenericType<List<GitRepository>>() {});
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final String repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final String project, final String repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final UUID project, final String repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public GitRepository getRepository(final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Updates the Git repository with the single populated change in the specified repository information.
     * </summary>
     * @param newRepositoryInfo 
     *            
     * @param repositoryId 
     *            
     */
    public GitRepository patchRepository(final GitRepository newRepositoryInfo, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, newRepositoryInfo, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Updates the Git repository with the single populated change in the specified repository information.
     * </summary>
     * @param newRepositoryInfo 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public GitRepository patchRepository(final GitRepository newRepositoryInfo, final String project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, newRepositoryInfo, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * Updates the Git repository with the single populated change in the specified repository information.
     * </summary>
     * @param newRepositoryInfo 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public GitRepository patchRepository(final GitRepository newRepositoryInfo, final UUID project, final UUID repositoryId) {
        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.PATCH, locationId, routeValues, 
                                apiVersion, newRepositoryInfo, APPLICATION_JSON_TYPE, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final String project, final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final String project, final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final UUID project, final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final UUID project, final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public GitTreeRef getTree(final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final String project, final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final String project, final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final UUID project, final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final UUID project, final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final String repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** <summary>
     * 
     * </summary>
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     */
    public InputStream getTreeZip(final UUID repositoryId, final String sha1, final String projectId, final Boolean recursive, final String fileName) {
        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Invocation httpRequest =
            super.createRequest(HttpMethod.GET, locationId, routeValues, 
                                apiVersion, queryParameters, APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }
}
