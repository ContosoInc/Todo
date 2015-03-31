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

public class GitCommitDiffs {

    private int aheadCount;
    private boolean allChangesIncluded;
    private int behindCount;
    private HashMap<VersionControlChangeType,Integer> changeCounts;
    private List<GitChange> changes;
    private String commonCommit;

    /**
     * Getter for AheadCount
     * @return int
     */
    public int getAheadCount() {
        return aheadCount;
    }

    /**
     * Setter for AheadCount
     * @param aheadCount
     */
    public void setAheadCount(final int aheadCount) {
        this.aheadCount = aheadCount;
    }

    /**
     * Getter for AllChangesIncluded
     * @return boolean
     */
    public boolean getAllChangesIncluded() {
        return allChangesIncluded;
    }

    /**
     * Setter for AllChangesIncluded
     * @param allChangesIncluded
     */
    public void setAllChangesIncluded(final boolean allChangesIncluded) {
        this.allChangesIncluded = allChangesIncluded;
    }

    /**
     * Getter for BehindCount
     * @return int
     */
    public int getBehindCount() {
        return behindCount;
    }

    /**
     * Setter for BehindCount
     * @param behindCount
     */
    public void setBehindCount(final int behindCount) {
        this.behindCount = behindCount;
    }

    /**
     * Getter for ChangeCounts
     * @return HashMap<VersionControlChangeType,Integer>
     */
    public HashMap<VersionControlChangeType,Integer> getChangeCounts() {
        return changeCounts;
    }

    /**
     * Setter for ChangeCounts
     * @param changeCounts
     */
    public void setChangeCounts(final HashMap<VersionControlChangeType,Integer> changeCounts) {
        this.changeCounts = changeCounts;
    }

    /**
     * Getter for Changes
     * @return List<GitChange>
     */
    public List<GitChange> getChanges() {
        return changes;
    }

    /**
     * Setter for Changes
     * @param changes
     */
    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }

    /**
     * Getter for CommonCommit
     * @return String
     */
    public String getCommonCommit() {
        return commonCommit;
    }

    /**
     * Setter for CommonCommit
     * @param commonCommit
     */
    public void setCommonCommit(final String commonCommit) {
        this.commonCommit = commonCommit;
    }
}
