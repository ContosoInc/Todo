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

package com.microsoft.teamfoundation.core.webapi.model;


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
