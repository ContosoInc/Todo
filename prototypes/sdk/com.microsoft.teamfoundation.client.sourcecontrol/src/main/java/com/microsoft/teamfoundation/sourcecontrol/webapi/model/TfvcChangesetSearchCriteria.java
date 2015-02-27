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

public class TfvcChangesetSearchCriteria {

    private String author;
    private boolean followRenames;
    private String fromDate;
    private int fromId;
    private boolean includeLinks;
    private String itemPath;
    private String toDate;
    private int toId;
    private TfvcVersionDescriptor versionDescriptor;

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

    public String getItemPath() {
        return itemPath;
    }

    public void setItemPath(final String itemPath) {
        this.itemPath = itemPath;
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

    public TfvcVersionDescriptor getVersionDescriptor() {
        return versionDescriptor;
    }

    public void setVersionDescriptor(final TfvcVersionDescriptor versionDescriptor) {
        this.versionDescriptor = versionDescriptor;
    }
}
