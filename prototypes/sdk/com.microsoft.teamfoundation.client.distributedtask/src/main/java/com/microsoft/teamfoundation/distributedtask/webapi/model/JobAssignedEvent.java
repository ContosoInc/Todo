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


public class JobAssignedEvent
    extends JobEvent {

    private TaskAgentJobRequest request;

    public TaskAgentJobRequest getRequest() {
        return request;
    }

    public void setRequest(final TaskAgentJobRequest request) {
        this.request = request;
    }
}
