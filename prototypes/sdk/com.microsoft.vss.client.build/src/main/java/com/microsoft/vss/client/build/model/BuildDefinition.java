package com.microsoft.vss.client.build.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildDefinition
    extends BuildDefinitionReference {

    private String buildNumberFormat;
    private Date createdOn;
    private String comment;
    private String description;
    private String dropLocation;
    private List<BuildDefinitionStep> steps = new ArrayList<BuildDefinitionStep>();
    private List<BuildOption> options = new ArrayList<BuildOption>();
    private BuildRepository repository;
    private List<BuildTrigger> triggers = new ArrayList<BuildTrigger>();
    private Map<String, BuildDefinitionVariable> variables = new HashMap<String, BuildDefinitionVariable>();
    private List<String> demands = new ArrayList<String>();

    public String getBuildNumberFormat() {
        return buildNumberFormat;
    }

    public void setBuildNumberFormat(final String buildNumberFormat) {
        this.buildNumberFormat = buildNumberFormat;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
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

    public List<BuildDefinitionStep> getSteps() {
        return steps;
    }

    public void setSteps(final List<BuildDefinitionStep> steps) {
        this.steps = steps;
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

    public List<BuildTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(final List<BuildTrigger> triggers) {
        this.triggers = triggers;
    }

    public Map<String, BuildDefinitionVariable> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, BuildDefinitionVariable> variables) {
        this.variables = variables;
    }

    public List<String> getDemands() {
        return demands;
    }

    public void setDemands(final List<String> demands) {
        this.demands = demands;
    }

}
