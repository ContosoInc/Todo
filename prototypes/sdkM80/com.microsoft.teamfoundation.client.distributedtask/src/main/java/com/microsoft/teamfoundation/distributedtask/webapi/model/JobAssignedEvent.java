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

public class JobAssignedEvent
    extends JobEvent {

    private TaskAgentJobRequest request;

    /**
     * Getter for Request
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest getRequest() {
        return request;
    }

    /**
     * Setter for Request
     * @param request
     */
    public void setRequest(final TaskAgentJobRequest request) {
        this.request = request;
    }
}
