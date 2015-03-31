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

public class GitBranchStats {

    private int aheadCount;
    private int behindCount;
    private GitCommitRef commit;
    private boolean isBaseVersion;
    private String name;

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
     * Getter for Commit
     * @return GitCommitRef
     */
    public GitCommitRef getCommit() {
        return commit;
    }

    /**
     * Setter for Commit
     * @param commit
     */
    public void setCommit(final GitCommitRef commit) {
        this.commit = commit;
    }

    /**
     * Getter for IsBaseVersion
     * @return boolean
     */
    public boolean getIsBaseVersion() {
        return isBaseVersion;
    }

    /**
     * Setter for IsBaseVersion
     * @param isBaseVersion
     */
    public void setIsBaseVersion(final boolean isBaseVersion) {
        this.isBaseVersion = isBaseVersion;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
