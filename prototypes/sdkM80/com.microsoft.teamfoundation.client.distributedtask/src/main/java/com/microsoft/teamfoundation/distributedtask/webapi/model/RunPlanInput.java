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

public class RunPlanInput {

    private boolean continueOnError;
    private JobEnvironment environment;
    private UUID hostId;
    private TaskOrchestrationContainer implementation;
    private UUID planId;
    private int poolId;

    /**
     * Getter for ContinueOnError
     * @return boolean
     */
    public boolean getContinueOnError() {
        return continueOnError;
    }

    /**
     * Setter for ContinueOnError
     * @param continueOnError
     */
    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
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
