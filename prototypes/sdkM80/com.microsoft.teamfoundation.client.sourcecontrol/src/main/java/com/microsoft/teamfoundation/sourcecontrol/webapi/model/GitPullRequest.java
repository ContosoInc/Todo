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

public class GitPullRequest {

    private Date closedDate;
    private IdentityRef createdBy;
    private Date creationDate;
    private String description;
    private GitCommitRef lastMergeCommit;
    private GitCommitRef lastMergeSourceCommit;
    private GitCommitRef lastMergeTargetCommit;
    private ReferenceLinks links;
    private UUID mergeId;
    private PullRequestAsyncStatus mergeStatus;
    private int pullRequestId;
    private String remoteUrl;
    private GitRepository repository;
    private IdentityRefWithVote[] reviewers;
    private String sourceRefName;
    private PullRequestStatus status;
    private String targetRefName;
    private String title;
    private String url;

    /**
     * Getter for ClosedDate
     * @return Date
     */
    public Date getClosedDate() {
        return closedDate;
    }

    /**
     * Setter for ClosedDate
     * @param closedDate
     */
    public void setClosedDate(final Date closedDate) {
        this.closedDate = closedDate;
    }

    /**
     * Getter for CreatedBy
     * @return IdentityRef
     */
    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter for CreatedBy
     * @param createdBy
     */
    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for CreationDate
     * @return Date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Setter for CreationDate
     * @param creationDate
     */
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for LastMergeCommit
     * @return GitCommitRef
     */
    public GitCommitRef getLastMergeCommit() {
        return lastMergeCommit;
    }

    /**
     * Setter for LastMergeCommit
     * @param lastMergeCommit
     */
    public void setLastMergeCommit(final GitCommitRef lastMergeCommit) {
        this.lastMergeCommit = lastMergeCommit;
    }

    /**
     * Getter for LastMergeSourceCommit
     * @return GitCommitRef
     */
    public GitCommitRef getLastMergeSourceCommit() {
        return lastMergeSourceCommit;
    }

    /**
     * Setter for LastMergeSourceCommit
     * @param lastMergeSourceCommit
     */
    public void setLastMergeSourceCommit(final GitCommitRef lastMergeSourceCommit) {
        this.lastMergeSourceCommit = lastMergeSourceCommit;
    }

    /**
     * Getter for LastMergeTargetCommit
     * @return GitCommitRef
     */
    public GitCommitRef getLastMergeTargetCommit() {
        return lastMergeTargetCommit;
    }

    /**
     * Setter for LastMergeTargetCommit
     * @param lastMergeTargetCommit
     */
    public void setLastMergeTargetCommit(final GitCommitRef lastMergeTargetCommit) {
        this.lastMergeTargetCommit = lastMergeTargetCommit;
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
     * Getter for MergeId
     * @return UUID
     */
    public UUID getMergeId() {
        return mergeId;
    }

    /**
     * Setter for MergeId
     * @param mergeId
     */
    public void setMergeId(final UUID mergeId) {
        this.mergeId = mergeId;
    }

    /**
     * Getter for MergeStatus
     * @return PullRequestAsyncStatus
     */
    public PullRequestAsyncStatus getMergeStatus() {
        return mergeStatus;
    }

    /**
     * Setter for MergeStatus
     * @param mergeStatus
     */
    public void setMergeStatus(final PullRequestAsyncStatus mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    /**
     * Getter for PullRequestId
     * @return int
     */
    public int getPullRequestId() {
        return pullRequestId;
    }

    /**
     * Setter for PullRequestId
     * @param pullRequestId
     */
    public void setPullRequestId(final int pullRequestId) {
        this.pullRequestId = pullRequestId;
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

    /**
     * Getter for Reviewers
     * @return IdentityRefWithVote[]
     */
    public IdentityRefWithVote[] getReviewers() {
        return reviewers;
    }

    /**
     * Setter for Reviewers
     * @param reviewers
     */
    public void setReviewers(final IdentityRefWithVote[] reviewers) {
        this.reviewers = reviewers;
    }

    /**
     * Getter for SourceRefName
     * @return String
     */
    public String getSourceRefName() {
        return sourceRefName;
    }

    /**
     * Setter for SourceRefName
     * @param sourceRefName
     */
    public void setSourceRefName(final String sourceRefName) {
        this.sourceRefName = sourceRefName;
    }

    /**
     * Getter for Status
     * @return PullRequestStatus
     */
    public PullRequestStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final PullRequestStatus status) {
        this.status = status;
    }

    /**
     * Getter for TargetRefName
     * @return String
     */
    public String getTargetRefName() {
        return targetRefName;
    }

    /**
     * Setter for TargetRefName
     * @param targetRefName
     */
    public void setTargetRefName(final String targetRefName) {
        this.targetRefName = targetRefName;
    }

    /**
     * Getter for Title
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title
     * @param title
     */
    public void setTitle(final String title) {
        this.title = title;
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
