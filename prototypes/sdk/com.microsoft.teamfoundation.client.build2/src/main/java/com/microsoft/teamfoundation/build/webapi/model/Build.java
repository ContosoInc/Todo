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

import java.net.URI;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import com.microsoft.visualstudio.services.webapi.model.PropertiesCollection;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;

public class Build {

    private ReferenceLinks _links;
    private String buildNumber;
    private BuildController controller;
    private DefinitionReference definition;
    private List<Demand> demands;
    private Date finishTime;
    private int id;
    private boolean keepForever;
    private IdentityRef lastChangedBy;
    private Date lastChangedDate;
    private BuildLogReference logs;
    private TaskOrchestrationPlanReference orchestrationPlan;
    private String parameters;
    private QueuePriority priority;
    private TeamProjectReference project;
    private PropertiesCollection properties;
    private AgentPoolQueue queue;
    private QueueOptions queueOptions;
    private int queuePosition;
    private Date queueTime;
    private BuildReason reason;
    private BuildRepository repository;
    private IdentityRef requestedBy;
    private IdentityRef requestedFor;
    private BuildResult result;
    private String sourceBranch;
    private String sourceVersion;
    private Date startTime;
    private BuildStatus status;
    private List<String> tags;
    private URI uri;
    private String url;
    private List<BuildRequestValidationResult> validationResults;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public BuildController getController() {
        return controller;
    }

    public void setController(final BuildController controller) {
        this.controller = controller;
    }

    public DefinitionReference getDefinition() {
        return definition;
    }

    public void setDefinition(final DefinitionReference definition) {
        this.definition = definition;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean getKeepForever() {
        return keepForever;
    }

    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    public IdentityRef getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(final IdentityRef lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(final Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public BuildLogReference getLogs() {
        return logs;
    }

    public void setLogs(final BuildLogReference logs) {
        this.logs = logs;
    }

    public TaskOrchestrationPlanReference getOrchestrationPlan() {
        return orchestrationPlan;
    }

    public void setOrchestrationPlan(final TaskOrchestrationPlanReference orchestrationPlan) {
        this.orchestrationPlan = orchestrationPlan;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(final String parameters) {
        this.parameters = parameters;
    }

    public QueuePriority getPriority() {
        return priority;
    }

    public void setPriority(final QueuePriority priority) {
        this.priority = priority;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    public AgentPoolQueue getQueue() {
        return queue;
    }

    public void setQueue(final AgentPoolQueue queue) {
        this.queue = queue;
    }

    public QueueOptions getQueueOptions() {
        return queueOptions;
    }

    public void setQueueOptions(final QueueOptions queueOptions) {
        this.queueOptions = queueOptions;
    }

    public int getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(final int queuePosition) {
        this.queuePosition = queuePosition;
    }

    public Date getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    public BuildReason getReason() {
        return reason;
    }

    public void setReason(final BuildReason reason) {
        this.reason = reason;
    }

    public BuildRepository getRepository() {
        return repository;
    }

    public void setRepository(final BuildRepository repository) {
        this.repository = repository;
    }

    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    public void setRequestedFor(final IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    public BuildResult getResult() {
        return result;
    }

    public void setResult(final BuildResult result) {
        this.result = result;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(final String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public String getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(final String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public BuildStatus getStatus() {
        return status;
    }

    public void setStatus(final BuildStatus status) {
        this.status = status;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(final List<String> tags) {
        this.tags = tags;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(final URI uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public List<BuildRequestValidationResult> getValidationResults() {
        return validationResults;
    }

    public void setValidationResults(final List<BuildRequestValidationResult> validationResults) {
        this.validationResults = validationResults;
    }
}
