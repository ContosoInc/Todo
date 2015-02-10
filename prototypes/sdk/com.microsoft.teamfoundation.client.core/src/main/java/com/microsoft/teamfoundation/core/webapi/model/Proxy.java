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

public class Proxy {

    private String description;
    private String friendlyName;
    private boolean globalDefault;
    private String site;
    private boolean siteDefault;
    private String url;

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

    public boolean getGlobalDefault() {
        return globalDefault;
    }

    public void setGlobalDefault(final boolean globalDefault) {
        this.globalDefault = globalDefault;
    }

    public String getSite() {
        return site;
    }

    public void setSite(final String site) {
        this.site = site;
    }

    public boolean getSiteDefault() {
        return siteDefault;
    }

    public void setSiteDefault(final boolean siteDefault) {
        this.siteDefault = siteDefault;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
