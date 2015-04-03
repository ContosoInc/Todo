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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.IdentityRefWithVote;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
