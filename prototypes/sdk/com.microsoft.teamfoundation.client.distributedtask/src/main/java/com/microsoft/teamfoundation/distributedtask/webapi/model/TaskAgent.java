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
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskAgent
    extends TaskAgentReference {

    private Date createdOn;
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
