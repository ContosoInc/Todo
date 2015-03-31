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

public class BuildAgent {

    private String buildDirectory;
    private ShallowReference controller;
    private Date createdDate;
    private String description;
    private boolean enabled;
    private int id;
    private String messageQueueUrl;
    private String name;
    private String reservedForBuild;
    private ShallowReference server;
    private AgentStatus status;
    private String statusMessage;
    private Date updatedDate;
    private String uri;
    private String url;

    /**
     * Getter for BuildDirectory
     * @return String
     */
    public String getBuildDirectory() {
        return buildDirectory;
    }

    /**
     * Setter for BuildDirectory
     * @param buildDirectory
     */
    public void setBuildDirectory(final String buildDirectory) {
        this.buildDirectory = buildDirectory;
    }

    /**
     * Getter for Controller
     * @return ShallowReference
     */
    public ShallowReference getController() {
        return controller;
    }

    /**
     * Setter for Controller
     * @param controller
     */
    public void setController(final ShallowReference controller) {
        this.controller = controller;
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
     * Getter for Id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final int id) {
        this.id = id;
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
     * Getter for ReservedForBuild
     * @return String
     */
    public String getReservedForBuild() {
        return reservedForBuild;
    }

    /**
     * Setter for ReservedForBuild
     * @param reservedForBuild
     */
    public void setReservedForBuild(final String reservedForBuild) {
        this.reservedForBuild = reservedForBuild;
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
     * @return AgentStatus
     */
    public AgentStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final AgentStatus status) {
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

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
