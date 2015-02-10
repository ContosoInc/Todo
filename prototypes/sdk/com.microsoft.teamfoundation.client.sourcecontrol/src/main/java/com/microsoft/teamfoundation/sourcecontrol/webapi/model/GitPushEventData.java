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

public class GitPushEventData {

    private String afterId;
    private String beforeId;
    private String branch;
    private GitCommit[] commits;
    private GitRepository repository;

    public String getAfterId() {
        return afterId;
    }

    public void setAfterId(final String afterId) {
        this.afterId = afterId;
    }

    public String getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(final String beforeId) {
        this.beforeId = beforeId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(final String branch) {
        this.branch = branch;
    }

    public GitCommit[] getCommits() {
        return commits;
    }

    public void setCommits(final GitCommit[] commits) {
        this.commits = commits;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }
}
