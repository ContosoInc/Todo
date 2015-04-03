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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class HistoryQueryResults<T> {

    private boolean moreResultsAvailable;
    private List<HistoryEntry<T>> results;

    public boolean getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    public void setMoreResultsAvailable(final boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public List<HistoryEntry<T>> getResults() {
        return results;
    }

    public void setResults(final List<HistoryEntry<T>> results) {
        this.results = results;
    }
}
