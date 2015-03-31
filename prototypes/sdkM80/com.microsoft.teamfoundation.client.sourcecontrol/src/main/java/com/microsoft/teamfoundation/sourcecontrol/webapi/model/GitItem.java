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

public class GitItem
    extends ItemModel {

    private String commitId;
    private GitObjectType gitObjectType;
    private GitCommitRef latestProcessedChange;
    private String objectId;

    /**
     * Getter for CommitId
     * @return String
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * Setter for CommitId
     * @param commitId
     */
    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    /**
     * Getter for GitObjectType
     * @return GitObjectType
     */
    public GitObjectType getGitObjectType() {
        return gitObjectType;
    }

    /**
     * Setter for GitObjectType
     * @param gitObjectType
     */
    public void setGitObjectType(final GitObjectType gitObjectType) {
        this.gitObjectType = gitObjectType;
    }

    /**
     * Getter for LatestProcessedChange
     * @return GitCommitRef
     */
    public GitCommitRef getLatestProcessedChange() {
        return latestProcessedChange;
    }

    /**
     * Setter for LatestProcessedChange
     * @param latestProcessedChange
     */
    public void setLatestProcessedChange(final GitCommitRef latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }

    /**
     * Getter for ObjectId
     * @return String
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Setter for ObjectId
     * @param objectId
     */
    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }
}
