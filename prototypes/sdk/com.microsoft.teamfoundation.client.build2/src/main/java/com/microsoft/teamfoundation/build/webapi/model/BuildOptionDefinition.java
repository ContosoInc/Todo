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

public class BuildOptionDefinition
    extends BuildOptionDefinitionReference {

    private String description;
    private List<BuildOptionGroupDefinition> groups;
    private List<BuildOptionInputDefinition> inputs;
    private String name;
    private int ordinal;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<BuildOptionGroupDefinition> getGroups() {
        return groups;
    }

    public void setGroups(final List<BuildOptionGroupDefinition> groups) {
        this.groups = groups;
    }

    public List<BuildOptionInputDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(final List<BuildOptionInputDefinition> inputs) {
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(final int ordinal) {
        this.ordinal = ordinal;
    }
}
