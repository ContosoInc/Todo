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

import java.util.List;

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
