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

public class TaskReference {

    private UUID id;
    private HashMap<String,String> inputs;
    private String name;
    private String version;

    /**
     * Getter for Id
     * @return UUID
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final UUID id) {
        this.id = id;
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
     * Getter for Version
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}
