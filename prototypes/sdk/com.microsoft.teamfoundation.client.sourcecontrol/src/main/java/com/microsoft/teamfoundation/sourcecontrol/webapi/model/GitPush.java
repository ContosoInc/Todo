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

public class GitPush
    extends GitPushRef {

    private List<GitCommitRef> commits;
    private List<GitRefUpdate> refUpdates;
    private GitRepository repository;

    public List<GitCommitRef> getCommits() {
        return commits;
    }

    public void setCommits(final List<GitCommitRef> commits) {
        this.commits = commits;
    }

    public List<GitRefUpdate> getRefUpdates() {
        return refUpdates;
    }

    public void setRefUpdates(final List<GitRefUpdate> refUpdates) {
        this.refUpdates = refUpdates;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }
}
