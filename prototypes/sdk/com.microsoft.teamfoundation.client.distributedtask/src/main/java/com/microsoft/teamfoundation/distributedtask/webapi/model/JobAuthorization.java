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

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
