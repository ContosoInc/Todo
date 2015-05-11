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

package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class JobEnvironment {

    private List<ServiceEndpoint> endpoints;
    private List<MaskHint> mask;
    private HashMap<UUID,JobOption> options;
    private ServiceEndpoint systemConnection;
    private ServiceEndpoint userConnection;
    private HashMap<String,String> variables;

    public List<ServiceEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final List<ServiceEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public List<MaskHint> getMask() {
        return mask;
    }

    public void setMask(final List<MaskHint> mask) {
        this.mask = mask;
    }

    public HashMap<UUID,JobOption> getOptions() {
        return options;
    }

    public void setOptions(final HashMap<UUID,JobOption> options) {
        this.options = options;
    }

    public ServiceEndpoint getSystemConnection() {
        return systemConnection;
    }

    public void setSystemConnection(final ServiceEndpoint systemConnection) {
        this.systemConnection = systemConnection;
    }

    public ServiceEndpoint getUserConnection() {
        return userConnection;
    }

    public void setUserConnection(final ServiceEndpoint userConnection) {
        this.userConnection = userConnection;
    }

    public HashMap<String,String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
