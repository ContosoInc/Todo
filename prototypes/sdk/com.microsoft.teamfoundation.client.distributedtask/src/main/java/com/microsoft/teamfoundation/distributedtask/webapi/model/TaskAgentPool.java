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

public class TaskAgentPool
    extends TaskAgentPoolReference {

    private IdentityRef administratorsGroup;
    private Date createdOn;
    private PropertiesCollection properties;
    private IdentityRef serviceAccountsGroup;
    private int size;

    public IdentityRef getAdministratorsGroup() {
        return administratorsGroup;
    }

    public void setAdministratorsGroup(final IdentityRef administratorsGroup) {
        this.administratorsGroup = administratorsGroup;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    public IdentityRef getServiceAccountsGroup() {
        return serviceAccountsGroup;
    }

    public void setServiceAccountsGroup(final IdentityRef serviceAccountsGroup) {
        this.serviceAccountsGroup = serviceAccountsGroup;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }
}
