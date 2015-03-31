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

    /**
     * Getter for AgentExecution
     * @return TaskExecution
     */
    public TaskExecution getAgentExecution() {
        return agentExecution;
    }

    /**
     * Setter for AgentExecution
     * @param agentExecution
     */
    public void setAgentExecution(final TaskExecution agentExecution) {
        this.agentExecution = agentExecution;
    }

    /**
     * Getter for Author
     * @return String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for Author
     * @param author
     */
    public void setAuthor(final String author) {
        this.author = author;
    }

    /**
     * Getter for Category
     * @return TaskCategory
     */
    public TaskCategory getCategory() {
        return category;
    }

    /**
     * Setter for Category
     * @param category
     */
    public void setCategory(final TaskCategory category) {
        this.category = category;
    }

    /**
     * Getter for ContentsUploaded
     * @return boolean
     */
    public boolean getContentsUploaded() {
        return contentsUploaded;
    }

    /**
     * Setter for ContentsUploaded
     * @param contentsUploaded
     */
    public void setContentsUploaded(final boolean contentsUploaded) {
        this.contentsUploaded = contentsUploaded;
    }

    /**
     * Getter for Demands
     * @return List<Demand>
     */
    public List<Demand> getDemands() {
        return demands;
    }

    /**
     * Setter for Demands
     * @param demands
     */
    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
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
     * Getter for FriendlyName
     * @return String
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Setter for FriendlyName
     * @param friendlyName
     */
    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * Getter for Groups
     * @return List<TaskGroupDefinition>
     */
    public List<TaskGroupDefinition> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups
     * @param groups
     */
    public void setGroups(final List<TaskGroupDefinition> groups) {
        this.groups = groups;
    }

    /**
     * Getter for HostType
     * @return String
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Setter for HostType
     * @param hostType
     */
    public void setHostType(final String hostType) {
        this.hostType = hostType;
    }

    /**
     * Getter for IconUrl
     * @return String
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Setter for IconUrl
     * @param iconUrl
     */
    public void setIconUrl(final String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * Getter for Id
     * @return UUID
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
     * Getter for Inputs
     * @return List<TaskInputDefinition>
     */
    public List<TaskInputDefinition> getInputs() {
        return inputs;
    }

    /**
     * Setter for Inputs
     * @param inputs
     */
    public void setInputs(final List<TaskInputDefinition> inputs) {
        this.inputs = inputs;
    }

    /**
     * Getter for InstanceNameFormat
     * @return String
     */
    public String getInstanceNameFormat() {
        return instanceNameFormat;
    }

    /**
     * Setter for InstanceNameFormat
     * @param instanceNameFormat
     */
    public void setInstanceNameFormat(final String instanceNameFormat) {
        this.instanceNameFormat = instanceNameFormat;
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
     * Getter for PackageLocation
     * @return String
     */
    public String getPackageLocation() {
        return packageLocation;
    }

    /**
     * Setter for PackageLocation
     * @param packageLocation
     */
    public void setPackageLocation(final String packageLocation) {
        this.packageLocation = packageLocation;
    }

    /**
     * Getter for PackageType
     * @return String
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Setter for PackageType
     * @param packageType
     */
    public void setPackageType(final String packageType) {
        this.packageType = packageType;
    }

    /**
     * Getter for ServerOwned
     * @return boolean
     */
    public boolean getServerOwned() {
        return serverOwned;
    }

    /**
     * Setter for ServerOwned
     * @param serverOwned
     */
    public void setServerOwned(final boolean serverOwned) {
        this.serverOwned = serverOwned;
    }

    /**
     * Getter for SourceLocation
     * @return String
     */
    public String getSourceLocation() {
        return sourceLocation;
    }

    /**
     * Setter for SourceLocation
     * @param sourceLocation
     */
    public void setSourceLocation(final String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * Getter for Version
     * @return TaskVersion
     */
    public TaskVersion getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final TaskVersion version) {
        this.version = version;
    }

    /**
     * Getter for Visibility
     * @return TaskAreaVisibility
     */
    public TaskAreaVisibility getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility
     * @param visibility
     */
    public void setVisibility(final TaskAreaVisibility visibility) {
        this.visibility = visibility;
    }
}
