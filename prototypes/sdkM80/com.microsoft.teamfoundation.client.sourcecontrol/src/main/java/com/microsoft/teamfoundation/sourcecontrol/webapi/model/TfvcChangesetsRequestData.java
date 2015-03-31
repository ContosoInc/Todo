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

public class TfvcChangesetsRequestData {

    private Integer[] changesetIds;
    private int commentLength;
    private boolean includeLinks;

    /**
     * Getter for ChangesetIds
     * @return Integer[]
     */
    public Integer[] getChangesetIds() {
        return changesetIds;
    }

    /**
     * Setter for ChangesetIds
     * @param changesetIds
     */
    public void setChangesetIds(final Integer[] changesetIds) {
        this.changesetIds = changesetIds;
    }

    /**
     * Getter for CommentLength
     * @return int
     */
    public int getCommentLength() {
        return commentLength;
    }

    /**
     * Setter for CommentLength
     * @param commentLength
     */
    public void setCommentLength(final int commentLength) {
        this.commentLength = commentLength;
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
}
