package com.microsoft.vss.client.sourcecontrol.model;

import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitObjectType;

public class GitItem
    extends ItemModel {
    private String objectId;
    private GitObjectType gitObjectType;
    private String commitId;
    private GitCommitRef latestProcessedChange;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public GitObjectType getGitObjectType() {
        return gitObjectType;
    }

    public void setGitObjectType(final GitObjectType gitObjectType) {
        this.gitObjectType = gitObjectType;
    }

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public GitCommitRef getLatestProcessedChange() {
        return latestProcessedChange;
    }

    public void setLatestProcessedChange(final GitCommitRef latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }
}
