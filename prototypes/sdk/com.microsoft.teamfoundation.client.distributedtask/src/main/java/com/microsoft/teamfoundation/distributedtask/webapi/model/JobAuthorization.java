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

public class JobAuthorization {

    private UUID serverId;
    private URI serverUrl;
    private String servicePrincipalId;
    private String servicePrincipalToken;

    public UUID getServerId() {
        return serverId;
    }

    public void setServerId(final UUID serverId) {
        this.serverId = serverId;
    }

    public URI getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(final URI serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getServicePrincipalId() {
        return servicePrincipalId;
    }

    public void setServicePrincipalId(final String servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
    }

    public String getServicePrincipalToken() {
        return servicePrincipalToken;
    }

    public void setServicePrincipalToken(final String servicePrincipalToken) {
        this.servicePrincipalToken = servicePrincipalToken;
    }
}
