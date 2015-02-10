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

public class TaskOrchestrationJob
    extends TaskOrchestrationItem {

    private List<Demand> demands;
    private UUID instanceId;
    private String name;
    private List<TaskInstance> tasks;
    private HashMap<String,String> variables;

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public UUID getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(final UUID instanceId) {
        this.instanceId = instanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<TaskInstance> getTasks() {
        return tasks;
    }

    public void setTasks(final List<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    public HashMap<String,String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
