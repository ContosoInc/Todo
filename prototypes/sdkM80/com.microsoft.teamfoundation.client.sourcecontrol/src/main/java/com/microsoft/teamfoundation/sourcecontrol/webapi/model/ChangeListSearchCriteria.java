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

    /**
     * Getter for CompareVersion
     * @return String
     */
    public String getCompareVersion() {
        return compareVersion;
    }

    /**
     * Setter for CompareVersion
     * @param compareVersion
     */
    public void setCompareVersion(final String compareVersion) {
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
     * Getter for FromVersion
     * @return String
     */
    public String getFromVersion() {
        return fromVersion;
    }

    /**
     * Setter for FromVersion
     * @param fromVersion
     */
    public void setFromVersion(final String fromVersion) {
        this.fromVersion = fromVersion;
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
     * @return String
     */
    public String getItemVersion() {
        return itemVersion;
    }

    /**
     * Setter for ItemVersion
     * @param itemVersion
     */
    public void setItemVersion(final String itemVersion) {
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

    /**
     * Getter for ToVersion
     * @return String
     */
    public String getToVersion() {
        return toVersion;
    }

    /**
     * Setter for ToVersion
     * @param toVersion
     */
    public void setToVersion(final String toVersion) {
        this.toVersion = toVersion;
    }

    /**
     * Getter for User
     * @return String
     */
    public String getUser() {
        return user;
    }

    /**
     * Setter for User
     * @param user
     */
    public void setUser(final String user) {
        this.user = user;
    }
}
