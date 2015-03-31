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

public class Build {

    private String buildNumber;
    private BuildDefinitionReference definition;
    private List<Demand> demands;
    private Date finishTime;
    private int id;
    private boolean keepForever;
    private IdentityRef lastChangedBy;
    private Date lastChangedDate;
    private ReferenceLinks links;
    private LogLocationReference log;
    private TaskOrchestrationPlanReference orchestrationPlan;
    private String parameters;
    private QueuePriority priority;
    private TeamProjectReference project;
    private PropertiesCollection properties;
    private QueueReference queue;
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

    /**
     * Getter for BuildNumber
     * @return String
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * Setter for BuildNumber
     * @param buildNumber
     */
    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * Getter for Definition
     * @return BuildDefinitionReference
     */
    public BuildDefinitionReference getDefinition() {
        return definition;
    }

    /**
     * Setter for Definition
     * @param definition
     */
    public void setDefinition(final BuildDefinitionReference definition) {
        this.definition = definition;
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
     * Getter for FinishTime
     * @return Date
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * Setter for FinishTime
     * @param finishTime
     */
    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
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
     * Getter for KeepForever
     * @return boolean
     */
    public boolean getKeepForever() {
        return keepForever;
    }

    /**
     * Setter for KeepForever
     * @param keepForever
     */
    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    /**
     * Getter for LastChangedBy
     * @return IdentityRef
     */
    public IdentityRef getLastChangedBy() {
        return lastChangedBy;
    }

    /**
     * Setter for LastChangedBy
     * @param lastChangedBy
     */
    public void setLastChangedBy(final IdentityRef lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    /**
     * Getter for LastChangedDate
     * @return Date
     */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Setter for LastChangedDate
     * @param lastChangedDate
     */
    public void setLastChangedDate(final Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for Log
     * @return LogLocationReference
     */
    public LogLocationReference getLog() {
        return log;
    }

    /**
     * Setter for Log
     * @param log
     */
    public void setLog(final LogLocationReference log) {
        this.log = log;
    }

    /**
     * Getter for OrchestrationPlan
     * @return TaskOrchestrationPlanReference
     */
    public TaskOrchestrationPlanReference getOrchestrationPlan() {
        return orchestrationPlan;
    }

    /**
     * Setter for OrchestrationPlan
     * @param orchestrationPlan
     */
    public void setOrchestrationPlan(final TaskOrchestrationPlanReference orchestrationPlan) {
        this.orchestrationPlan = orchestrationPlan;
    }

    /**
     * Getter for Parameters
     * @return String
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Setter for Parameters
     * @param parameters
     */
    public void setParameters(final String parameters) {
        this.parameters = parameters;
    }

    /**
     * Getter for Priority
     * @return QueuePriority
     */
    public QueuePriority getPriority() {
        return priority;
    }

    /**
     * Setter for Priority
     * @param priority
     */
    public void setPriority(final QueuePriority priority) {
        this.priority = priority;
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
     * Getter for Queue
     * @return QueueReference
     */
    public QueueReference getQueue() {
        return queue;
    }

    /**
     * Setter for Queue
     * @param queue
     */
    public void setQueue(final QueueReference queue) {
        this.queue = queue;
    }

    /**
     * Getter for QueueOptions
     * @return QueueOptions
     */
    public QueueOptions getQueueOptions() {
        return queueOptions;
    }

    /**
     * Setter for QueueOptions
     * @param queueOptions
     */
    public void setQueueOptions(final QueueOptions queueOptions) {
        this.queueOptions = queueOptions;
    }

    /**
     * Getter for QueuePosition
     * @return int
     */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
     * Setter for QueuePosition
     * @param queuePosition
     */
    public void setQueuePosition(final int queuePosition) {
        this.queuePosition = queuePosition;
    }

    /**
     * Getter for QueueTime
     * @return Date
     */
    public Date getQueueTime() {
        return queueTime;
    }

    /**
     * Setter for QueueTime
     * @param queueTime
     */
    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    /**
     * Getter for Reason
     * @return BuildReason
     */
    public BuildReason getReason() {
        return reason;
    }

    /**
     * Setter for Reason
     * @param reason
     */
    public void setReason(final BuildReason reason) {
        this.reason = reason;
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
     * Getter for RequestedBy
     * @return IdentityRef
     */
    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    /**
     * Setter for RequestedBy
     * @param requestedBy
     */
    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
     * Getter for RequestedFor
     * @return IdentityRef
     */
    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    /**
     * Setter for RequestedFor
     * @param requestedFor
     */
    public void setRequestedFor(final IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    /**
     * Getter for Result
     * @return BuildResult
     */
    public BuildResult getResult() {
        return result;
    }

    /**
     * Setter for Result
     * @param result
     */
    public void setResult(final BuildResult result) {
        this.result = result;
    }

    /**
     * Getter for SourceBranch
     * @return String
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /**
     * Setter for SourceBranch
     * @param sourceBranch
     */
    public void setSourceBranch(final String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    /**
     * Getter for SourceVersion
     * @return String
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * Setter for SourceVersion
     * @param sourceVersion
     */
    public void setSourceVersion(final String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * Getter for StartTime
     * @return Date
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Setter for StartTime
     * @param startTime
     */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for Status
     * @return BuildStatus
     */
    public BuildStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status
     * @param status
     */
    public void setStatus(final BuildStatus status) {
        this.status = status;
    }

    /**
     * Getter for Tags
     * @return List<String>
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags
     * @param tags
     */
    public void setTags(final List<String> tags) {
        this.tags = tags;
    }

    /**
     * Getter for Uri
     * @return URI
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Setter for Uri
     * @param uri
     */
    public void setUri(final URI uri) {
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
     * Getter for ValidationResults
     * @return List<BuildRequestValidationResult>
     */
    public List<BuildRequestValidationResult> getValidationResults() {
        return validationResults;
    }

    /**
     * Setter for ValidationResults
     * @param validationResults
     */
    public void setValidationResults(final List<BuildRequestValidationResult> validationResults) {
        this.validationResults = validationResults;
    }
}
