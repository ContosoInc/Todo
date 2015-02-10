/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildController
    extends QueueReference {

    private List<ShallowReference> agents;
    private Date createdDate;
    private String customAssemblyPath;
    private String description;
    private boolean enabled;
    private int maxConcurrentBuilds;
    private String messageQueueUrl;
    private int queueCount;
    private ShallowReference server;
    private ControllerStatus status;
    private String statusMessage;
    private Date updatedDate;
    private String uri;

    public List<ShallowReference> getAgents() {
        return agents;
    }

    public void setAgents(final List<ShallowReference> agents) {
        this.agents = agents;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCustomAssemblyPath() {
        return customAssemblyPath;
    }

    public void setCustomAssemblyPath(final String customAssemblyPath) {
        this.customAssemblyPath = customAssemblyPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public int getMaxConcurrentBuilds() {
        return maxConcurrentBuilds;
    }

    public void setMaxConcurrentBuilds(final int maxConcurrentBuilds) {
        this.maxConcurrentBuilds = maxConcurrentBuilds;
    }

    public String getMessageQueueUrl() {
        return messageQueueUrl;
    }

    public void setMessageQueueUrl(final String messageQueueUrl) {
        this.messageQueueUrl = messageQueueUrl;
    }

    public int getQueueCount() {
        return queueCount;
    }

    public void setQueueCount(final int queueCount) {
        this.queueCount = queueCount;
    }

    public ShallowReference getServer() {
        return server;
    }

    public void setServer(final ShallowReference server) {
        this.server = server;
    }

    public ControllerStatus getStatus() {
        return status;
    }

    public void setStatus(final ControllerStatus status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }
}
