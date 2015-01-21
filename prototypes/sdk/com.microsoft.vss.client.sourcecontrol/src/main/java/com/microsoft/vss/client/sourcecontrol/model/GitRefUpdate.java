package com.microsoft.vss.client.sourcecontrol.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitRefUpdate {
    private UUID repositoryId;
    private String name;
    private String oldObjectId;
    private String newObjectId;

    @JsonProperty("repositoryId")
    public UUID getRepositoryId() {
        return repositoryId;
    }

    @JsonProperty("repositoryId")
    public void setRepositoryId(UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(final String name) {
        this.name = name;
    }

    @JsonProperty("oldObjectId")
    public String getOldObjectId() {
        return oldObjectId;
    }

    @JsonProperty("oldObjectId")
    public void setOldObjectId(final String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    @JsonProperty("newObjectId")
    public String getNewObjectId() {
        return newObjectId;
    }

    @JsonProperty("newObjectId")
    public void setNewObjectId(final String newObjectId) {
        this.newObjectId = newObjectId;
    }

}
