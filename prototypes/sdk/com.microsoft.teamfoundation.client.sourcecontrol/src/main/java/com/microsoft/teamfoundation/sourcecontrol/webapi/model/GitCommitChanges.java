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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.ChangeCountDictionary;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitChange;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitCommitChanges {

    private ChangeCountDictionary changeCounts;
    private List<GitChange> changes;

    public ChangeCountDictionary getChangeCounts() {
        return changeCounts;
    }

    public void setChangeCounts(final ChangeCountDictionary changeCounts) {
        this.changeCounts = changeCounts;
    }

    public List<GitChange> getChanges() {
        return changes;
    }

    public void setChanges(final List<GitChange> changes) {
        this.changes = changes;
    }
}
