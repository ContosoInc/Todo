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

public class TimelineRecord {

    private int changeId;
    private String currentOperation;
    private TimelineReference details;
    private int errorCount;
    private Date finishTime;
    private UUID id;
    private List<Issue> issues;
    private Date lastModified;
    private URI location;
    private TaskLogReference log;
    private String name;
    private int order;
    private UUID parentId;
    private int percentComplete;
    private String recordType;
    private TaskResult result;
    private String resultCode;
    private Date startTime;
    private TimelineRecordState state;
    private int warningCount;
    private String workerName;

    /**
     * Getter for ChangeId
     * @return int
     */
    public int getChangeId() {
        return changeId;
    }

    /**
     * Setter for ChangeId
     * @param changeId
     */
    public void setChangeId(final int changeId) {
        this.changeId = changeId;
    }

    /**
     * Getter for CurrentOperation
     * @return String
     */
    public String getCurrentOperation() {
        return currentOperation;
    }

    /**
     * Setter for CurrentOperation
     * @param currentOperation
     */
    public void setCurrentOperation(final String currentOperation) {
        this.currentOperation = currentOperation;
    }

    /**
     * Getter for Details
     * @return TimelineReference
     */
    public TimelineReference getDetails() {
        return details;
    }

    /**
     * Setter for Details
     * @param details
     */
    public void setDetails(final TimelineReference details) {
        this.details = details;
    }

    /**
     * Getter for ErrorCount
     * @return int
     */
    public int getErrorCount() {
        return errorCount;
    }

    /**
     * Setter for ErrorCount
     * @param errorCount
     */
    public void setErrorCount(final int errorCount) {
        this.errorCount = errorCount;
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
     * Getter for Issues
     * @return List<Issue>
     */
    public List<Issue> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues
     * @param issues
     */
    public void setIssues(final List<Issue> issues) {
        this.issues = issues;
    }

    /**
     * Getter for LastModified
     * @return Date
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Setter for LastModified
     * @param lastModified
     */
    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Getter for Location
     * @return URI
     */
    public URI getLocation() {
        return location;
    }

    /**
     * Setter for Location
     * @param location
     */
    public void setLocation(final URI location) {
        this.location = location;
    }

    /**
     * Getter for Log
     * @return TaskLogReference
     */
    public TaskLogReference getLog() {
        return log;
    }

    /**
     * Setter for Log
     * @param log
     */
    public void setLog(final TaskLogReference log) {
        this.log = log;
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
     * Getter for Order
     * @return int
     */
    public int getOrder() {
        return order;
    }

    /**
     * Setter for Order
     * @param order
     */
    public void setOrder(final int order) {
        this.order = order;
    }

    /**
     * Getter for ParentId
     * @return UUID
     */
    public UUID getParentId() {
        return parentId;
    }

    /**
     * Setter for ParentId
     * @param parentId
     */
    public void setParentId(final UUID parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for PercentComplete
     * @return int
     */
    public int getPercentComplete() {
        return percentComplete;
    }

    /**
     * Setter for PercentComplete
     * @param percentComplete
     */
    public void setPercentComplete(final int percentComplete) {
        this.percentComplete = percentComplete;
    }

    /**
     * Getter for RecordType
     * @return String
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Setter for RecordType
     * @param recordType
     */
    public void setRecordType(final String recordType) {
        this.recordType = recordType;
    }

    /**
     * Getter for Result
     * @return TaskResult
     */
    public TaskResult getResult() {
        return result;
    }

    /**
     * Setter for Result
     * @param result
     */
    public void setResult(final TaskResult result) {
        this.result = result;
    }

    /**
     * Getter for ResultCode
     * @return String
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Setter for ResultCode
     * @param resultCode
     */
    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
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
     * Getter for State
     * @return TimelineRecordState
     */
    public TimelineRecordState getState() {
        return state;
    }

    /**
     * Setter for State
     * @param state
     */
    public void setState(final TimelineRecordState state) {
        this.state = state;
    }

    /**
     * Getter for WarningCount
     * @return int
     */
    public int getWarningCount() {
        return warningCount;
    }

    /**
     * Setter for WarningCount
     * @param warningCount
     */
    public void setWarningCount(final int warningCount) {
        this.warningCount = warningCount;
    }

    /**
     * Getter for WorkerName
     * @return String
     */
    public String getWorkerName() {
        return workerName;
    }

    /**
     * Setter for WorkerName
     * @param workerName
     */
    public void setWorkerName(final String workerName) {
        this.workerName = workerName;
    }
}
