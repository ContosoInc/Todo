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

public class RunJobInput {

    private JobEnvironment environment;
    private UUID hostId;
    private TaskOrchestrationJob job;
    private UUID planId;
    private int poolId;

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
     * Getter for HostId
     * @return UUID
     */
    public UUID getHostId() {
        return hostId;
    }

    /**
     * Setter for HostId
     * @param hostId
     */
    public void setHostId(final UUID hostId) {
        this.hostId = hostId;
    }

    /**
     * Getter for Job
     * @return TaskOrchestrationJob
     */
    public TaskOrchestrationJob getJob() {
        return job;
    }

    /**
     * Setter for Job
     * @param job
     */
    public void setJob(final TaskOrchestrationJob job) {
        this.job = job;
    }

    /**
     * Getter for PlanId
     * @return UUID
     */
    public UUID getPlanId() {
        return planId;
    }

    /**
     * Setter for PlanId
     * @param planId
     */
    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }

    /**
     * Getter for PoolId
     * @return int
     */
    public int getPoolId() {
        return poolId;
    }

    /**
     * Setter for PoolId
     * @param poolId
     */
    public void setPoolId(final int poolId) {
        this.poolId = poolId;
    }
}
