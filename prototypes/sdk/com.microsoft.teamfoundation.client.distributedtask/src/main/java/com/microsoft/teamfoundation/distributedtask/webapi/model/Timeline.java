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
import com.fasterxml.jackson.annotation.JsonProperty;

public class Timeline
    extends TimelineReference {

    private UUID lastChangedBy;
    private Date lastChangedOn;
    private List<TimelineRecord> records;

    public UUID getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(final UUID lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public List<TimelineRecord> getRecords() {
        return records;
    }

    public void setRecords(final List<TimelineRecord> records) {
        this.records = records;
    }
}
