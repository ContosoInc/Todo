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

public class TaskOrchestrationContainer
    extends TaskOrchestrationItem {

    private List<TaskOrchestrationItem> children;
    private boolean parallel;
    private TaskOrchestrationContainer rollback;

    public List<TaskOrchestrationItem> getChildren() {
        return children;
    }

    public void setChildren(final List<TaskOrchestrationItem> children) {
        this.children = children;
    }

    public boolean getParallel() {
        return parallel;
    }

    public void setParallel(final boolean parallel) {
        this.parallel = parallel;
    }

    public TaskOrchestrationContainer getRollback() {
        return rollback;
    }

    public void setRollback(final TaskOrchestrationContainer rollback) {
        this.rollback = rollback;
    }
}
