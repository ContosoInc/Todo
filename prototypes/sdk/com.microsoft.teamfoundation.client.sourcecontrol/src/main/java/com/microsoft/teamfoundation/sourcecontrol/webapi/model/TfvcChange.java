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
