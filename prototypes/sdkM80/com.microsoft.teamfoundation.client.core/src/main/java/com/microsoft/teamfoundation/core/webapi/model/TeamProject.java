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

public class TeamProject
    extends TeamProjectReference {

    private HashMap<String,HashMap<String,String>> capabilities;
    private WebApiTeamRef defaultTeam;
    private ReferenceLinks links;
    private String tfsUri;

    /**
     * Getter for Capabilities
     * @return HashMap<String,HashMap<String,String>>
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
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
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
