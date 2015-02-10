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

public class ChangeListSearchCriteria {

    private String compareVersion;
    private boolean excludeDeletes;
    private boolean followRenames;
    private String fromDate;
    private String fromVersion;
    private String itemPath;
    private String itemVersion;
    private int skip;
    private String toDate;
    private int top;
    private String toVersion;
    private String user;

    public String getCompareVersion() {
        return compareVersion;
    }

    public void setCompareVersion(final String compareVersion) {
        this.compareVersion = compareVersion;
    }

    public boolean getExcludeDeletes() {
        return excludeDeletes;
    }

    public void setExcludeDeletes(final boolean excludeDeletes) {
        this.excludeDeletes = excludeDeletes;
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

    public String getFromVersion() {
        return fromVersion;
    }

    public void setFromVersion(final String fromVersion) {
        this.fromVersion = fromVersion;
    }

    public String getItemPath() {
        return itemPath;
    }

    public void setItemPath(final String itemPath) {
        this.itemPath = itemPath;
    }

    public String getItemVersion() {
        return itemVersion;
    }

    public void setItemVersion(final String itemVersion) {
        this.itemVersion = itemVersion;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(final int skip) {
        this.skip = skip;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(final String toDate) {
        this.toDate = toDate;
    }

    public int getTop() {
        return top;
    }

    public void setTop(final int top) {
        this.top = top;
    }

    public String getToVersion() {
        return toVersion;
    }

    public void setToVersion(final String toVersion) {
        this.toVersion = toVersion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }
}
