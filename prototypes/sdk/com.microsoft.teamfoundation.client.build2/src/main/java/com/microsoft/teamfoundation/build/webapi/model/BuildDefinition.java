/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionReference;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionStep;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionVariable;
import com.microsoft.teamfoundation.build.webapi.model.BuildOption;
import com.microsoft.teamfoundation.build.webapi.model.BuildRepository;
import com.microsoft.teamfoundation.build.webapi.model.BuildTrigger;
import com.microsoft.teamfoundation.build.webapi.model.Demand;
import com.microsoft.teamfoundation.build.webapi.model.RetentionPolicy;
import com.microsoft.visualstudio.services.webapi.model.PropertiesCollection;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildDefinition
    extends BuildDefinitionReference {

    private ReferenceLinks _links;
    private boolean badgeEnabled;
    private List<BuildDefinitionStep> build;
    private String buildNumberFormat;
    private String comment;
    private Date createdDate;
    private List<Demand> demands;
    private String description;
    private String dropLocation;
    private int jobTimeoutInMinutes;
    private List<BuildOption> options;
    private PropertiesCollection properties;
    private BuildRepository repository;
    private List<RetentionPolicy> retentionRules;
    private List<BuildTrigger> triggers;
    private HashMap<String,BuildDefinitionVariable> variables;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    public void setBadgeEnabled(final boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    public List<BuildDefinitionStep> getBuild() {
        return build;
    }

    public void setBuild(final List<BuildDefinitionStep> build) {
        this.build = build;
    }

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
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

    public int getJobTimeoutInMinutes() {
        return jobTimeoutInMinutes;
    }

    public void setJobTimeoutInMinutes(final int jobTimeoutInMinutes) {
        this.jobTimeoutInMinutes = jobTimeoutInMinutes;
    }

    public List<BuildOption> getOptions() {
        return options;
    }

    public void setOptions(final List<BuildOption> options) {
        this.options = options;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
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
