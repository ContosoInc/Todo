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

    public WebApiConnectedServiceRef getConnectedService() {
        return connectedService;
    }

    public void setConnectedService(final WebApiConnectedServiceRef connectedService) {
        this.connectedService = connectedService;
    }

    public ShallowReference getDefinition() {
        return definition;
    }

    public void setDefinition(final ShallowReference definition) {
        this.definition = definition;
    }

    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(final String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public String getHostedServiceName() {
        return hostedServiceName;
    }

    public void setHostedServiceName(final String hostedServiceName) {
        this.hostedServiceName = hostedServiceName;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getStorageAccountName() {
        return storageAccountName;
    }

    public void setStorageAccountName(final String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(final String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public String getWebspace() {
        return webspace;
    }

    public void setWebspace(final String webspace) {
        this.webspace = webspace;
    }
}
