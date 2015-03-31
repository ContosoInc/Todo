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

public class TaskInstance
    extends TaskReference {

    private boolean alwaysRun;
    private boolean continueOnError;
    private String displayName;
    private boolean enabled;
    private UUID instanceId;

    /**
     * Getter for AlwaysRun
     * @return boolean
     */
    public boolean getAlwaysRun() {
        return alwaysRun;
    }

    /**
     * Setter for AlwaysRun
     * @param alwaysRun
     */
    public void setAlwaysRun(final boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    /**
     * Getter for ContinueOnError
     * @return boolean
     */
    public boolean getContinueOnError() {
        return continueOnError;
    }

    /**
     * Setter for ContinueOnError
     * @param continueOnError
     */
    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    /**
     * Getter for DisplayName
     * @return String
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName
     * @param displayName
     */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Enabled
     * @return boolean
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled
     * @param enabled
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for InstanceId
     * @return UUID
     */
    public UUID getInstanceId() {
        return instanceId;
    }

    /**
     * Setter for InstanceId
     * @param instanceId
     */
    public void setInstanceId(final UUID instanceId) {
        this.instanceId = instanceId;
    }
}
