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

public class BuildDefinition
    extends BuildDefinitionReference {

    private String buildNumberFormat;
    private String comment;
    private Date createdOn;
    private List<Demand> demands;
    private String description;
    private String dropLocation;
    private List<BuildOption> options;
    private BuildRepository repository;
    private List<RetentionPolicy> retentionRules;
    private List<BuildDefinitionStep> steps;
    private List<BuildTrigger> triggers;
    private HashMap<String,BuildDefinitionVariable> variables;

    public String getBuildNumberFormat() {
        return buildNumberFormat;
    }

    public void setBuildNumberFormat(final String buildNumberFormat) {
        this.buildNumberFormat = buildNumberFormat;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
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

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(final String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public List<BuildOption> getOptions() {
        return options;
    }

    public void setOptions(final List<BuildOption> options) {
        this.options = options;
    }

    public BuildRepository getRepository() {
        return repository;
    }

    public void setRepository(final BuildRepository repository) {
        this.repository = repository;
    }

    public List<RetentionPolicy> getRetentionRules() {
        return retentionRules;
    }

    public void setRetentionRules(final List<RetentionPolicy> retentionRules) {
        this.retentionRules = retentionRules;
    }

    public List<BuildDefinitionStep> getSteps() {
        return steps;
    }

    public void setSteps(final List<BuildDefinitionStep> steps) {
        this.steps = steps;
    }

    public List<BuildTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(final List<BuildTrigger> triggers) {
        this.triggers = triggers;
    }

    public HashMap<String,BuildDefinitionVariable> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String,BuildDefinitionVariable> variables) {
        this.variables = variables;
    }
}
