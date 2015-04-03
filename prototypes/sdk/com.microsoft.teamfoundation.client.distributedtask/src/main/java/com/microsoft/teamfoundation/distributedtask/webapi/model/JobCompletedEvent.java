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

import com.microsoft.teamfoundation.distributedtask.webapi.model.JobEvent;
import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskResult;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class JobCompletedEvent
    extends JobEvent {

    private TaskResult result;

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }
}
