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

public class IdentityRefWithVote
    extends IdentityRef {

    private boolean isRequired;
    private String reviewerUrl;
    private short vote;
    private IdentityRefWithVote[] votedFor;

    public boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(final boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getReviewerUrl() {
        return reviewerUrl;
    }

    public void setReviewerUrl(final String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    public short getVote() {
        return vote;
    }

    public void setVote(final short vote) {
        this.vote = vote;
    }

    public IdentityRefWithVote[] getVotedFor() {
        return votedFor;
    }

    public void setVotedFor(final IdentityRefWithVote[] votedFor) {
        this.votedFor = votedFor;
    }
}
