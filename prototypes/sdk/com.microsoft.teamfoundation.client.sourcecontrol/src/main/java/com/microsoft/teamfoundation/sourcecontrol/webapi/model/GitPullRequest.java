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
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRepository;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.IdentityRefWithVote;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.PullRequestAsyncStatus;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.PullRequestStatus;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import com.microsoft.vss.client.core.json.JObject;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitPullRequest {

    private ReferenceLinks _links;
    private Date closedDate;
    private JObject codeReview;
    private IdentityRef createdBy;
    private Date creationDate;
    private String description;
    private GitCommitRef lastMergeCommit;
    private GitCommitRef lastMergeSourceCommit;
    private GitCommitRef lastMergeTargetCommit;
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

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(final Date closedDate) {
        this.closedDate = closedDate;
    }

    public JObject getCodeReview() {
        return codeReview;
    }

    public void setCodeReview(final JObject codeReview) {
        this.codeReview = codeReview;
    }

    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public GitCommitRef getLastMergeCommit() {
        return lastMergeCommit;
    }

    public void setLastMergeCommit(final GitCommitRef lastMergeCommit) {
        this.lastMergeCommit = lastMergeCommit;
    }

    public GitCommitRef getLastMergeSourceCommit() {
        return lastMergeSourceCommit;
    }

    public void setLastMergeSourceCommit(final GitCommitRef lastMergeSourceCommit) {
        this.lastMergeSourceCommit = lastMergeSourceCommit;
    }

    public GitCommitRef getLastMergeTargetCommit() {
        return lastMergeTargetCommit;
    }

    public void setLastMergeTargetCommit(final GitCommitRef lastMergeTargetCommit) {
        this.lastMergeTargetCommit = lastMergeTargetCommit;
    }

    public UUID getMergeId() {
        return mergeId;
    }

    public void setMergeId(final UUID mergeId) {
        this.mergeId = mergeId;
    }

    public PullRequestAsyncStatus getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(final PullRequestAsyncStatus mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public int getPullRequestId() {
        return pullRequestId;
    }

    public void setPullRequestId(final int pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public IdentityRefWithVote[] getReviewers() {
        return reviewers;
    }

    public void setReviewers(final IdentityRefWithVote[] reviewers) {
        this.reviewers = reviewers;
    }

    public String getSourceRefName() {
        return sourceRefName;
    }

    public void setSourceRefName(final String sourceRefName) {
        this.sourceRefName = sourceRefName;
    }

    public PullRequestStatus getStatus() {
        return status;
    }

    public void setStatus(final PullRequestStatus status) {
        this.status = status;
    }

    public String getTargetRefName() {
        return targetRefName;
    }

    public void setTargetRefName(final String targetRefName) {
        this.targetRefName = targetRefName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
