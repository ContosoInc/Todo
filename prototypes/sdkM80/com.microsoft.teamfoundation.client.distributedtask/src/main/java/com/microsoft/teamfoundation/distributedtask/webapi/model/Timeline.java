/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public class Timeline
    extends TimelineReference {

    private UUID lastChangedBy;
    private Date lastChangedOn;
    private List<TimelineRecord> records;

    /**
     * Getter for LastChangedBy
     * @return UUID
     */
    public UUID getLastChangedBy() {
        return lastChangedBy;
    }

    /**
     * Setter for LastChangedBy
     * @param lastChangedBy
     */
    public void setLastChangedBy(final UUID lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    /**
     * Getter for LastChangedOn
     * @return Date
     */
    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    /**
     * Setter for LastChangedOn
     * @param lastChangedOn
     */
    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for Records
     * @return List<TimelineRecord>
     */
    public List<TimelineRecord> getRecords() {
        return records;
    }

    /**
     * Setter for Records
     * @param records
     */
    public void setRecords(final List<TimelineRecord> records) {
        this.records = records;
    }
}
