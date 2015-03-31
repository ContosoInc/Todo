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

public class ContinuousDeploymentDefinition {

    private WebApiConnectedServiceRef connectedService;
    private ShallowReference definition;
    private String gitBranch;
    private String hostedServiceName;
    private TeamProjectReference project;
    private String repositoryId;
    private String storageAccountName;
    private String subscriptionId;
    private String website;
    private String webspace;

    /**
     * Getter for ConnectedService
     * @return WebApiConnectedServiceRef
     */
    public WebApiConnectedServiceRef getConnectedService() {
        return connectedService;
    }

    /**
     * Setter for ConnectedService
     * @param connectedService
     */
    public void setConnectedService(final WebApiConnectedServiceRef connectedService) {
        this.connectedService = connectedService;
    }

    /**
     * Getter for Definition
     * @return ShallowReference
     */
    public ShallowReference getDefinition() {
        return definition;
    }

    /**
     * Setter for Definition
     * @param definition
     */
    public void setDefinition(final ShallowReference definition) {
        this.definition = definition;
    }

    /**
     * Getter for GitBranch
     * @return String
     */
    public String getGitBranch() {
        return gitBranch;
    }

    /**
     * Setter for GitBranch
     * @param gitBranch
     */
    public void setGitBranch(final String gitBranch) {
        this.gitBranch = gitBranch;
    }

    /**
     * Getter for HostedServiceName
     * @return String
     */
    public String getHostedServiceName() {
        return hostedServiceName;
    }

    /**
     * Setter for HostedServiceName
     * @param hostedServiceName
     */
    public void setHostedServiceName(final String hostedServiceName) {
        this.hostedServiceName = hostedServiceName;
    }

    /**
     * Getter for Project
     * @return TeamProjectReference
     */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
     * Setter for Project
     * @param project
     */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    /**
     * Getter for RepositoryId
     * @return String
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId
     * @param repositoryId
     */
    public void setRepositoryId(final String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for StorageAccountName
     * @return String
     */
    public String getStorageAccountName() {
        return storageAccountName;
    }

    /**
     * Setter for StorageAccountName
     * @param storageAccountName
     */
    public void setStorageAccountName(final String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    /**
     * Getter for SubscriptionId
     * @return String
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId
     * @param subscriptionId
     */
    public void setSubscriptionId(final String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Website
     * @return String
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Setter for Website
     * @param website
     */
    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * Getter for Webspace
     * @return String
     */
    public String getWebspace() {
        return webspace;
    }

    /**
     * Setter for Webspace
     * @param webspace
     */
    public void setWebspace(final String webspace) {
        this.webspace = webspace;
    }
}
