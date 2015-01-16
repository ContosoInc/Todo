package com.microsoft.vss.client.build.model;

import java.util.UUID;

public class TaskDefinitionReference {
    private UUID id;
    private String versionSpec;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getVersionSpec() {
        return versionSpec;
    }

    public void setVersionSpec(final String versionSpec) {
        this.versionSpec = versionSpec;
    }
}
