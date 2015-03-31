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

public class BuildServer {

    private List<ShallowReference> agents;
    private ShallowReference controller;
    private int id;
    private boolean isVirtual;
    private String messageQueueUrl;
    private String name;
    private boolean requireClientCertificates;
    private ServiceHostStatus status;
    private Date statusChangedDate;
    private String uri;
    private String url;
    private int version;

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
     * Getter for IsVirtual
     * @return boolean
     */
    public boolean getIsVirtual() {
        return isVirtual;
    }

    /**
     * Setter for IsVirtual
     * @param isVirtual
     */
    public void setIsVirtual(final boolean isVirtual) {
        this.isVirtual = isVirtual;
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
     * Getter for RequireClientCertificates
     * @return boolean
     */
    public boolean getRequireClientCertificates() {
        return requireClientCertificates;
    }

    /**
     * Setter for RequireClientCertificates
     * @param requireClientCertificates
     */
    public void setRequireClientCertificates(final boolean requireClientCertificates) {
        this.requireClientCertificates = requireClientCertificates;
    }

    /**
     * Getter for Status
     * @return ServiceHostStatus
     */
    public ServiceHostStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final ServiceHostStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusChangedDate
     * @return Date
     */
    public Date getStatusChangedDate() {
        return statusChangedDate;
    }

    /**
     * Setter for StatusChangedDate
     * @param statusChangedDate
     */
    public void setStatusChangedDate(final Date statusChangedDate) {
        this.statusChangedDate = statusChangedDate;
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

    /**
     * Getter for Version
     * @return int
     */
    public int getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final int version) {
        this.version = version;
    }
}
