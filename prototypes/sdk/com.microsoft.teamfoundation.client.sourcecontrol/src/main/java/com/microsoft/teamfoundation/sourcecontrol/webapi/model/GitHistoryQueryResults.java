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

    public String getStartingCommitId() {
        return startingCommitId;
    }

    public void setStartingCommitId(final String startingCommitId) {
        this.startingCommitId = startingCommitId;
    }

    public int getUnpopulatedCount() {
        return unpopulatedCount;
    }

    public void setUnpopulatedCount(final int unpopulatedCount) {
        this.unpopulatedCount = unpopulatedCount;
    }

    public int getUnprocessedCount() {
        return unprocessedCount;
    }

    public void setUnprocessedCount(final int unprocessedCount) {
        this.unprocessedCount = unprocessedCount;
    }
}
