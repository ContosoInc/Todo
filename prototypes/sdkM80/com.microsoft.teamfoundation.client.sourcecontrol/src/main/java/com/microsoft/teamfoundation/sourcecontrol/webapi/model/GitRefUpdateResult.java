/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class GitRefUpdateResult {

    private String customMessage;
    private String name;
    private String newObjectId;
    private String oldObjectId;
    private String rejectedBy;
    private UUID repositoryId;
    private boolean success;
    private GitRefUpdateStatus updateStatus;

    /**
     * Getter for CustomMessage
     * @return String
     */
    public String getCustomMessage() {
        return customMessage;
    }

    /**
     * Setter for CustomMessage
     * @param customMessage
     */
    public void setCustomMessage(final String customMessage) {
        this.customMessage = customMessage;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for NewObjectId
     * @return String
     */
    public String getNewObjectId() {
        return newObjectId;
    }

    /**
     * Setter for NewObjectId
     * @param newObjectId
     */
    public void setNewObjectId(final String newObjectId) {
        this.newObjectId = newObjectId;
    }

    /**
     * Getter for OldObjectId
     * @return String
     */
    public String getOldObjectId() {
        return oldObjectId;
    }

    /**
     * Setter for OldObjectId
     * @param oldObjectId
     */
    public void setOldObjectId(final String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    /**
     * Getter for RejectedBy
     * @return String
     */
    public String getRejectedBy() {
        return rejectedBy;
    }

    /**
     * Setter for RejectedBy
     * @param rejectedBy
     */
    public void setRejectedBy(final String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    /**
     * Getter for RepositoryId
     * @return UUID
     */
    public UUID getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId
     * @param repositoryId
     */
    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for Success
     * @return boolean
     */
    public boolean getSuccess() {
        return success;
    }

    /**
     * Setter for Success
     * @param success
     */
    public void setSuccess(final boolean success) {
        this.success = success;
    }

    /**
     * Getter for UpdateStatus
     * @return GitRefUpdateStatus
     */
    public GitRefUpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    /**
     * Setter for UpdateStatus
     * @param updateStatus
     */
    public void setUpdateStatus(final GitRefUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }
}
