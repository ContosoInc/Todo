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

public class JobAuthorization {

    private UUID serverId;
    private URI serverUrl;
    private String servicePrincipalId;
    private String servicePrincipalToken;

    /**
     * Getter for ServerId
     * @return UUID
     */
    public UUID getServerId() {
        return serverId;
    }

    /**
     * Setter for ServerId
     * @param serverId
     */
    public void setServerId(final UUID serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter for ServerUrl
     * @return URI
     */
    public URI getServerUrl() {
        return serverUrl;
    }

    /**
     * Setter for ServerUrl
     * @param serverUrl
     */
    public void setServerUrl(final URI serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * Getter for ServicePrincipalId
     * @return String
     */
    public String getServicePrincipalId() {
        return servicePrincipalId;
    }

    /**
     * Setter for ServicePrincipalId
     * @param servicePrincipalId
     */
    public void setServicePrincipalId(final String servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
    }

    /**
     * Getter for ServicePrincipalToken
     * @return String
     */
    public String getServicePrincipalToken() {
        return servicePrincipalToken;
    }

    /**
     * Setter for ServicePrincipalToken
     * @param servicePrincipalToken
     */
    public void setServicePrincipalToken(final String servicePrincipalToken) {
        this.servicePrincipalToken = servicePrincipalToken;
    }
}
