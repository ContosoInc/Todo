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

public class BuildOptionDefinition
    extends BuildOptionDefinitionReference {

    private String description;
    private List<BuildOptionGroupDefinition> groups;
    private List<BuildOptionInputDefinition> inputs;
    private String name;
    private int ordinal;

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for Groups
     * @return List<BuildOptionGroupDefinition>
     */
    public List<BuildOptionGroupDefinition> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups
     * @param groups
     */
    public void setGroups(final List<BuildOptionGroupDefinition> groups) {
        this.groups = groups;
    }

    /**
     * Getter for Inputs
     * @return List<BuildOptionInputDefinition>
     */
    public List<BuildOptionInputDefinition> getInputs() {
        return inputs;
    }

    /**
     * Setter for Inputs
     * @param inputs
     */
    public void setInputs(final List<BuildOptionInputDefinition> inputs) {
        this.inputs = inputs;
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
     * Getter for Ordinal
     * @return int
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Setter for Ordinal
     * @param ordinal
     */
    public void setOrdinal(final int ordinal) {
        this.ordinal = ordinal;
    }
}
