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


public class TfvcItemRequestData {

    private boolean includeContentMetadata;
    private boolean includeLinks;
    private TfvcItemDescriptor[] itemDescriptors;

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

    public TfvcItemDescriptor[] getItemDescriptors() {
        return itemDescriptors;
    }

    public void setItemDescriptors(final TfvcItemDescriptor[] itemDescriptors) {
        this.itemDescriptors = itemDescriptors;
    }
}
