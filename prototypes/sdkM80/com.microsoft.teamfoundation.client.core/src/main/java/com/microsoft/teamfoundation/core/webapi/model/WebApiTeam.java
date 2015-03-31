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

public class WebApiTeam
    extends WebApiTeamRef {

    private String description;
    private String identityUrl;

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
     * Getter for IdentityUrl
     * @return String
     */
    public String getIdentityUrl() {
        return identityUrl;
    }

    /**
     * Setter for IdentityUrl
     * @param identityUrl
     */
    public void setIdentityUrl(final String identityUrl) {
        this.identityUrl = identityUrl;
    }
}
