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

public class WebApiProject
    extends TeamProjectReference {

    private HashMap<String,HashMap<String,String>> capabilities;
    private WebApiProjectCollectionRef collection;
    private WebApiTeamRef defaultTeam;
    private String tfsUri;

    /**
     * Getter for Capabilities
     * @return HashMap&#60String,HashMap&#60String,String&#62&#62
     */
    public HashMap<String,HashMap<String,String>> getCapabilities() {
        return capabilities;
    }

    /**
     * Setter for Capabilities
     * @param capabilities
     */
    public void setCapabilities(final HashMap<String,HashMap<String,String>> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Getter for Collection
     * @return WebApiProjectCollectionRef
     */
    public WebApiProjectCollectionRef getCollection() {
        return collection;
    }

    /**
     * Setter for Collection
     * @param collection
     */
    public void setCollection(final WebApiProjectCollectionRef collection) {
        this.collection = collection;
    }

    /**
     * Getter for DefaultTeam
     * @return WebApiTeamRef
     */
    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    /**
     * Setter for DefaultTeam
     * @param defaultTeam
     */
    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }

    /**
     * Getter for TfsUri
     * @return String
     */
    public String getTfsUri() {
        return tfsUri;
    }

    /**
     * Setter for TfsUri
     * @param tfsUri
     */
    public void setTfsUri(final String tfsUri) {
        this.tfsUri = tfsUri;
    }
}
