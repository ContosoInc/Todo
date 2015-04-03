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

import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.teamfoundation.core.webapi.model.WebApiProjectCollectionRef;
import com.microsoft.teamfoundation.core.webapi.model.WebApiTeamRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class WebApiProject
    extends TeamProjectReference {

    private HashMap<String,HashMap<String,String>> capabilities;
    private WebApiProjectCollectionRef collection;
    private WebApiTeamRef defaultTeam;

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
}
