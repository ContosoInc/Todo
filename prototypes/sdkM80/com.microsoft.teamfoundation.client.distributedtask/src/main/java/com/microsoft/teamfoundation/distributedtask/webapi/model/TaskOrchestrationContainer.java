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

public class TaskOrchestrationContainer
    extends TaskOrchestrationItem {

    private List<TaskOrchestrationItem> children;
    private boolean parallel;
    private TaskOrchestrationContainer rollback;

    /**
     * Getter for Children
     * @return List<TaskOrchestrationItem>
     */
    public List<TaskOrchestrationItem> getChildren() {
        return children;
    }

    /**
     * Setter for Children
     * @param children
     */
    public void setChildren(final List<TaskOrchestrationItem> children) {
        this.children = children;
    }

    /**
     * Getter for Parallel
     * @return boolean
     */
    public boolean getParallel() {
        return parallel;
    }

    /**
     * Setter for Parallel
     * @param parallel
     */
    public void setParallel(final boolean parallel) {
        this.parallel = parallel;
    }

    /**
     * Getter for Rollback
     * @return TaskOrchestrationContainer
     */
    public TaskOrchestrationContainer getRollback() {
        return rollback;
    }

    /**
     * Setter for Rollback
     * @param rollback
     */
    public void setRollback(final TaskOrchestrationContainer rollback) {
        this.rollback = rollback;
    }
}
