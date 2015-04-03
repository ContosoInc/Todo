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
import com.microsoft.teamfoundation.core.webapi.model.WebApiTeamRef;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TeamProject
    extends TeamProjectReference {

    private ReferenceLinks _links;
    private HashMap<String,HashMap<String,String>> capabilities;
    private WebApiTeamRef defaultTeam;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public HashMap<String,HashMap<String,String>> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final HashMap<String,HashMap<String,String>> capabilities) {
        this.capabilities = capabilities;
    }

    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }
}
