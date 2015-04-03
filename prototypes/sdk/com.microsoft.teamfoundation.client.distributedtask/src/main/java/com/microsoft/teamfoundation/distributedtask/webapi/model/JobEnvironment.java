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

import com.microsoft.teamfoundation.distributedtask.webapi.model.JobEndpoint;
import com.microsoft.teamfoundation.distributedtask.webapi.model.JobOption;
import com.microsoft.teamfoundation.distributedtask.webapi.model.MaskHint;
import com.microsoft.visualstudio.services.webapi.model.PropertiesCollection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class JobEnvironment {

    private PropertiesCollection data;
    private JobEndpoint[] endpoints;
    private List<MaskHint> mask;
    private HashMap<UUID,JobOption> options;
    private HashMap<String,Object> secrets;
    private HashMap<String,String> variables;

    public PropertiesCollection getData() {
        return data;
    }

    public void setData(final PropertiesCollection data) {
        this.data = data;
    }

    public JobEndpoint[] getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final JobEndpoint[] endpoints) {
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
