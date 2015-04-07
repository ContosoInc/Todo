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

import java.util.List;

public class TfvcChange
    extends Change<TfvcItem> {

    private List<TfvcMergeSource> mergeSources;
    private int pendingVersion;

    public List<TfvcMergeSource> getMergeSources() {
        return mergeSources;
    }

    public void setMergeSources(final List<TfvcMergeSource> mergeSources) {
        this.mergeSources = mergeSources;
    }

    public int getPendingVersion() {
        return pendingVersion;
    }

    public void setPendingVersion(final int pendingVersion) {
        this.pendingVersion = pendingVersion;
    }
}
