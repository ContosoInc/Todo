/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class TfvcChangeset
    extends TfvcChangesetRef {

    private UUID accountId;
    private List<TfvcChange> changes;
    private CheckinNote[] checkinNotes;
    private UUID collectionId;
    private boolean hasMoreChanges;
    private TfvcPolicyOverrideInfo policyOverride;
    private List<AssociatedWorkItem> workItems;

    /**
     * Getter for AccountId
     * @return UUID
     */
    public UUID getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId
     * @param accountId
     */
    public void setAccountId(final UUID accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for Changes
     * @return List<TfvcChange>
     */
    public List<TfvcChange> getChanges() {
        return changes;
    }

    /**
     * Setter for Changes
     * @param changes
     */
    public void setChanges(final List<TfvcChange> changes) {
        this.changes = changes;
    }

    /**
     * Getter for CheckinNotes
     * @return CheckinNote[]
     */
    public CheckinNote[] getCheckinNotes() {
        return checkinNotes;
    }

    /**
     * Setter for CheckinNotes
     * @param checkinNotes
     */
    public void setCheckinNotes(final CheckinNote[] checkinNotes) {
        this.checkinNotes = checkinNotes;
    }

    /**
     * Getter for CollectionId
     * @return UUID
     */
    public UUID getCollectionId() {
        return collectionId;
    }

    /**
     * Setter for CollectionId
     * @param collectionId
     */
    public void setCollectionId(final UUID collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * Getter for HasMoreChanges
     * @return boolean
     */
    public boolean getHasMoreChanges() {
        return hasMoreChanges;
    }

    /**
     * Setter for HasMoreChanges
     * @param hasMoreChanges
     */
    public void setHasMoreChanges(final boolean hasMoreChanges) {
        this.hasMoreChanges = hasMoreChanges;
    }

    /**
     * Getter for PolicyOverride
     * @return TfvcPolicyOverrideInfo
     */
    public TfvcPolicyOverrideInfo getPolicyOverride() {
        return policyOverride;
    }

    /**
     * Setter for PolicyOverride
     * @param policyOverride
     */
    public void setPolicyOverride(final TfvcPolicyOverrideInfo policyOverride) {
        this.policyOverride = policyOverride;
    }

    /**
     * Getter for WorkItems
     * @return List<AssociatedWorkItem>
     */
    public List<AssociatedWorkItem> getWorkItems() {
        return workItems;
    }

    /**
     * Setter for WorkItems
     * @param workItems
     */
    public void setWorkItems(final List<AssociatedWorkItem> workItems) {
        this.workItems = workItems;
    }
}
