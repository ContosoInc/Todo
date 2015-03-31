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

public class HistoryQueryResults<T> {

    private boolean moreResultsAvailable;
    private List<HistoryEntry<T>> results;

    /**
     * Getter for MoreResultsAvailable
     * @return boolean
     */
    public boolean getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Setter for MoreResultsAvailable
     * @param moreResultsAvailable
     */
    public void setMoreResultsAvailable(final boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    /**
     * Getter for Results
     * @return List<HistoryEntry<T>>
     */
    public List<HistoryEntry<T>> getResults() {
        return results;
    }

    /**
     * Setter for Results
     * @param results
     */
    public void setResults(final List<HistoryEntry<T>> results) {
        this.results = results;
    }
}
