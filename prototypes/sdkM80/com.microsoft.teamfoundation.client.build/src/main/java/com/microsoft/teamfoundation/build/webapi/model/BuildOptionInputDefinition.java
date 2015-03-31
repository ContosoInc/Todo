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

    /**
     * Getter for DefaultValue
     * @return String
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Setter for DefaultValue
     * @param defaultValue
     */
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Getter for GroupName
     * @return String
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for GroupName
     * @param groupName
     */
    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for HelpMarkDown
     * @return String
     */
    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    /**
     * Setter for HelpMarkDown
     * @param helpMarkDown
     */
    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
    }

    /**
     * Getter for InputType
     * @return BuildOptionInputType
     */
    public BuildOptionInputType getInputType() {
        return inputType;
    }

    /**
     * Setter for InputType
     * @param inputType
     */
    public void setInputType(final BuildOptionInputType inputType) {
        this.inputType = inputType;
    }

    /**
     * Getter for Label
     * @return String
     */
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label
     * @param label
     */
    public void setLabel(final String label) {
        this.label = label;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Options
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getOptions() {
        return options;
    }

    /**
     * Setter for Options
     * @param options
     */
    public void setOptions(final HashMap<String,String> options) {
        this.options = options;
    }

    /**
     * Getter for Required
     * @return boolean
     */
    public boolean getRequired() {
        return required;
    }

    /**
     * Setter for Required
     * @param required
     */
    public void setRequired(final boolean required) {
        this.required = required;
    }

    /**
     * Getter for VisibleRule
     * @return String
     */
    public String getVisibleRule() {
        return visibleRule;
    }

    /**
     * Setter for VisibleRule
     * @param visibleRule
     */
    public void setVisibleRule(final String visibleRule) {
        this.visibleRule = visibleRule;
    }
}
