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

public class GitCommitChanges {

    private ChangeCountDictionary changeCounts;
    private List<GitChange> changes;

    /**
     * Getter for ChangeCounts
     * @return ChangeCountDictionary
     */
    public ChangeCountDictionary getChangeCounts() {
        return changeCounts;
    }

    /**
     * Setter for ChangeCounts
     * @param changeCounts
     */
    public void setChangeCounts(final ChangeCountDictionary changeCounts) {
        this.changeCounts = changeCounts;
    }

    /**
     * Getter for Changes
     * @return List<GitChange>
     */
    public List<GitChange> getChanges() {
        return changes;
    }

    /**
     * Setter for Changes
     * @param changes
     */
    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }
}
