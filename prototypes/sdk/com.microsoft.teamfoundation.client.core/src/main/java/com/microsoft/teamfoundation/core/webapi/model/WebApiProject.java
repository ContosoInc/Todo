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

public class WebApiProject
    extends TeamProjectReference {

    private HashMap<String,HashMap<String,String>> capabilities;
    private WebApiProjectCollectionRef collection;
    private WebApiTeamRef defaultTeam;
    private String description;
    private String tfsUri;

    public HashMap<String,HashMap<String,String>> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final HashMap<String,HashMap<String,String>> capabilities) {
        this.capabilities = capabilities;
    }

    public WebApiProjectCollectionRef getCollection() {
        return collection;
    }

    public void setCollection(final WebApiProjectCollectionRef collection) {
        this.collection = collection;
    }

    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getTfsUri() {
        return tfsUri;
    }

    public void setTfsUri(final String tfsUri) {
        this.tfsUri = tfsUri;
    }
}
