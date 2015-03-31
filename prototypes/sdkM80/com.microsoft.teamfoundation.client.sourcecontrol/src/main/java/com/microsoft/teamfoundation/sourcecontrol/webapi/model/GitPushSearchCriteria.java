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

public class GitPushSearchCriteria {

    private Date fromDate;
    private boolean includeLinks;
    private boolean includeRefUpdates;
    private UUID pusherId;
    private String refName;
    private Date toDate;

    /**
     * Getter for FromDate
     * @return Date
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Setter for FromDate
     * @param fromDate
     */
    public void setFromDate(final Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for IncludeLinks
     * @return boolean
     */
    public boolean getIncludeLinks() {
        return includeLinks;
    }

    /**
     * Setter for IncludeLinks
     * @param includeLinks
     */
    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    /**
     * Getter for IncludeRefUpdates
     * @return boolean
     */
    public boolean getIncludeRefUpdates() {
        return includeRefUpdates;
    }

    /**
     * Setter for IncludeRefUpdates
     * @param includeRefUpdates
     */
    public void setIncludeRefUpdates(final boolean includeRefUpdates) {
        this.includeRefUpdates = includeRefUpdates;
    }

    /**
     * Getter for PusherId
     * @return UUID
     */
    public UUID getPusherId() {
        return pusherId;
    }

    /**
     * Setter for PusherId
     * @param pusherId
     */
    public void setPusherId(final UUID pusherId) {
        this.pusherId = pusherId;
    }

    /**
     * Getter for RefName
     * @return String
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Setter for RefName
     * @param refName
     */
    public void setRefName(final String refName) {
        this.refName = refName;
    }

    /**
     * Getter for ToDate
     * @return Date
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * Setter for ToDate
     * @param toDate
     */
    public void setToDate(final Date toDate) {
        this.toDate = toDate;
    }
}
