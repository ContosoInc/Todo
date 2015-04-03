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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitPathAction;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitCommitToCreate {

    private GitRef baseRef;
    private String comment;
    private GitPathAction[] pathActions;

    public GitRef getBaseRef() {
        return baseRef;
    }

    public void setBaseRef(final GitRef baseRef) {
        this.baseRef = baseRef;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public GitPathAction[] getPathActions() {
        return pathActions;
    }

    public void setPathActions(final GitPathAction[] pathActions) {
        this.pathActions = pathActions;
    }
}
