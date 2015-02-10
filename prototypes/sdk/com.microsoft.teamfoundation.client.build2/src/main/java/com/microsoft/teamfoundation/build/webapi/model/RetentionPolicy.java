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
import com.fasterxml.jackson.annotation.JsonProperty;

public class RetentionPolicy {

    private List<String> branches;
    private int daysToKeep;
    private boolean deleteBuildRecord;

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(final List<String> branches) {
        this.branches = branches;
    }

    public int getDaysToKeep() {
        return daysToKeep;
    }

    public void setDaysToKeep(final int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    public boolean getDeleteBuildRecord() {
        return deleteBuildRecord;
    }

    public void setDeleteBuildRecord(final boolean deleteBuildRecord) {
        this.deleteBuildRecord = deleteBuildRecord;
    }
}
