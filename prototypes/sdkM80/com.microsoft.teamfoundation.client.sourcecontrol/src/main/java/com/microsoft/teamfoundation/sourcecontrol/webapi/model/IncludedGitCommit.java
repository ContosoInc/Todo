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

public class IncludedGitCommit {

    private String commitId;
    private Date commitTime;
    private List<String> parentCommitIds;
    private UUID repositoryId;

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
     * Getter for CommitTime
     * @return Date
     */
    public Date getCommitTime() {
        return commitTime;
    }

    /**
     * Setter for CommitTime
     * @param commitTime
     */
    public void setCommitTime(final Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * Getter for ParentCommitIds
     * @return List<String>
     */
    public List<String> getParentCommitIds() {
        return parentCommitIds;
    }

    /**
     * Setter for ParentCommitIds
     * @param parentCommitIds
     */
    public void setParentCommitIds(final List<String> parentCommitIds) {
        this.parentCommitIds = parentCommitIds;
    }

    /**
     * Getter for RepositoryId
     * @return UUID
     */
    public UUID getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId
     * @param repositoryId
     */
    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }
}
