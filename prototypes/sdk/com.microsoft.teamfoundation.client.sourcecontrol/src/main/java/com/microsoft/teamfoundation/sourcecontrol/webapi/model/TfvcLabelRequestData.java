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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcLabelRequestData {

    private boolean includeLinks;
    private String itemLabelFilter;
    private String labelScope;
    private int maxItemCount;
    private String name;
    private String owner;

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public String getItemLabelFilter() {
        return itemLabelFilter;
    }

    public void setItemLabelFilter(final String itemLabelFilter) {
        this.itemLabelFilter = itemLabelFilter;
    }

    public String getLabelScope() {
        return labelScope;
    }

    public void setLabelScope(final String labelScope) {
        this.labelScope = labelScope;
    }

    public int getMaxItemCount() {
        return maxItemCount;
    }

    public void setMaxItemCount(final int maxItemCount) {
        this.maxItemCount = maxItemCount;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }
}
