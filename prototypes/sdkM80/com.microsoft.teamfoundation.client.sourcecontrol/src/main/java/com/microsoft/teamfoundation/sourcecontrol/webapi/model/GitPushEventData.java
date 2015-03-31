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

public class GitPushEventData {

    private String afterId;
    private String beforeId;
    private String branch;
    private GitCommit[] commits;
    private GitRepository repository;

    /**
     * Getter for AfterId
     * @return String
     */
    public String getAfterId() {
        return afterId;
    }

    /**
     * Setter for AfterId
     * @param afterId
     */
    public void setAfterId(final String afterId) {
        this.afterId = afterId;
    }

    /**
     * Getter for BeforeId
     * @return String
     */
    public String getBeforeId() {
        return beforeId;
    }

    /**
     * Setter for BeforeId
     * @param beforeId
     */
    public void setBeforeId(final String beforeId) {
        this.beforeId = beforeId;
    }

    /**
     * Getter for Branch
     * @return String
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Setter for Branch
     * @param branch
     */
    public void setBranch(final String branch) {
        this.branch = branch;
    }

    /**
     * Getter for Commits
     * @return GitCommit[]
     */
    public GitCommit[] getCommits() {
        return commits;
    }

    /**
     * Setter for Commits
     * @param commits
     */
    public void setCommits(final GitCommit[] commits) {
        this.commits = commits;
    }

    /**
     * Getter for Repository
     * @return GitRepository
     */
    public GitRepository getRepository() {
        return repository;
    }

    /**
     * Setter for Repository
     * @param repository
     */
    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }
}
