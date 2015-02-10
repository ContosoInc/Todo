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

public class TaskAgentSession {

    private TaskAgentReference agent;
    private String ownerName;
    private UUID sessionId;
    private HashMap<String,String> systemCapabilities;

    public TaskAgentReference getAgent() {
        return agent;
    }

    public void setAgent(final TaskAgentReference agent) {
        this.agent = agent;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(final UUID sessionId) {
        this.sessionId = sessionId;
    }

    public HashMap<String,String> getSystemCapabilities() {
        return systemCapabilities;
    }

    public void setSystemCapabilities(final HashMap<String,String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }
}
