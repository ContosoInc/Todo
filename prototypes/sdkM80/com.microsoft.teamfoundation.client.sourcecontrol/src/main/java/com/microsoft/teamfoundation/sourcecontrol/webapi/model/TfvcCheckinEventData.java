/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class TfvcCheckinEventData {

    private TfvcChangeset changeset;
    private TeamProjectReference project;

    /**
     * Getter for Changeset
     * @return TfvcChangeset
     */
    public TfvcChangeset getChangeset() {
        return changeset;
    }

    /**
     * Setter for Changeset
     * @param changeset
     */
    public void setChangeset(final TfvcChangeset changeset) {
        this.changeset = changeset;
    }

    /**
     * Getter for Project
     * @return TeamProjectReference
     */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
     * Setter for Project
     * @param project
     */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
