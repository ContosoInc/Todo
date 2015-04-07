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

package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.util.Date;
import java.util.HashMap;
import com.microsoft.visualstudio.services.webapi.model.PropertiesCollection;

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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public int getMaxParallelism() {
        return maxParallelism;
    }

    public void setMaxParallelism(final int maxParallelism) {
        this.maxParallelism = maxParallelism;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    public TaskAgentStatus getStatus() {
        return status;
    }

    public void setStatus(final TaskAgentStatus status) {
        this.status = status;
    }

    public Date getStatusChangedOn() {
        return statusChangedOn;
    }

    public void setStatusChangedOn(final Date statusChangedOn) {
        this.statusChangedOn = statusChangedOn;
    }

    public HashMap<String,String> getSystemCapabilities() {
        return systemCapabilities;
    }

    public void setSystemCapabilities(final HashMap<String,String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }

    public HashMap<String,String> getUserCapabilities() {
        return userCapabilities;
    }

    public void setUserCapabilities(final HashMap<String,String> userCapabilities) {
        this.userCapabilities = userCapabilities;
    }
}
