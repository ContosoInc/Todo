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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitItemDescriptor;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
