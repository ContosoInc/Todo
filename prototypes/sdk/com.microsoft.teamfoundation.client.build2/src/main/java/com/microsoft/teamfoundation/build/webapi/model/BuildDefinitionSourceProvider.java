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

public class BuildDefinitionSourceProvider {

    private HashMap<String,String> fields;
    private String name;
    private DefinitionTriggerType supportedTriggerTypes;

    public HashMap<String,String> getFields() {
        return fields;
    }

    public void setFields(final HashMap<String,String> fields) {
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DefinitionTriggerType getSupportedTriggerTypes() {
        return supportedTriggerTypes;
    }

    public void setSupportedTriggerTypes(final DefinitionTriggerType supportedTriggerTypes) {
        this.supportedTriggerTypes = supportedTriggerTypes;
    }
}
