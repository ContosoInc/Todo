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


public class WebApiTeam
    extends WebApiTeamRef {

    private String description;
    private String identityUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getIdentityUrl() {
        return identityUrl;
    }

    public void setIdentityUrl(final String identityUrl) {
        this.identityUrl = identityUrl;
    }
}
