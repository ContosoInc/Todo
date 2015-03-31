/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;

public class BuildSummary {

    private ShallowReference build;
    private Date finishTime;
    private boolean keepForever;
    private String quality;
    private BuildReason reason;
    private IdentityRef requestedFor;
    private Date startTime;
    private BuildStatus status;

    /**
     * Getter for Build
     * @return ShallowReference
     */
    public ShallowReference getBuild() {
        return build;
    }

    /**
     * Setter for Build
     * @param build
     */
    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    /**
     * Getter for FinishTime
     * @return Date
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * Setter for FinishTime
     * @param finishTime
     */
    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * Getter for KeepForever
     * @return boolean
     */
    public boolean getKeepForever() {
        return keepForever;
    }

    /**
     * Setter for KeepForever
     * @param keepForever
     */
    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    /**
     * Getter for Quality
     * @return String
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Setter for Quality
     * @param quality
     */
    public void setQuality(final String quality) {
        this.quality = quality;
    }

    /**
     * Getter for Reason
     * @return BuildReason
     */
    public BuildReason getReason() {
        return reason;
    }

    /**
     * Setter for Reason
     * @param reason
     */
    public void setReason(final BuildReason reason) {
        this.reason = reason;
    }

    /**
     * Getter for RequestedFor
     * @return IdentityRef
     */
    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    /**
     * Setter for RequestedFor
     * @param requestedFor
     */
    public void setRequestedFor(final IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    /**
     * Getter for StartTime
     * @return Date
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Setter for StartTime
     * @param startTime
     */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for Status
     * @return BuildStatus
     */
    public BuildStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final BuildStatus status) {
        this.status = status;
    }
}
