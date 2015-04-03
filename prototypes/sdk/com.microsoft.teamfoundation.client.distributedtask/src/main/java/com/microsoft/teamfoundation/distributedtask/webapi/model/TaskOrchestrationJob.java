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

import com.microsoft.teamfoundation.distributedtask.webapi.model.Demand;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskInstance;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskOrchestrationItem;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TaskOrchestrationJob
    extends TaskOrchestrationItem {

    private List<Demand> demands;
    private String executionTimeout;
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

    public String getExecutionTimeout() {
        return executionTimeout;
    }

    public void setExecutionTimeout(final String executionTimeout) {
        this.executionTimeout = executionTimeout;
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
