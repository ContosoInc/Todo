/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;

public class WebApiConnectedService
    extends WebApiConnectedServiceRef {

    private IdentityRef authenticatedBy;
    private String description;
    private String kind;
    private String name;
    private TeamProjectReference project;
    private String serviceUri;

    /**
     * Getter for AuthenticatedBy
     * @return IdentityRef
     */
    public IdentityRef getAuthenticatedBy() {
        return authenticatedBy;
    }

    /**
     * Setter for AuthenticatedBy
     * @param authenticatedBy
     */
    public void setAuthenticatedBy(final IdentityRef authenticatedBy) {
        this.authenticatedBy = authenticatedBy;
    }

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for Kind
     * @return String
     */
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind
     * @param kind
     */
    public void setKind(final String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Project
     * @return TeamProjectReference
     */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
     * Setter for Project
     * @param project
     */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    /**
     * Getter for ServiceUri
     * @return String
     */
    public String getServiceUri() {
        return serviceUri;
    }

    /**
     * Setter for ServiceUri
     * @param serviceUri
     */
    public void setServiceUri(final String serviceUri) {
        this.serviceUri = serviceUri;
    }
}
