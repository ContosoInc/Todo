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

public class GitPush
    extends GitPushRef {

    private List<GitCommitRef> commits;
    private List<GitRefUpdate> refUpdates;
    private GitRepository repository;

    /**
     * Getter for Commits
     * @return List<GitCommitRef>
     */
    public List<GitCommitRef> getCommits() {
        return commits;
    }

    /**
     * Setter for Commits
     * @param commits
     */
    public void setCommits(final List<GitCommitRef> commits) {
        this.commits = commits;
    }

    /**
     * Getter for RefUpdates
     * @return List<GitRefUpdate>
     */
    public List<GitRefUpdate> getRefUpdates() {
        return refUpdates;
    }

    /**
     * Setter for RefUpdates
     * @param refUpdates
     */
    public void setRefUpdates(final List<GitRefUpdate> refUpdates) {
        this.refUpdates = refUpdates;
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
