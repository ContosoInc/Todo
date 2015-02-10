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

public class IncludedGitCommit {

    private String commitId;
    private Date commitTime;
    private List<String> parentCommitIds;
    private UUID repositoryId;

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(final Date commitTime) {
        this.commitTime = commitTime;
    }

    public List<String> getParentCommitIds() {
        return parentCommitIds;
    }

    public void setParentCommitIds(final List<String> parentCommitIds) {
        this.parentCommitIds = parentCommitIds;
    }

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }
}
