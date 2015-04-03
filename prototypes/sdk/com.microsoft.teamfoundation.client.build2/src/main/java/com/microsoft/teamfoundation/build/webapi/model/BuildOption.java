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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.BuildOptionDefinitionReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildOption {

    private BuildOptionDefinitionReference definition;
    private boolean enabled;
    private HashMap<String,String> inputs;

    public BuildOptionDefinitionReference getDefinition() {
        return definition;
    }

    public void setDefinition(final BuildOptionDefinitionReference definition) {
        this.definition = definition;
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
}
