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

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcChangeset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcCheckinEventData {

    private TfvcChangeset changeset;
    private TeamProjectReference project;

    public TfvcChangeset getChangeset() {
        return changeset;
    }

    public void setChangeset(final TfvcChangeset changeset) {
        this.changeset = changeset;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
