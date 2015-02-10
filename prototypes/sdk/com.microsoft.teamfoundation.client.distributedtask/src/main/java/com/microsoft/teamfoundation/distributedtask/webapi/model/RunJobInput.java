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

public class RunJobInput {

    private JobEnvironment environment;
    private UUID hostId;
    private TaskOrchestrationJob job;
    private UUID planId;
    private int poolId;

    public JobEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final JobEnvironment environment) {
        this.environment = environment;
    }

    public UUID getHostId() {
        return hostId;
    }

    public void setHostId(final UUID hostId) {
        this.hostId = hostId;
    }

    public TaskOrchestrationJob getJob() {
        return job;
    }

    public void setJob(final TaskOrchestrationJob job) {
        this.job = job;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(final int poolId) {
        this.poolId = poolId;
    }
}
