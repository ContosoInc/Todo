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

public class TaskDefinition {

    private TaskExecution agentExecution;
    private String author;
    private TaskCategory category;
    private boolean contentsUploaded;
    private List<Demand> demands;
    private String description;
    private String friendlyName;
    private List<TaskGroupDefinition> groups;
    private String hostType;
    private String iconUrl;
    private UUID id;
    private List<TaskInputDefinition> inputs;
    private String instanceNameFormat;
    private String name;
    private String packageLocation;
    private String packageType;
    private boolean serverOwned;
    private String sourceLocation;
    private TaskVersion version;
    private TaskAreaVisibility visibility;

    public TaskExecution getAgentExecution() {
        return agentExecution;
    }

    public void setAgentExecution(final TaskExecution agentExecution) {
        this.agentExecution = agentExecution;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(final TaskCategory category) {
        this.category = category;
    }

    public boolean getContentsUploaded() {
        return contentsUploaded;
    }

    public void setContentsUploaded(final boolean contentsUploaded) {
        this.contentsUploaded = contentsUploaded;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public List<TaskGroupDefinition> getGroups() {
        return groups;
    }

    public void setGroups(final List<TaskGroupDefinition> groups) {
        this.groups = groups;
    }

    public String getHostType() {
        return hostType;
    }

    public void setHostType(final String hostType) {
        this.hostType = hostType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(final String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public List<TaskInputDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(final List<TaskInputDefinition> inputs) {
        this.inputs = inputs;
    }

    public String getInstanceNameFormat() {
        return instanceNameFormat;
    }

    public void setInstanceNameFormat(final String instanceNameFormat) {
        this.instanceNameFormat = instanceNameFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPackageLocation() {
        return packageLocation;
    }

    public void setPackageLocation(final String packageLocation) {
        this.packageLocation = packageLocation;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(final String packageType) {
        this.packageType = packageType;
    }

    public boolean getServerOwned() {
        return serverOwned;
    }

    public void setServerOwned(final boolean serverOwned) {
        this.serverOwned = serverOwned;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(final String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public TaskVersion getVersion() {
        return version;
    }

    public void setVersion(final TaskVersion version) {
        this.version = version;
    }

    public TaskAreaVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(final TaskAreaVisibility visibility) {
        this.visibility = visibility;
    }
}
