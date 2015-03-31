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

public class GitCommit
    extends GitCommitRef {

    private GitPushRef push;
    private String treeId;

    /**
     * Getter for Push
     * @return GitPushRef
     */
    public GitPushRef getPush() {
        return push;
    }

    /**
     * Setter for Push
     * @param push
     */
    public void setPush(final GitPushRef push) {
        this.push = push;
    }

    /**
     * Getter for TreeId
     * @return String
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * Setter for TreeId
     * @param treeId
     */
    public void setTreeId(final String treeId) {
        this.treeId = treeId;
    }
}
