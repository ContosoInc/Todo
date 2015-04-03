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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcChangesetSearchCriteria {

    private String author;
    private boolean followRenames;
    private String fromDate;
    private int fromId;
    private boolean includeLinks;
    private String path;
    private String toDate;
    private int toId;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public boolean getFollowRenames() {
        return followRenames;
    }

    public void setFollowRenames(final boolean followRenames) {
        this.followRenames = followRenames;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(final String fromDate) {
        this.fromDate = fromDate;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(final int fromId) {
        this.fromId = fromId;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(final String toDate) {
        this.toDate = toDate;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(final int toId) {
        this.toId = toId;
    }
}
