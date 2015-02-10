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

public class BuildOptionInputDefinition {

    private String defaultValue;
    private String groupName;
    private String helpMarkDown;
    private BuildOptionInputType inputType;
    private String label;
    private String name;
    private HashMap<String,String> options;
    private boolean required;
    private String visibleRule;

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
    }

    @JsonProperty("type")
    public BuildOptionInputType getInputType() {
        return inputType;
    }

    @JsonProperty("type")
    public void setInputType(final BuildOptionInputType inputType) {
        this.inputType = inputType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String,String> getOptions() {
        return options;
    }

    public void setOptions(final HashMap<String,String> options) {
        this.options = options;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(final boolean required) {
        this.required = required;
    }

    public String getVisibleRule() {
        return visibleRule;
    }

    public void setVisibleRule(final String visibleRule) {
        this.visibleRule = visibleRule;
    }
}
