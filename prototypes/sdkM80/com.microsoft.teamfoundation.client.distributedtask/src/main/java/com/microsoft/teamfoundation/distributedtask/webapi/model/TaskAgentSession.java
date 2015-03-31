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

public class TaskAgentSession {

    private TaskAgentReference agent;
    private String ownerName;
    private UUID sessionId;
    private HashMap<String,String> systemCapabilities;

    /**
     * Getter for Agent
     * @return TaskAgentReference
     */
    public TaskAgentReference getAgent() {
        return agent;
    }

    /**
     * Setter for Agent
     * @param agent
     */
    public void setAgent(final TaskAgentReference agent) {
        this.agent = agent;
    }

    /**
     * Getter for OwnerName
     * @return String
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Setter for OwnerName
     * @param ownerName
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Getter for SessionId
     * @return UUID
     */
    public UUID getSessionId() {
        return sessionId;
    }

    /**
     * Setter for SessionId
     * @param sessionId
     */
    public void setSessionId(final UUID sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Getter for SystemCapabilities
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getSystemCapabilities() {
        return systemCapabilities;
    }

    /**
     * Setter for SystemCapabilities
     * @param systemCapabilities
     */
    public void setSystemCapabilities(final HashMap<String,String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }
}
