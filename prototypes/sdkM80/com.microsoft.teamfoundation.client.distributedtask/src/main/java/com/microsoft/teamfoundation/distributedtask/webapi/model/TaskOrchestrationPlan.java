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

public class TaskOrchestrationPlan
    extends TaskOrchestrationPlanReference {

    private JobEnvironment environment;
    private Date finishTime;
    private TaskOrchestrationContainer implementation;
    private TaskResult result;
    private String resultCode;
    private Date startTime;
    private TaskOrchestrationPlanState state;
    private TimelineReference timeline;

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
     * Getter for Implementation
     * @return TaskOrchestrationContainer
     */
    public TaskOrchestrationContainer getImplementation() {
        return implementation;
    }

    /**
     * Setter for Implementation
     * @param implementation
     */
    public void setImplementation(final TaskOrchestrationContainer implementation) {
        this.implementation = implementation;
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
     * @return TaskOrchestrationPlanState
     */
    public TaskOrchestrationPlanState getState() {
        return state;
    }

    /**
     * Setter for State
     * @param state
     */
    public void setState(final TaskOrchestrationPlanState state) {
        this.state = state;
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
