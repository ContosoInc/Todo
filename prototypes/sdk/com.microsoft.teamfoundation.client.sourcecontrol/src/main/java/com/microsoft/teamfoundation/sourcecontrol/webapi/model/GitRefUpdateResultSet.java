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

    public int getCountFailed() {
        return countFailed;
    }

    public void setCountFailed(final int countFailed) {
        this.countFailed = countFailed;
    }

    public int getCountSucceeded() {
        return countSucceeded;
    }

    public void setCountSucceeded(final int countSucceeded) {
        this.countSucceeded = countSucceeded;
    }

    public UUID getPushCorrelationId() {
        return pushCorrelationId;
    }

    public void setPushCorrelationId(final UUID pushCorrelationId) {
        this.pushCorrelationId = pushCorrelationId;
    }

    public HashMap<UUID,Integer> getPushIds() {
        return pushIds;
    }

    public void setPushIds(final HashMap<UUID,Integer> pushIds) {
        this.pushIds = pushIds;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(final Date pushTime) {
        this.pushTime = pushTime;
    }

    public List<GitRefUpdateResult> getResults() {
        return results;
    }

    public void setResults(final List<GitRefUpdateResult> results) {
        this.results = results;
    }
}
