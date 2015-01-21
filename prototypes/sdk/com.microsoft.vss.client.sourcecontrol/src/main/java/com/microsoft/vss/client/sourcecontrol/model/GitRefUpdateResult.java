package com.microsoft.vss.client.sourcecontrol.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitRefUpdateStatus;

public class GitRefUpdateResult {
    private UUID repositoryId;
    private String name;
    private String oldObjectId;
    private String newObjectId;
    private GitRefUpdateStatus updateStatus;
    private String rejectedBy;
    private String customMessage;
    private boolean success;

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldObjectId() {
        return oldObjectId;
    }

    public void setOldObjectId(String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    public String getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(String newObjectId) {
        this.newObjectId = newObjectId;
    }

    public GitRefUpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(GitRefUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return updateStatus == GitRefUpdateStatus.Succeeded;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
