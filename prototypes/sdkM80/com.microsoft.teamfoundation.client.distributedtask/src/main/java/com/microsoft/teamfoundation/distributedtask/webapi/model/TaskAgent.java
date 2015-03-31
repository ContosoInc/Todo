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

public class TaskAgent
    extends TaskAgentReference {

    private Date createdOn;
    private boolean enabled;
    private int maxParallelism;
    private PropertiesCollection properties;
    private TaskAgentStatus status;
    private Date statusChangedOn;
    private HashMap<String,String> systemCapabilities;
    private HashMap<String,String> userCapabilities;

    /**
     * Getter for CreatedOn
     * @return Date
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn
     * @param createdOn
     */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
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
     * Getter for MaxParallelism
     * @return int
     */
    public int getMaxParallelism() {
        return maxParallelism;
    }

    /**
     * Setter for MaxParallelism
     * @param maxParallelism
     */
    public void setMaxParallelism(final int maxParallelism) {
        this.maxParallelism = maxParallelism;
    }

    /**
     * Getter for Properties
     * @return PropertiesCollection
     */
    public PropertiesCollection getProperties() {
        return properties;
    }

    /**
     * Setter for Properties
     * @param properties
     */
    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
     * Getter for Status
     * @return TaskAgentStatus
     */
    public TaskAgentStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final TaskAgentStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusChangedOn
     * @return Date
     */
    public Date getStatusChangedOn() {
        return statusChangedOn;
    }

    /**
     * Setter for StatusChangedOn
     * @param statusChangedOn
     */
    public void setStatusChangedOn(final Date statusChangedOn) {
        this.statusChangedOn = statusChangedOn;
    }

    /**
     * Getter for SystemCapabilities
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getSystemCapabilities() {
        return systemCapabilities;
    }

    /**
     * Setter for SystemCapabilities
     * @param systemCapabilities
     */
    public void setSystemCapabilities(final HashMap<String,String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }

    /**
     * Getter for UserCapabilities
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getUserCapabilities() {
        return userCapabilities;
    }

    /**
     * Setter for UserCapabilities
     * @param userCapabilities
     */
    public void setUserCapabilities(final HashMap<String,String> userCapabilities) {
        this.userCapabilities = userCapabilities;
    }
}
