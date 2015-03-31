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

public class JobRequestMessage {

    private JobAuthorization authorization;
    private JobEnvironment environment;
    private UUID jobId;
    private String jobName;
    private Date lockedUntil;
    private UUID lockToken;
    private TaskOrchestrationPlanReference plan;
    private long requestId;
    private List<TaskInstance> tasks;
    private TimelineReference timeline;

    /**
     * Getter for Authorization
     * @return JobAuthorization
     */
    public JobAuthorization getAuthorization() {
        return authorization;
    }

    /**
     * Setter for Authorization
     * @param authorization
     */
    public void setAuthorization(final JobAuthorization authorization) {
        this.authorization = authorization;
    }

    /**
     * Getter for Environment
     * @return JobEnvironment
     */
    public JobEnvironment getEnvironment() {
        return environment;
    }

    /**
     * Setter for Environment
     * @param environment
     */
    public void setEnvironment(final JobEnvironment environment) {
        this.environment = environment;
    }

    /**
     * Getter for JobId
     * @return UUID
     */
    public UUID getJobId() {
        return jobId;
    }

    /**
     * Setter for JobId
     * @param jobId
     */
    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    /**
     * Getter for JobName
     * @return String
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Setter for JobName
     * @param jobName
     */
    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    /**
     * Getter for LockedUntil
     * @return Date
     */
    public Date getLockedUntil() {
        return lockedUntil;
    }

    /**
     * Setter for LockedUntil
     * @param lockedUntil
     */
    public void setLockedUntil(final Date lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

    /**
     * Getter for LockToken
     * @return UUID
     */
    public UUID getLockToken() {
        return lockToken;
    }

    /**
     * Setter for LockToken
     * @param lockToken
     */
    public void setLockToken(final UUID lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * Getter for Plan
     * @return TaskOrchestrationPlanReference
     */
    public TaskOrchestrationPlanReference getPlan() {
        return plan;
    }

    /**
     * Setter for Plan
     * @param plan
     */
    public void setPlan(final TaskOrchestrationPlanReference plan) {
        this.plan = plan;
    }

    /**
     * Getter for RequestId
     * @return long
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId
     * @param requestId
     */
    public void setRequestId(final long requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Tasks
     * @return List<TaskInstance>
     */
    public List<TaskInstance> getTasks() {
        return tasks;
    }

    /**
     * Setter for Tasks
     * @param tasks
     */
    public void setTasks(final List<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    /**
     * Getter for Timeline
     * @return TimelineReference
     */
    public TimelineReference getTimeline() {
        return timeline;
    }

    /**
     * Setter for Timeline
     * @param timeline
     */
    public void setTimeline(final TimelineReference timeline) {
        this.timeline = timeline;
    }
}
