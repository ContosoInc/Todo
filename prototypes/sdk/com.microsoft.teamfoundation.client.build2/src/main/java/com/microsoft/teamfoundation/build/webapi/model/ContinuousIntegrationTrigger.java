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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.BuildTrigger;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ContinuousIntegrationTrigger
    extends BuildTrigger {

    private boolean batchChanges;
    private List<String> branchFilters;

    public boolean getBatchChanges() {
        return batchChanges;
    }

    public void setBatchChanges(final boolean batchChanges) {
        this.batchChanges = batchChanges;
    }

    public List<String> getBranchFilters() {
        return branchFilters;
    }

    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }
}
