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


public class TfvcChangesetsRequestData {

    private Integer[] changesetIds;
    private int commentLength;
    private boolean includeLinks;

    public Integer[] getChangesetIds() {
        return changesetIds;
    }

    public void setChangesetIds(final Integer[] changesetIds) {
        this.changesetIds = changesetIds;
    }

    public int getCommentLength() {
        return commentLength;
    }

    public void setCommentLength(final int commentLength) {
        this.commentLength = commentLength;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }
}
