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

public class TaskAgentPool
    extends TaskAgentPoolReference {

    private IdentityRef administratorsGroup;
    private IdentityRef createdBy;
    private Date createdOn;
    private UUID groupScopeId;
    private PropertiesCollection properties;
    private IdentityRef serviceAccountsGroup;
    private int size;

    /**
     * Getter for AdministratorsGroup
     * @return IdentityRef
     */
    public IdentityRef getAdministratorsGroup() {
        return administratorsGroup;
    }

    /**
     * Setter for AdministratorsGroup
     * @param administratorsGroup
     */
    public void setAdministratorsGroup(final IdentityRef administratorsGroup) {
        this.administratorsGroup = administratorsGroup;
    }

    /**
     * Getter for CreatedBy
     * @return IdentityRef
     */
    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter for CreatedBy
     * @param createdBy
     */
    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for CreatedOn
     * @return Date
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn
     * @param createdOn
     */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for GroupScopeId
     * @return UUID
     */
    public UUID getGroupScopeId() {
        return groupScopeId;
    }

    /**
     * Setter for GroupScopeId
     * @param groupScopeId
     */
    public void setGroupScopeId(final UUID groupScopeId) {
        this.groupScopeId = groupScopeId;
    }

    /**
     * Getter for Properties
     * @return PropertiesCollection
     */
    public PropertiesCollection getProperties() {
        return properties;
    }

    /**
     * Setter for Properties
     * @param properties
     */
    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
     * Getter for ServiceAccountsGroup
     * @return IdentityRef
     */
    public IdentityRef getServiceAccountsGroup() {
        return serviceAccountsGroup;
    }

    /**
     * Setter for ServiceAccountsGroup
     * @param serviceAccountsGroup
     */
    public void setServiceAccountsGroup(final IdentityRef serviceAccountsGroup) {
        this.serviceAccountsGroup = serviceAccountsGroup;
    }

    /**
     * Getter for Size
     * @return int
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter for Size
     * @param size
     */
    public void setSize(final int size) {
        this.size = size;
    }
}
