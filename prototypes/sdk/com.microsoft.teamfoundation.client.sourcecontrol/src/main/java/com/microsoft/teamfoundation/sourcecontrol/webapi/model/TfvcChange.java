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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcItem;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcMergeSource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
