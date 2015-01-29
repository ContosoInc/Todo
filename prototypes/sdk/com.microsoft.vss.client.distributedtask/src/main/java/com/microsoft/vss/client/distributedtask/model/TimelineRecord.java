package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.distributedtask.model.enumeration.TimelineRecordState;

public class TimelineRecord {
    private UUID id;
    private UUID parentId;
    private String recordType;
    private String name;
    private Date startTime;
    private Date finishTime;
    private String currentOperation;
    private int percentComplete;
    private TimelineRecordState state;
    private TaskResult result;
    private String resultCode;
    private int changeId;
    private Date lastModified;
    private String workerName;
    private int order;
    private TaskLogReference log;
    private TimelineReference details;
    private int errorCount;
    private int warningCount;
    private List<Issue> issues = new ArrayList<Issue>();
    private URI location;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(final UUID parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("type")
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty("type")
    public void setRecordType(final String recordType) {
        this.recordType = recordType;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(final String currentOperation) {
        this.currentOperation = currentOperation;
    }

    public int getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(final int percentComplete) {
        this.percentComplete = percentComplete;
    }

    public TimelineRecordState getState() {
        return state;
    }

    public void setState(final TimelineRecordState state) {
        this.state = state;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
    }

    public int getChangeId() {
        return changeId;
    }

    public void setChangeId(final int changeId) {
        this.changeId = changeId;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(final String workerName) {
        this.workerName = workerName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
    }

    public TaskLogReference getLog() {
        return log;
    }

    public void setLog(final TaskLogReference log) {
        this.log = log;
    }

    public TimelineReference getDetails() {
        return details;
    }

    public void setDetails(final TimelineReference details) {
        this.details = details;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(final int errorCount) {
        this.errorCount = errorCount;
    }

    public int getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(final int warningCount) {
        this.warningCount = warningCount;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(final List<Issue> issues) {
        this.issues = issues;
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(final URI location) {
        this.location = location;
    }

}
