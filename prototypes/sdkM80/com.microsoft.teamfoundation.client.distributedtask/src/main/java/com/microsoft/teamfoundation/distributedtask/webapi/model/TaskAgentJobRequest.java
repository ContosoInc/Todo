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

public class TaskAgentJobRequest {

    private Date assignTime;
    private List<Demand> demands;
    private Date finishTime;
    private UUID hostId;
    private UUID jobId;
    private Date lockedUntil;
    private UUID planId;
    private Date queueTime;
    private Date receiveTime;
    private long requestId;
    private TaskAgentReference reservedAgent;
    private TaskResult result;
    private UUID serviceOwner;

    /**
     * Getter for AssignTime
     * @return Date
     */
    public Date getAssignTime() {
        return assignTime;
    }

    /**
     * Setter for AssignTime
     * @param assignTime
     */
    public void setAssignTime(final Date assignTime) {
        this.assignTime = assignTime;
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
     * Getter for ReceiveTime
     * @return Date
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * Setter for ReceiveTime
     * @param receiveTime
     */
    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
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
     * Getter for ReservedAgent
     * @return TaskAgentReference
     */
    public TaskAgentReference getReservedAgent() {
        return reservedAgent;
    }

    /**
     * Setter for ReservedAgent
     * @param reservedAgent
     */
    public void setReservedAgent(final TaskAgentReference reservedAgent) {
        this.reservedAgent = reservedAgent;
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
     * Getter for ServiceOwner
     * @return UUID
     */
    public UUID getServiceOwner() {
        return serviceOwner;
    }

    /**
     * Setter for ServiceOwner
     * @param serviceOwner
     */
    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }
}
