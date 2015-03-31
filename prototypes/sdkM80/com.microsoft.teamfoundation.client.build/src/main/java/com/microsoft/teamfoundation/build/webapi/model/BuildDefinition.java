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

public class BuildDefinition
    extends BuildDefinitionReference {

    private boolean badgeEnabled;
    private String buildNumberFormat;
    private String comment;
    private Date createdOn;
    private List<Demand> demands;
    private String description;
    private String dropLocation;
    private List<BuildOption> options;
    private PropertiesCollection properties;
    private BuildRepository repository;
    private List<RetentionPolicy> retentionRules;
    private List<BuildDefinitionStep> steps;
    private List<BuildTrigger> triggers;
    private HashMap<String,BuildDefinitionVariable> variables;

    /**
     * Getter for BadgeEnabled
     * @return boolean
     */
    public boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * Setter for BadgeEnabled
     * @param badgeEnabled
     */
    public void setBadgeEnabled(final boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    /**
     * Getter for BuildNumberFormat
     * @return String
     */
    public String getBuildNumberFormat() {
        return buildNumberFormat;
    }

    /**
     * Setter for BuildNumberFormat
     * @param buildNumberFormat
     */
    public void setBuildNumberFormat(final String buildNumberFormat) {
        this.buildNumberFormat = buildNumberFormat;
    }

    /**
     * Getter for Comment
     * @return String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment
     * @param comment
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
     * Getter for CreatedOn
     * @return Date
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn
     * @param createdOn
     */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
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
     * Getter for DropLocation
     * @return String
     */
    public String getDropLocation() {
        return dropLocation;
    }

    /**
     * Setter for DropLocation
     * @param dropLocation
     */
    public void setDropLocation(final String dropLocation) {
        this.dropLocation = dropLocation;
    }

    /**
     * Getter for Options
     * @return List<BuildOption>
     */
    public List<BuildOption> getOptions() {
        return options;
    }

    /**
     * Setter for Options
     * @param options
     */
    public void setOptions(final List<BuildOption> options) {
        this.options = options;
    }

    /**
     * Getter for Properties
     * @return PropertiesCollection
     */
    public PropertiesCollection getProperties() {
        return properties;
    }

    /**
     * Setter for Properties
     * @param properties
     */
    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
     * Getter for Repository
     * @return BuildRepository
     */
    public BuildRepository getRepository() {
        return repository;
    }

    /**
     * Setter for Repository
     * @param repository
     */
    public void setRepository(final BuildRepository repository) {
        this.repository = repository;
    }

    /**
     * Getter for RetentionRules
     * @return List<RetentionPolicy>
     */
    public List<RetentionPolicy> getRetentionRules() {
        return retentionRules;
    }

    /**
     * Setter for RetentionRules
     * @param retentionRules
     */
    public void setRetentionRules(final List<RetentionPolicy> retentionRules) {
        this.retentionRules = retentionRules;
    }

    /**
     * Getter for Steps
     * @return List<BuildDefinitionStep>
     */
    public List<BuildDefinitionStep> getSteps() {
        return steps;
    }

    /**
     * Setter for Steps
     * @param steps
     */
    public void setSteps(final List<BuildDefinitionStep> steps) {
        this.steps = steps;
    }

    /**
     * Getter for Triggers
     * @return List<BuildTrigger>
     */
    public List<BuildTrigger> getTriggers() {
        return triggers;
    }

    /**
     * Setter for Triggers
     * @param triggers
     */
    public void setTriggers(final List<BuildTrigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * Getter for Variables
     * @return HashMap<String,BuildDefinitionVariable>
     */
    public HashMap<String,BuildDefinitionVariable> getVariables() {
        return variables;
    }

    /**
     * Setter for Variables
     * @param variables
     */
    public void setVariables(final HashMap<String,BuildDefinitionVariable> variables) {
        this.variables = variables;
    }
}
