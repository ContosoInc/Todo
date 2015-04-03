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

package com.microsoft.teamfoundation.distributedtask.webapi.model;

import com.microsoft.teamfoundation.distributedtask.webapi.model.JobEnvironment;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskOrchestrationContainer;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskOrchestrationPlanReference;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskOrchestrationPlanState;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskResult;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TimelineReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    public JobEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final JobEnvironment environment) {
        this.environment = environment;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public TaskOrchestrationContainer getImplementation() {
        return implementation;
    }

    public void setImplementation(final TaskOrchestrationContainer implementation) {
        this.implementation = implementation;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public TaskOrchestrationPlanState getState() {
        return state;
    }

    public void setState(final TaskOrchestrationPlanState state) {
        this.state = state;
    }

    public TimelineReference getTimeline() {
        return timeline;
    }

    public void setTimeline(final TimelineReference timeline) {
        this.timeline = timeline;
    }
}
