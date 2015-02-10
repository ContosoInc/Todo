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

public class GitCommitDiffs {

    private int aheadCount;
    private boolean allChangesIncluded;
    private int behindCount;
    private HashMap<VersionControlChangeType,Integer> changeCounts;
    private List<GitChange> changes;
    private String commonCommit;

    public int getAheadCount() {
        return aheadCount;
    }

    public void setAheadCount(final int aheadCount) {
        this.aheadCount = aheadCount;
    }

    public boolean getAllChangesIncluded() {
        return allChangesIncluded;
    }

    public void setAllChangesIncluded(final boolean allChangesIncluded) {
        this.allChangesIncluded = allChangesIncluded;
    }

    public int getBehindCount() {
        return behindCount;
    }

    public void setBehindCount(final int behindCount) {
        this.behindCount = behindCount;
    }

    public HashMap<VersionControlChangeType,Integer> getChangeCounts() {
        return changeCounts;
    }

    public void setChangeCounts(final HashMap<VersionControlChangeType,Integer> changeCounts) {
        this.changeCounts = changeCounts;
    }

    public List<GitChange> getChanges() {
        return changes;
    }

    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }

    public String getCommonCommit() {
        return commonCommit;
    }

    public void setCommonCommit(final String commonCommit) {
        this.commonCommit = commonCommit;
    }
}
