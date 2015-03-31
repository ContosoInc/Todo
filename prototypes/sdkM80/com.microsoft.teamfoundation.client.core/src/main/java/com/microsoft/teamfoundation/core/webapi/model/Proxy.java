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

public class Proxy {

    private String description;
    private String friendlyName;
    private boolean globalDefault;
    private String site;
    private boolean siteDefault;
    private String url;

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
     * Getter for FriendlyName
     * @return String
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Setter for FriendlyName
     * @param friendlyName
     */
    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * Getter for GlobalDefault
     * @return boolean
     */
    public boolean getGlobalDefault() {
        return globalDefault;
    }

    /**
     * Setter for GlobalDefault
     * @param globalDefault
     */
    public void setGlobalDefault(final boolean globalDefault) {
        this.globalDefault = globalDefault;
    }

    /**
     * Getter for Site
     * @return String
     */
    public String getSite() {
        return site;
    }

    /**
     * Setter for Site
     * @param site
     */
    public void setSite(final String site) {
        this.site = site;
    }

    /**
     * Getter for SiteDefault
     * @return boolean
     */
    public boolean getSiteDefault() {
        return siteDefault;
    }

    /**
     * Setter for SiteDefault
     * @param siteDefault
     */
    public void setSiteDefault(final boolean siteDefault) {
        this.siteDefault = siteDefault;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
