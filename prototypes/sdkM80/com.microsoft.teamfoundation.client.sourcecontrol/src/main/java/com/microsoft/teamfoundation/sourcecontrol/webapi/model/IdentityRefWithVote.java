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

public class IdentityRefWithVote
    extends IdentityRef {

    private boolean isRequired;
    private String reviewerUrl;
    private short vote;
    private IdentityRefWithVote[] votedFor;

    /**
     * Getter for IsRequired
     * @return boolean
     */
    public boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Setter for IsRequired
     * @param isRequired
     */
    public void setIsRequired(final boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * Getter for ReviewerUrl
     * @return String
     */
    public String getReviewerUrl() {
        return reviewerUrl;
    }

    /**
     * Setter for ReviewerUrl
     * @param reviewerUrl
     */
    public void setReviewerUrl(final String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    /**
     * Getter for Vote
     * @return short
     */
    public short getVote() {
        return vote;
    }

    /**
     * Setter for Vote
     * @param vote
     */
    public void setVote(final short vote) {
        this.vote = vote;
    }

    /**
     * Getter for VotedFor
     * @return IdentityRefWithVote[]
     */
    public IdentityRefWithVote[] getVotedFor() {
        return votedFor;
    }

    /**
     * Setter for VotedFor
     * @param votedFor
     */
    public void setVotedFor(final IdentityRefWithVote[] votedFor) {
        this.votedFor = votedFor;
    }
}
