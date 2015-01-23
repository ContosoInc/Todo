package com.microsoft.vss.client.distributedtask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Timeline
    extends TimelineReference {
    private UUID lastChangedBy;
    private Date lastChangedOn;
    private List<TimelineRecord> records = new ArrayList<TimelineRecord>();

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
