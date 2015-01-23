package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;
import java.util.UUID;

public class TimelineReference {
    private UUID id;
    private int changeId;
    private URI location;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public int getChangeId() {
        return changeId;
    }

    public void setChangeId(final int changeId) {
        this.changeId = changeId;
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(final URI location) {
        this.location = location;
    }

}
