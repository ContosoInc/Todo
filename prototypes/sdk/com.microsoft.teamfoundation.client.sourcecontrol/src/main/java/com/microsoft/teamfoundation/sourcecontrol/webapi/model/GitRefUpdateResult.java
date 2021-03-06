/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.util.UUID;

public class GitRefUpdateResult {

    private String customMessage;
    private String name;
    private String newObjectId;
    private String oldObjectId;
    private String rejectedBy;
    private UUID repositoryId;
    private boolean success;
    private GitRefUpdateStatus updateStatus;

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(final String customMessage) {
        this.customMessage = customMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(final String newObjectId) {
        this.newObjectId = newObjectId;
    }

    public String getOldObjectId() {
        return oldObjectId;
    }

    public void setOldObjectId(final String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(final String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public GitRefUpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(final GitRefUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }
}
