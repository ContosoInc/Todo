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

public class JobCancelMessage {

    private UUID jobId;
    private String timeout;

    /**
     * Getter for JobId
     * @return UUID
     */
    public UUID getJobId() {
        return jobId;
    }

    /**
     * Setter for JobId
     * @param jobId
     */
    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    /**
     * Getter for Timeout
     * @return String
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Setter for Timeout
     * @param timeout
     */
    public void setTimeout(final String timeout) {
        this.timeout = timeout;
    }
}
