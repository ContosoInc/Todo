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

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.AssociatedWorkItem;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.CheckinNote;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcChange;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcPolicyOverrideInfo;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcShelvesetRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcShelveset
    extends TfvcShelvesetRef {

    private List<TfvcChange> changes;
    private CheckinNote[] notes;
    private TfvcPolicyOverrideInfo policyOverride;
    private List<AssociatedWorkItem> workItems;

    public List<TfvcChange> getChanges() {
        return changes;
    }

    public void setChanges(final List<TfvcChange> changes) {
        this.changes = changes;
    }

    public CheckinNote[] getNotes() {
        return notes;
    }

    public void setNotes(final CheckinNote[] notes) {
        this.notes = notes;
    }

    public TfvcPolicyOverrideInfo getPolicyOverride() {
        return policyOverride;
    }

    public void setPolicyOverride(final TfvcPolicyOverrideInfo policyOverride) {
        this.policyOverride = policyOverride;
    }

    public List<AssociatedWorkItem> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final List<AssociatedWorkItem> workItems) {
        this.workItems = workItems;
    }
}
