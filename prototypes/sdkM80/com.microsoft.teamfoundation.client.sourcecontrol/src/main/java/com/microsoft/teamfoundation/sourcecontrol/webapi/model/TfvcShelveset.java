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

public class TfvcShelveset
    extends TfvcShelvesetRef {

    private List<TfvcChange> changes;
    private CheckinNote[] notes;
    private TfvcPolicyOverrideInfo policyOverride;
    private List<AssociatedWorkItem> workItems;

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
     * Getter for Notes
     * @return CheckinNote[]
     */
    public CheckinNote[] getNotes() {
        return notes;
    }

    /**
     * Setter for Notes
     * @param notes
     */
    public void setNotes(final CheckinNote[] notes) {
        this.notes = notes;
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
