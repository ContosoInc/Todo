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

public class GitCommitToCreate {

    private GitRef baseRef;
    private String comment;
    private GitPathAction[] pathActions;

    /**
     * Getter for BaseRef
     * @return GitRef
     */
    public GitRef getBaseRef() {
        return baseRef;
    }

    /**
     * Setter for BaseRef
     * @param baseRef
     */
    public void setBaseRef(final GitRef baseRef) {
        this.baseRef = baseRef;
    }

    /**
     * Getter for Comment
     * @return String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment
     * @param comment
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
     * Getter for PathActions
     * @return GitPathAction[]
     */
    public GitPathAction[] getPathActions() {
        return pathActions;
    }

    /**
     * Setter for PathActions
     * @param pathActions
     */
    public void setPathActions(final GitPathAction[] pathActions) {
        this.pathActions = pathActions;
    }
}
