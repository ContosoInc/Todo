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

public class TfvcShelvesetRequestData {

    private boolean includeDetails;
    private boolean includeLinks;
    private boolean includeWorkItems;
    private int maxChangeCount;
    private int maxCommentLength;
    private String name;
    private String owner;

    public boolean getIncludeDetails() {
        return includeDetails;
    }

    public void setIncludeDetails(final boolean includeDetails) {
        this.includeDetails = includeDetails;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public boolean getIncludeWorkItems() {
        return includeWorkItems;
    }

    public void setIncludeWorkItems(final boolean includeWorkItems) {
        this.includeWorkItems = includeWorkItems;
    }

    public int getMaxChangeCount() {
        return maxChangeCount;
    }

    public void setMaxChangeCount(final int maxChangeCount) {
        this.maxChangeCount = maxChangeCount;
    }

    public int getMaxCommentLength() {
        return maxCommentLength;
    }

    public void setMaxCommentLength(final int maxCommentLength) {
        this.maxCommentLength = maxCommentLength;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }
}
