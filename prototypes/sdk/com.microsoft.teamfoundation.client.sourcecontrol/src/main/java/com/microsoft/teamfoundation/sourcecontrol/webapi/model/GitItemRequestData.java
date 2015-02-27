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

public class GitItemRequestData {

    private boolean includeContentMetadata;
    private boolean includeLinks;
    private GitItemDescriptor[] itemDescriptors;
    private boolean latestProcessedChange;

    public boolean getIncludeContentMetadata() {
        return includeContentMetadata;
    }

    public void setIncludeContentMetadata(final boolean includeContentMetadata) {
        this.includeContentMetadata = includeContentMetadata;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public GitItemDescriptor[] getItemDescriptors() {
        return itemDescriptors;
    }

    public void setItemDescriptors(final GitItemDescriptor[] itemDescriptors) {
        this.itemDescriptors = itemDescriptors;
    }

    public boolean getLatestProcessedChange() {
        return latestProcessedChange;
    }

    public void setLatestProcessedChange(final boolean latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }
}
