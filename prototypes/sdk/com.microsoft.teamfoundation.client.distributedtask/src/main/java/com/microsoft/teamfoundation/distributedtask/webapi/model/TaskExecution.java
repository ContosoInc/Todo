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
