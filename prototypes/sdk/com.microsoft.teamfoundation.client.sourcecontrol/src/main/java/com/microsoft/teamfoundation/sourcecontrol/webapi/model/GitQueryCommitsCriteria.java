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

import java.util.List;

public class GitQueryCommitsCriteria {

    private int $skip;
    private int $top;
    private String author;
    private GitVersionDescriptor compareVersion;
    private boolean excludeDeletes;
    private String fromCommitId;
    private String fromDate;
    private List<String> ids;
    private boolean includeLinks;
    private String itemPath;
    private GitVersionDescriptor itemVersion;
    private String toCommitId;
    private String toDate;
    private String user;

    public int get$skip() {
        return $skip;
    }

    public void set$skip(final int $skip) {
        this.$skip = $skip;
    }

    public int get$top() {
        return $top;
    }

    public void set$top(final int $top) {
        this.$top = $top;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public GitVersionDescriptor getCompareVersion() {
        return compareVersion;
    }

    public void setCompareVersion(final GitVersionDescriptor compareVersion) {
        this.compareVersion = compareVersion;
    }

    public boolean getExcludeDeletes() {
        return excludeDeletes;
    }

    public void setExcludeDeletes(final boolean excludeDeletes) {
        this.excludeDeletes = excludeDeletes;
    }

    public String getFromCommitId() {
        return fromCommitId;
    }

    public void setFromCommitId(final String fromCommitId) {
        this.fromCommitId = fromCommitId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(final String fromDate) {
        this.fromDate = fromDate;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(final List<String> ids) {
        this.ids = ids;
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

    public GitVersionDescriptor getItemVersion() {
        return itemVersion;
    }

    public void setItemVersion(final GitVersionDescriptor itemVersion) {
        this.itemVersion = itemVersion;
    }

    public String getToCommitId() {
        return toCommitId;
    }

    public void setToCommitId(final String toCommitId) {
        this.toCommitId = toCommitId;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(final String toDate) {
        this.toDate = toDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }
}
