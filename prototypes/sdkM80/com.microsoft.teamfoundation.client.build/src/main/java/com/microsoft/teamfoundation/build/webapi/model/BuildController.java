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

    /**
     * Getter for Agents
     * @return List<ShallowReference>
     */
    public List<ShallowReference> getAgents() {
        return agents;
    }

    /**
     * Setter for Agents
     * @param agents
     */
    public void setAgents(final List<ShallowReference> agents) {
        this.agents = agents;
    }

    /**
     * Getter for CreatedDate
     * @return Date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter for CreatedDate
     * @param createdDate
     */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for CustomAssemblyPath
     * @return String
     */
    public String getCustomAssemblyPath() {
        return customAssemblyPath;
    }

    /**
     * Setter for CustomAssemblyPath
     * @param customAssemblyPath
     */
    public void setCustomAssemblyPath(final String customAssemblyPath) {
        this.customAssemblyPath = customAssemblyPath;
    }

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
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
     * Getter for MaxConcurrentBuilds
     * @return int
     */
    public int getMaxConcurrentBuilds() {
        return maxConcurrentBuilds;
    }

    /**
     * Setter for MaxConcurrentBuilds
     * @param maxConcurrentBuilds
     */
    public void setMaxConcurrentBuilds(final int maxConcurrentBuilds) {
        this.maxConcurrentBuilds = maxConcurrentBuilds;
    }

    /**
     * Getter for MessageQueueUrl
     * @return String
     */
    public String getMessageQueueUrl() {
        return messageQueueUrl;
    }

    /**
     * Setter for MessageQueueUrl
     * @param messageQueueUrl
     */
    public void setMessageQueueUrl(final String messageQueueUrl) {
        this.messageQueueUrl = messageQueueUrl;
    }

    /**
     * Getter for QueueCount
     * @return int
     */
    public int getQueueCount() {
        return queueCount;
    }

    /**
     * Setter for QueueCount
     * @param queueCount
     */
    public void setQueueCount(final int queueCount) {
        this.queueCount = queueCount;
    }

    /**
     * Getter for Server
     * @return ShallowReference
     */
    public ShallowReference getServer() {
        return server;
    }

    /**
     * Setter for Server
     * @param server
     */
    public void setServer(final ShallowReference server) {
        this.server = server;
    }

    /**
     * Getter for Status
     * @return ControllerStatus
     */
    public ControllerStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final ControllerStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusMessage
     * @return String
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Setter for StatusMessage
     * @param statusMessage
     */
    public void setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * Getter for UpdatedDate
     * @return Date
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter for UpdatedDate
     * @param updatedDate
     */
    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Getter for Uri
     * @return String
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri
     * @param uri
     */
    public void setUri(final String uri) {
        this.uri = uri;
    }
}
