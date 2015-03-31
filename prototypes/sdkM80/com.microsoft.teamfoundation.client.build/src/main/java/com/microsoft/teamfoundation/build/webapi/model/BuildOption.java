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

public class BuildOption {

    private BuildOptionDefinitionReference buildOptionDefinition;
    private boolean enabled;
    private HashMap<String,String> inputs;

    /**
     * Getter for BuildOptionDefinition
     * @return BuildOptionDefinitionReference
     */
    public BuildOptionDefinitionReference getBuildOptionDefinition() {
        return buildOptionDefinition;
    }

    /**
     * Setter for BuildOptionDefinition
     * @param buildOptionDefinition
     */
    public void setBuildOptionDefinition(final BuildOptionDefinitionReference buildOptionDefinition) {
        this.buildOptionDefinition = buildOptionDefinition;
    }

    /**
     * Getter for Enabled
     * @return boolean
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled
     * @param enabled
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for Inputs
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getInputs() {
        return inputs;
    }

    /**
     * Setter for Inputs
     * @param inputs
     */
    public void setInputs(final HashMap<String,String> inputs) {
        this.inputs = inputs;
    }
}
