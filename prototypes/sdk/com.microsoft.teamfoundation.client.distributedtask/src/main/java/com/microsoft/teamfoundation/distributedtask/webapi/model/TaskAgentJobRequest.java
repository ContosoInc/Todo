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

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(final Date assignTime) {
        this.assignTime = assignTime;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public UUID getHostId() {
        return hostId;
    }

    public void setHostId(final UUID hostId) {
        this.hostId = hostId;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    public Date getLockedUntil() {
        return lockedUntil;
    }

    public void setLockedUntil(final Date lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }

    public Date getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(final long requestId) {
        this.requestId = requestId;
    }

    public TaskAgentReference getReservedAgent() {
        return reservedAgent;
    }

    public void setReservedAgent(final TaskAgentReference reservedAgent) {
        this.reservedAgent = reservedAgent;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }

    public UUID getServiceOwner() {
        return serviceOwner;
    }

    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }
}
