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
import com.fasterxml.jackson.annotation.JsonProperty;

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

    public JobAuthorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(final JobAuthorization authorization) {
        this.authorization = authorization;
    }

    public JobEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final JobEnvironment environment) {
        this.environment = environment;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public Date getLockedUntil() {
        return lockedUntil;
    }

    public void setLockedUntil(final Date lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

    public UUID getLockToken() {
        return lockToken;
    }

    public void setLockToken(final UUID lockToken) {
        this.lockToken = lockToken;
    }

    public TaskOrchestrationPlanReference getPlan() {
        return plan;
    }

    public void setPlan(final TaskOrchestrationPlanReference plan) {
        this.plan = plan;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(final long requestId) {
        this.requestId = requestId;
    }

    public List<TaskInstance> getTasks() {
        return tasks;
    }

    public void setTasks(final List<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    public TimelineReference getTimeline() {
        return timeline;
    }

    public void setTimeline(final TimelineReference timeline) {
        this.timeline = timeline;
    }
}
