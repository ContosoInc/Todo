/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitCommitRef;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitObjectType;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.ItemModel;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitItem
    extends ItemModel {

    private String commitId;
    private GitObjectType gitObjectType;
    private GitCommitRef latestProcessedChange;
    private String objectId;

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public GitObjectType getGitObjectType() {
        return gitObjectType;
    }

    public void setGitObjectType(final GitObjectType gitObjectType) {
        this.gitObjectType = gitObjectType;
    }

    public GitCommitRef getLatestProcessedChange() {
        return latestProcessedChange;
    }

    public void setLatestProcessedChange(final GitCommitRef latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }
}
