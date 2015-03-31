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

public class GitRefUpdateResultSet {

    private int countFailed;
    private int countSucceeded;
    private UUID pushCorrelationId;
    private HashMap<UUID,Integer> pushIds;
    private Date pushTime;
    private List<GitRefUpdateResult> results;

    /**
     * Getter for CountFailed
     * @return int
     */
    public int getCountFailed() {
        return countFailed;
    }

    /**
     * Setter for CountFailed
     * @param countFailed
     */
    public void setCountFailed(final int countFailed) {
        this.countFailed = countFailed;
    }

    /**
     * Getter for CountSucceeded
     * @return int
     */
    public int getCountSucceeded() {
        return countSucceeded;
    }

    /**
     * Setter for CountSucceeded
     * @param countSucceeded
     */
    public void setCountSucceeded(final int countSucceeded) {
        this.countSucceeded = countSucceeded;
    }

    /**
     * Getter for PushCorrelationId
     * @return UUID
     */
    public UUID getPushCorrelationId() {
        return pushCorrelationId;
    }

    /**
     * Setter for PushCorrelationId
     * @param pushCorrelationId
     */
    public void setPushCorrelationId(final UUID pushCorrelationId) {
        this.pushCorrelationId = pushCorrelationId;
    }

    /**
     * Getter for PushIds
     * @return HashMap<UUID,Integer>
     */
    public HashMap<UUID,Integer> getPushIds() {
        return pushIds;
    }

    /**
     * Setter for PushIds
     * @param pushIds
     */
    public void setPushIds(final HashMap<UUID,Integer> pushIds) {
        this.pushIds = pushIds;
    }

    /**
     * Getter for PushTime
     * @return Date
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * Setter for PushTime
     * @param pushTime
     */
    public void setPushTime(final Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * Getter for Results
     * @return List<GitRefUpdateResult>
     */
    public List<GitRefUpdateResult> getResults() {
        return results;
    }

    /**
     * Setter for Results
     * @param results
     */
    public void setResults(final List<GitRefUpdateResult> results) {
        this.results = results;
    }
}
