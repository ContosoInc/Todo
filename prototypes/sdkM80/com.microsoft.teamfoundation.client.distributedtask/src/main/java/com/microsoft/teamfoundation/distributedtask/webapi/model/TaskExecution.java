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

public class TaskExecution {

    private TaskReference execTask;
    private HashMap<String,HashMap<String,String>> platformInstructions;

    /**
     * Getter for ExecTask
     * @return TaskReference
     */
    public TaskReference getExecTask() {
        return execTask;
    }

    /**
     * Setter for ExecTask
     * @param execTask
     */
    public void setExecTask(final TaskReference execTask) {
        this.execTask = execTask;
    }

    /**
     * Getter for PlatformInstructions
     * @return HashMap<String,HashMap<String,String>>
     */
    public HashMap<String,HashMap<String,String>> getPlatformInstructions() {
        return platformInstructions;
    }

    /**
     * Setter for PlatformInstructions
     * @param platformInstructions
     */
    public void setPlatformInstructions(final HashMap<String,HashMap<String,String>> platformInstructions) {
        this.platformInstructions = platformInstructions;
    }
}
