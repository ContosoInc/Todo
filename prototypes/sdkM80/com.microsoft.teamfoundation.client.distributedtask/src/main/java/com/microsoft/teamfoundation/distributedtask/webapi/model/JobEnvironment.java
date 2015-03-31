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

public class JobEnvironment {

    private HashMap<String,Object> data;
    private List<JobEndpoint> endpoints;
    private List<MaskHint> maskHints;
    private HashMap<UUID,JobOption> options;
    private HashMap<String,Object> secrets;
    private HashMap<String,String> variables;

    /**
     * Getter for Data
     * @return HashMap<String,Object>
     */
    public HashMap<String,Object> getData() {
        return data;
    }

    /**
     * Setter for Data
     * @param data
     */
    public void setData(final HashMap<String,Object> data) {
        this.data = data;
    }

    /**
     * Getter for Endpoints
     * @return List<JobEndpoint>
     */
    public List<JobEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * Setter for Endpoints
     * @param endpoints
     */
    public void setEndpoints(final List<JobEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Getter for MaskHints
     * @return List<MaskHint>
     */
    public List<MaskHint> getMaskHints() {
        return maskHints;
    }

    /**
     * Setter for MaskHints
     * @param maskHints
     */
    public void setMaskHints(final List<MaskHint> maskHints) {
        this.maskHints = maskHints;
    }

    /**
     * Getter for Options
     * @return HashMap<UUID,JobOption>
     */
    public HashMap<UUID,JobOption> getOptions() {
        return options;
    }

    /**
     * Setter for Options
     * @param options
     */
    public void setOptions(final HashMap<UUID,JobOption> options) {
        this.options = options;
    }

    /**
     * Getter for Secrets
     * @return HashMap<String,Object>
     */
    public HashMap<String,Object> getSecrets() {
        return secrets;
    }

    /**
     * Setter for Secrets
     * @param secrets
     */
    public void setSecrets(final HashMap<String,Object> secrets) {
        this.secrets = secrets;
    }

    /**
     * Getter for Variables
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getVariables() {
        return variables;
    }

    /**
     * Setter for Variables
     * @param variables
     */
    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
