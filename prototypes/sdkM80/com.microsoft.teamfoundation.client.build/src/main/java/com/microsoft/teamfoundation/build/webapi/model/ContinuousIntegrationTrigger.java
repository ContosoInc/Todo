/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;

public class ContinuousIntegrationTrigger
    extends BuildTrigger {

    private boolean batchChanges;
    private List<String> branchFilters;

    /**
     * Getter for BatchChanges
     * @return boolean
     */
    public boolean getBatchChanges() {
        return batchChanges;
    }

    /**
     * Setter for BatchChanges
     * @param batchChanges
     */
    public void setBatchChanges(final boolean batchChanges) {
        this.batchChanges = batchChanges;
    }

    /**
     * Getter for BranchFilters
     * @return List<String>
     */
    public List<String> getBranchFilters() {
        return branchFilters;
    }

    /**
     * Setter for BranchFilters
     * @param branchFilters
     */
    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }
}
