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

    /**
     * Getter for IncludeContentMetadata
     * @return boolean
     */
    public boolean getIncludeContentMetadata() {
        return includeContentMetadata;
    }

    /**
     * Setter for IncludeContentMetadata
     * @param includeContentMetadata
     */
    public void setIncludeContentMetadata(final boolean includeContentMetadata) {
        this.includeContentMetadata = includeContentMetadata;
    }

    /**
     * Getter for IncludeLinks
     * @return boolean
     */
    public boolean getIncludeLinks() {
        return includeLinks;
    }

    /**
     * Setter for IncludeLinks
     * @param includeLinks
     */
    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    /**
     * Getter for ItemDescriptors
     * @return GitItemDescriptor[]
     */
    public GitItemDescriptor[] getItemDescriptors() {
        return itemDescriptors;
    }

    /**
     * Setter for ItemDescriptors
     * @param itemDescriptors
     */
    public void setItemDescriptors(final GitItemDescriptor[] itemDescriptors) {
        this.itemDescriptors = itemDescriptors;
    }

    /**
     * Getter for LatestProcessedChange
     * @return boolean
     */
    public boolean getLatestProcessedChange() {
        return latestProcessedChange;
    }

    /**
     * Setter for LatestProcessedChange
     * @param latestProcessedChange
     */
    public void setLatestProcessedChange(final boolean latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }
}
