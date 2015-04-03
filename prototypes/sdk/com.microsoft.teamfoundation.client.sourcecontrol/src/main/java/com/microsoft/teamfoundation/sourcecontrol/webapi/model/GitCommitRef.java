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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.ChangeCountDictionary;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitChange;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitUserDate;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitCommitRef {

    private ReferenceLinks _links;
    private GitUserDate author;
    private ChangeCountDictionary changeCounts;
    private List<GitChange> changes;
    private String comment;
    private boolean commentTruncated;
    private String commitId;
    private GitUserDate committer;
    private List<String> parents;
    private String remoteUrl;
    private String url;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public GitUserDate getAuthor() {
        return author;
    }

    public void setAuthor(final GitUserDate author) {
        this.author = author;
    }

    public ChangeCountDictionary getChangeCounts() {
        return changeCounts;
    }

    public void setChangeCounts(final ChangeCountDictionary changeCounts) {
        this.changeCounts = changeCounts;
    }

    public List<GitChange> getChanges() {
        return changes;
    }

    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public boolean getCommentTruncated() {
        return commentTruncated;
    }

    public void setCommentTruncated(final boolean commentTruncated) {
        this.commentTruncated = commentTruncated;
    }

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public GitUserDate getCommitter() {
        return committer;
    }

    public void setCommitter(final GitUserDate committer) {
        this.committer = committer;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(final List<String> parents) {
        this.parents = parents;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
