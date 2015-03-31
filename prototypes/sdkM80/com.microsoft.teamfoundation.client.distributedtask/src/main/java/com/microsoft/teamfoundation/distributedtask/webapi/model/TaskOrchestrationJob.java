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

public class TaskOrchestrationJob
    extends TaskOrchestrationItem {

    private List<Demand> demands;
    private UUID instanceId;
    private String name;
    private List<TaskInstance> tasks;
    private HashMap<String,String> variables;

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
     * Getter for InstanceId
     * @return UUID
     */
    public UUID getInstanceId() {
        return instanceId;
    }

    /**
     * Setter for InstanceId
     * @param instanceId
     */
    public void setInstanceId(final UUID instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Tasks
     * @return List<TaskInstance>
     */
    public List<TaskInstance> getTasks() {
        return tasks;
    }

    /**
     * Setter for Tasks
     * @param tasks
     */
    public void setTasks(final List<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    /**
     * Getter for Variables
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getVariables() {
        return variables;
    }

    /**
     * Setter for Variables
     * @param variables
     */
    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
