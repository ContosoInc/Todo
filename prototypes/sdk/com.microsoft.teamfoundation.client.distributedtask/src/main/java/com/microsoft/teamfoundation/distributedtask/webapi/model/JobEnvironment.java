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
import com.fasterxml.jackson.annotation.JsonProperty;

public class JobEnvironment {

    private HashMap<String,Object> data;
    private List<JobEndpoint> endpoints;
    private List<MaskHint> maskHints;
    private HashMap<UUID,JobOption> options;
    private HashMap<String,Object> secrets;
    private HashMap<String,String> variables;

    public HashMap<String,Object> getData() {
        return data;
    }

    public void setData(final HashMap<String,Object> data) {
        this.data = data;
    }

    public List<JobEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final List<JobEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public List<MaskHint> getMaskHints() {
        return maskHints;
    }

    public void setMaskHints(final List<MaskHint> maskHints) {
        this.maskHints = maskHints;
    }

    public HashMap<UUID,JobOption> getOptions() {
        return options;
    }

    public void setOptions(final HashMap<UUID,JobOption> options) {
        this.options = options;
    }

    public HashMap<String,Object> getSecrets() {
        return secrets;
    }

    public void setSecrets(final HashMap<String,Object> secrets) {
        this.secrets = secrets;
    }

    public HashMap<String,String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
