package com.microsoft.vss.client.distributedtask.model;

import java.util.UUID;

public class TaskAgentPoolReference {
    private int id;
    private UUID scope;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public UUID getScope() {
        return scope;
    }

    public void setScope(final UUID scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
