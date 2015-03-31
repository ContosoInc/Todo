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

public class TfvcItemRequestData {

    private boolean includeContentMetadata;
    private boolean includeLinks;
    private TfvcItemDescriptor[] itemDescriptors;

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
     * @return TfvcItemDescriptor[]
     */
    public TfvcItemDescriptor[] getItemDescriptors() {
        return itemDescriptors;
    }

    /**
     * Setter for ItemDescriptors
     * @param itemDescriptors
     */
    public void setItemDescriptors(final TfvcItemDescriptor[] itemDescriptors) {
        this.itemDescriptors = itemDescriptors;
    }
}
