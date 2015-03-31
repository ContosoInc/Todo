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

public class GitPullRequestSearchCriteria {

    private UUID creatorId;
    private boolean includeLinks;
    private UUID repositoryId;
    private UUID reviewerId;
    private String sourceRefName;
    private PullRequestStatus status;
    private String targetRefName;

    /**
     * Getter for CreatorId
     * @return UUID
     */
    public UUID getCreatorId() {
        return creatorId;
    }

    /**
     * Setter for CreatorId
     * @param creatorId
     */
    public void setCreatorId(final UUID creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * Getter for IncludeLinks
     * @return boolean
     */
    public boolean getIncludeLinks() {
        return includeLinks;
    }

    /**
     * Setter for IncludeLinks
     * @param includeLinks
     */
    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    /**
     * Getter for RepositoryId
     * @return UUID
     */
    public UUID getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId
     * @param repositoryId
     */
    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for ReviewerId
     * @return UUID
     */
    public UUID getReviewerId() {
        return reviewerId;
    }

    /**
     * Setter for ReviewerId
     * @param reviewerId
     */
    public void setReviewerId(final UUID reviewerId) {
        this.reviewerId = reviewerId;
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
}
