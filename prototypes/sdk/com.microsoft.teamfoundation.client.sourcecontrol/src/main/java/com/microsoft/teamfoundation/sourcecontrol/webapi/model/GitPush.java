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
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitPushRef;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRefUpdate;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRepository;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
