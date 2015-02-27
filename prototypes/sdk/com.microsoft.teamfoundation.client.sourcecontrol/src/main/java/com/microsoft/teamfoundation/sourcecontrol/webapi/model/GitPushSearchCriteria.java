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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(final Date fromDate) {
        this.fromDate = fromDate;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public boolean getIncludeRefUpdates() {
        return includeRefUpdates;
    }

    public void setIncludeRefUpdates(final boolean includeRefUpdates) {
        this.includeRefUpdates = includeRefUpdates;
    }

    public UUID getPusherId() {
        return pusherId;
    }

    public void setPusherId(final UUID pusherId) {
        this.pusherId = pusherId;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(final String refName) {
        this.refName = refName;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(final Date toDate) {
        this.toDate = toDate;
    }
}
