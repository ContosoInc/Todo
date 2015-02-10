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
import com.fasterxml.jackson.annotation.JsonProperty;

public class WebApiConnectedService
    extends WebApiConnectedServiceRef {

    private IdentityRef authenticatedBy;
    private String description;
    private String kind;
    private String name;
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

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    @JsonProperty("id")
    public String getName() {
        return name;
    }

    @JsonProperty("id")
    public void setName(final String name) {
        this.name = name;
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
