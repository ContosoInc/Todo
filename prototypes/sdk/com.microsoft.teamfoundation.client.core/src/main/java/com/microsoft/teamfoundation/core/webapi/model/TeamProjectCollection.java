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

import com.microsoft.teamfoundation.core.webapi.model.TeamProjectCollectionReference;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TeamProjectCollection
    extends TeamProjectCollectionReference {

    private ReferenceLinks _links;
    private String description;
    private String state;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
