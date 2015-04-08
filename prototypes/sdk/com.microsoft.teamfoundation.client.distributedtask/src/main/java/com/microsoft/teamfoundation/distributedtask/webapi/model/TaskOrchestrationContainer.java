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

import java.util.List;

public class TaskOrchestrationContainer
    extends TaskOrchestrationItem {

    private List<TaskOrchestrationItem> children;
    private boolean continueOnError;
    private boolean parallel;
    private TaskOrchestrationContainer rollback;

    public List<TaskOrchestrationItem> getChildren() {
        return children;
    }

    public void setChildren(final List<TaskOrchestrationItem> children) {
        this.children = children;
    }

    public boolean getContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
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
