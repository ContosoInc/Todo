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

package com.microsoft.teamfoundation.distributedtask.webapi.connectedservice.model;

import com.microsoft.visualstudio.services.webapi.model.IdentityRef;

public class WebApiConnectedService
    extends WebApiConnectedServiceRef {

    private IdentityRef authenticatedBy;
    private String description;
    private String friendlyName;
    private String id;
    private String kind;
    private TeamProjectReference project;
    private String serviceUri;

    public IdentityRef getAuthenticatedBy() {
        return authenticatedBy;
    }

    public void setAuthenticatedBy(final IdentityRef authenticatedBy) {
        this.authenticatedBy = authenticatedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(final String serviceUri) {
        this.serviceUri = serviceUri;
    }
}
