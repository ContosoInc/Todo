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

import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TaskExecution {

    private TaskReference execTask;
    private HashMap<String,HashMap<String,String>> platformInstructions;

    public TaskReference getExecTask() {
        return execTask;
    }

    public void setExecTask(final TaskReference execTask) {
        this.execTask = execTask;
    }

    public HashMap<String,HashMap<String,String>> getPlatformInstructions() {
        return platformInstructions;
    }

    public void setPlatformInstructions(final HashMap<String,HashMap<String,String>> platformInstructions) {
        this.platformInstructions = platformInstructions;
    }
}
