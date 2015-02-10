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
import com.fasterxml.jackson.annotation.JsonProperty;

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
