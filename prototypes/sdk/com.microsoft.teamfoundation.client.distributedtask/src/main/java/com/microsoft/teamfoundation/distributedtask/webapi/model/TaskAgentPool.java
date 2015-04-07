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

import java.util.Date;
import java.util.UUID;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import com.microsoft.visualstudio.services.webapi.model.PropertiesCollection;

public class TaskAgentPool
    extends TaskAgentPoolReference {

    private IdentityRef administratorsGroup;
    private IdentityRef createdBy;
    private Date createdOn;
    private UUID groupScopeId;
    private boolean isHosted;
    private PropertiesCollection properties;
    private IdentityRef serviceAccountsGroup;
    private int size;

    public IdentityRef getAdministratorsGroup() {
        return administratorsGroup;
    }

    public void setAdministratorsGroup(final IdentityRef administratorsGroup) {
        this.administratorsGroup = administratorsGroup;
    }

    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public UUID getGroupScopeId() {
        return groupScopeId;
    }

    public void setGroupScopeId(final UUID groupScopeId) {
        this.groupScopeId = groupScopeId;
    }

    public boolean getIsHosted() {
        return isHosted;
    }

    public void setIsHosted(final boolean isHosted) {
        this.isHosted = isHosted;
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
