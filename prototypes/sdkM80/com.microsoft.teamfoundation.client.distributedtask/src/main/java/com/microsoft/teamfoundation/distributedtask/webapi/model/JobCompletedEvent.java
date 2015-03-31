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

public class JobCompletedEvent
    extends JobEvent {

    private TaskResult result;

    /**
     * Getter for Result
     * @return TaskResult
     */
    public TaskResult getResult() {
        return result;
    }

    /**
     * Setter for Result
     * @param result
     */
    public void setResult(final TaskResult result) {
        this.result = result;
    }
}
