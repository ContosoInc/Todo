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

    /**
     * Getter for Author
     * @return String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for Author
     * @param author
     */
    public void setAuthor(final String author) {
        this.author = author;
    }

    /**
     * Getter for FollowRenames
     * @return boolean
     */
    public boolean getFollowRenames() {
        return followRenames;
    }

    /**
     * Setter for FollowRenames
     * @param followRenames
     */
    public void setFollowRenames(final boolean followRenames) {
        this.followRenames = followRenames;
    }

    /**
     * Getter for FromDate
     * @return String
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Setter for FromDate
     * @param fromDate
     */
    public void setFromDate(final String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for FromId
     * @return int
     */
    public int getFromId() {
        return fromId;
    }

    /**
     * Setter for FromId
     * @param fromId
     */
    public void setFromId(final int fromId) {
        this.fromId = fromId;
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
     * Getter for ItemPath
     * @return String
     */
    public String getItemPath() {
        return itemPath;
    }

    /**
     * Setter for ItemPath
     * @param itemPath
     */
    public void setItemPath(final String itemPath) {
        this.itemPath = itemPath;
    }

    /**
     * Getter for ToDate
     * @return String
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Setter for ToDate
     * @param toDate
     */
    public void setToDate(final String toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter for ToId
     * @return int
     */
    public int getToId() {
        return toId;
    }

    /**
     * Setter for ToId
     * @param toId
     */
    public void setToId(final int toId) {
        this.toId = toId;
    }

    /**
     * Getter for VersionDescriptor
     * @return TfvcVersionDescriptor
     */
    public TfvcVersionDescriptor getVersionDescriptor() {
        return versionDescriptor;
    }

    /**
     * Setter for VersionDescriptor
     * @param versionDescriptor
     */
    public void setVersionDescriptor(final TfvcVersionDescriptor versionDescriptor) {
        this.versionDescriptor = versionDescriptor;
    }
}
