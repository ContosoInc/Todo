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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    @JsonProperty("user")
    public String getCommitter() {
        return committer;
    }

    @JsonProperty("user")
    public void setCommitter(final String committer) {
        this.committer = committer;
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

    @JsonProperty("$skip")
    public int getSkip() {
        return skip;
    }

    @JsonProperty("$skip")
    public void setSkip(final int skip) {
        this.skip = skip;
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

    @JsonProperty("$top")
    public int getTop() {
        return top;
    }

    @JsonProperty("$top")
    public void setTop(final int top) {
        this.top = top;
    }
}
