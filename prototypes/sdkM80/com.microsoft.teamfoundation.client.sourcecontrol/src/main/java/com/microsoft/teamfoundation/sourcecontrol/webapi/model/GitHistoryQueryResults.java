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

public class GitHistoryQueryResults
    extends HistoryQueryResults<GitItem> {

    private String startingCommitId;
    private int unpopulatedCount;
    private int unprocessedCount;

    /**
     * Getter for StartingCommitId
     * @return String
     */
    public String getStartingCommitId() {
        return startingCommitId;
    }

    /**
     * Setter for StartingCommitId
     * @param startingCommitId
     */
    public void setStartingCommitId(final String startingCommitId) {
        this.startingCommitId = startingCommitId;
    }

    /**
     * Getter for UnpopulatedCount
     * @return int
     */
    public int getUnpopulatedCount() {
        return unpopulatedCount;
    }

    /**
     * Setter for UnpopulatedCount
     * @param unpopulatedCount
     */
    public void setUnpopulatedCount(final int unpopulatedCount) {
        this.unpopulatedCount = unpopulatedCount;
    }

    /**
     * Getter for UnprocessedCount
     * @return int
     */
    public int getUnprocessedCount() {
        return unprocessedCount;
    }

    /**
     * Setter for UnprocessedCount
     * @param unprocessedCount
     */
    public void setUnprocessedCount(final int unprocessedCount) {
        this.unprocessedCount = unprocessedCount;
    }
}
