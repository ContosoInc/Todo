/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionStep {

    private String displayName;
    private boolean enabled;
    private HashMap<String,String> inputs;
    private TaskDefinitionReference taskDefinition;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public HashMap<String,String> getInputs() {
        return inputs;
    }

    public void setInputs(final HashMap<String,String> inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("task")
    public TaskDefinitionReference getTaskDefinition() {
        return taskDefinition;
    }

    @JsonProperty("task")
    public void setTaskDefinition(final TaskDefinitionReference taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
}
