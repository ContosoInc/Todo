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

public class GitCommitRef {

    private GitUserDate author;
    private ChangeCountDictionary changeCounts;
    private List<GitChange> changes;
    private String comment;
    private boolean commentTruncated;
    private String commitId;
    private GitUserDate committer;
    private ReferenceLinks links;
    private List<String> parents;
    private String remoteUrl;
    private String url;

    /**
     * Getter for Author
     * @return GitUserDate
     */
    public GitUserDate getAuthor() {
        return author;
    }

    /**
     * Setter for Author
     * @param author
     */
    public void setAuthor(final GitUserDate author) {
        this.author = author;
    }

    /**
     * Getter for ChangeCounts
     * @return ChangeCountDictionary
     */
    public ChangeCountDictionary getChangeCounts() {
        return changeCounts;
    }

    /**
     * Setter for ChangeCounts
     * @param changeCounts
     */
    public void setChangeCounts(final ChangeCountDictionary changeCounts) {
        this.changeCounts = changeCounts;
    }

    /**
     * Getter for Changes
     * @return List<GitChange>
     */
    public List<GitChange> getChanges() {
        return changes;
    }

    /**
     * Setter for Changes
     * @param changes
     */
    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }

    /**
     * Getter for Comment
     * @return String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment
     * @param comment
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
     * Getter for CommentTruncated
     * @return boolean
     */
    public boolean getCommentTruncated() {
        return commentTruncated;
    }

    /**
     * Setter for CommentTruncated
     * @param commentTruncated
     */
    public void setCommentTruncated(final boolean commentTruncated) {
        this.commentTruncated = commentTruncated;
    }

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
     * Getter for Committer
     * @return GitUserDate
     */
    public GitUserDate getCommitter() {
        return committer;
    }

    /**
     * Setter for Committer
     * @param committer
     */
    public void setCommitter(final GitUserDate committer) {
        this.committer = committer;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for Parents
     * @return List<String>
     */
    public List<String> getParents() {
        return parents;
    }

    /**
     * Setter for Parents
     * @param parents
     */
    public void setParents(final List<String> parents) {
        this.parents = parents;
    }

    /**
     * Getter for RemoteUrl
     * @return String
     */
    public String getRemoteUrl() {
        return remoteUrl;
    }

    /**
     * Setter for RemoteUrl
     * @param remoteUrl
     */
    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
