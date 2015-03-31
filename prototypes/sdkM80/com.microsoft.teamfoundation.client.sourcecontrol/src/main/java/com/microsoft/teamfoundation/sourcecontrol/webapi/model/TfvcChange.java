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

public class TfvcChange
    extends Change<TfvcItem> {

    private List<TfvcMergeSource> mergeSources;
    private int pendingVersion;

    /**
     * Getter for MergeSources
     * @return List<TfvcMergeSource>
     */
    public List<TfvcMergeSource> getMergeSources() {
        return mergeSources;
    }

    /**
     * Setter for MergeSources
     * @param mergeSources
     */
    public void setMergeSources(final List<TfvcMergeSource> mergeSources) {
        this.mergeSources = mergeSources;
    }

    /**
     * Getter for PendingVersion
     * @return int
     */
    public int getPendingVersion() {
        return pendingVersion;
    }

    /**
     * Setter for PendingVersion
     * @param pendingVersion
     */
    public void setPendingVersion(final int pendingVersion) {
        this.pendingVersion = pendingVersion;
    }
}
