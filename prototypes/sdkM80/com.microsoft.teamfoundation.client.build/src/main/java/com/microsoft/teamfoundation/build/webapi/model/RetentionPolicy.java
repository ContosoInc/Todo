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

public class RetentionPolicy {

    private List<String> branches;
    private int daysToKeep;
    private boolean deleteBuildRecord;

    /**
     * Getter for Branches
     * @return List<String>
     */
    public List<String> getBranches() {
        return branches;
    }

    /**
     * Setter for Branches
     * @param branches
     */
    public void setBranches(final List<String> branches) {
        this.branches = branches;
    }

    /**
     * Getter for DaysToKeep
     * @return int
     */
    public int getDaysToKeep() {
        return daysToKeep;
    }

    /**
     * Setter for DaysToKeep
     * @param daysToKeep
     */
    public void setDaysToKeep(final int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    /**
     * Getter for DeleteBuildRecord
     * @return boolean
     */
    public boolean getDeleteBuildRecord() {
        return deleteBuildRecord;
    }

    /**
     * Setter for DeleteBuildRecord
     * @param deleteBuildRecord
     */
    public void setDeleteBuildRecord(final boolean deleteBuildRecord) {
        this.deleteBuildRecord = deleteBuildRecord;
    }
}
