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

public class GitQueryCommitsCriteria {

    private String author;
    private String committer;
    private GitVersionDescriptor compareVersion;
    private boolean excludeDeletes;
    private String fromCommitId;
    private String fromDate;
    private List<String> ids;
    private boolean includeLinks;
    private String itemPath;
    private GitVersionDescriptor itemVersion;
    private int skip;
    private String toCommitId;
    private String toDate;
    private int top;

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
     * Getter for Committer
     * @return String
     */
    public String getCommitter() {
        return committer;
    }

    /**
     * Setter for Committer
     * @param committer
     */
    public void setCommitter(final String committer) {
        this.committer = committer;
    }

    /**
     * Getter for CompareVersion
     * @return GitVersionDescriptor
     */
    public GitVersionDescriptor getCompareVersion() {
        return compareVersion;
    }

    /**
     * Setter for CompareVersion
     * @param compareVersion
     */
    public void setCompareVersion(final GitVersionDescriptor compareVersion) {
        this.compareVersion = compareVersion;
    }

    /**
     * Getter for ExcludeDeletes
     * @return boolean
     */
    public boolean getExcludeDeletes() {
        return excludeDeletes;
    }

    /**
     * Setter for ExcludeDeletes
     * @param excludeDeletes
     */
    public void setExcludeDeletes(final boolean excludeDeletes) {
        this.excludeDeletes = excludeDeletes;
    }

    /**
     * Getter for FromCommitId
     * @return String
     */
    public String getFromCommitId() {
        return fromCommitId;
    }

    /**
     * Setter for FromCommitId
     * @param fromCommitId
     */
    public void setFromCommitId(final String fromCommitId) {
        this.fromCommitId = fromCommitId;
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
     * Getter for Ids
     * @return List<String>
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * Setter for Ids
     * @param ids
     */
    public void setIds(final List<String> ids) {
        this.ids = ids;
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
     * Getter for ItemVersion
     * @return GitVersionDescriptor
     */
    public GitVersionDescriptor getItemVersion() {
        return itemVersion;
    }

    /**
     * Setter for ItemVersion
     * @param itemVersion
     */
    public void setItemVersion(final GitVersionDescriptor itemVersion) {
        this.itemVersion = itemVersion;
    }

    /**
     * Getter for Skip
     * @return int
     */
    public int getSkip() {
        return skip;
    }

    /**
     * Setter for Skip
     * @param skip
     */
    public void setSkip(final int skip) {
        this.skip = skip;
    }

    /**
     * Getter for ToCommitId
     * @return String
     */
    public String getToCommitId() {
        return toCommitId;
    }

    /**
     * Setter for ToCommitId
     * @param toCommitId
     */
    public void setToCommitId(final String toCommitId) {
        this.toCommitId = toCommitId;
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
     * Getter for Top
     * @return int
     */
    public int getTop() {
        return top;
    }

    /**
     * Setter for Top
     * @param top
     */
    public void setTop(final int top) {
        this.top = top;
    }
}
