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

public class BuildDefinitionSourceProvider {

    private HashMap<String,String> fields;
    private String name;
    private DefinitionTriggerType supportedTriggerTypes;

    /**
     * Getter for Fields
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getFields() {
        return fields;
    }

    /**
     * Setter for Fields
     * @param fields
     */
    public void setFields(final HashMap<String,String> fields) {
        this.fields = fields;
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
     * Getter for SupportedTriggerTypes
     * @return DefinitionTriggerType
     */
    public DefinitionTriggerType getSupportedTriggerTypes() {
        return supportedTriggerTypes;
    }

    /**
     * Setter for SupportedTriggerTypes
     * @param supportedTriggerTypes
     */
    public void setSupportedTriggerTypes(final DefinitionTriggerType supportedTriggerTypes) {
        this.supportedTriggerTypes = supportedTriggerTypes;
    }
}
