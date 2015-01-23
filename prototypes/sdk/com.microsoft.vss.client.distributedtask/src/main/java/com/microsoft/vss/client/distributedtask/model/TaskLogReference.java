package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;

public class TaskLogReference {
    private int id;
    private URI location;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(final URI location) {
        this.location = location;
    }

}
