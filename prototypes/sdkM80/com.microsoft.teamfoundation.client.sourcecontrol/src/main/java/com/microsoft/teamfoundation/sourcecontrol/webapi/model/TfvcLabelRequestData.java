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

public class TfvcLabelRequestData {

    private boolean includeLinks;
    private String itemLabelFilter;
    private String labelScope;
    private int maxItemCount;
    private String name;
    private String owner;

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
     * Getter for ItemLabelFilter
     * @return String
     */
    public String getItemLabelFilter() {
        return itemLabelFilter;
    }

    /**
     * Setter for ItemLabelFilter
     * @param itemLabelFilter
     */
    public void setItemLabelFilter(final String itemLabelFilter) {
        this.itemLabelFilter = itemLabelFilter;
    }

    /**
     * Getter for LabelScope
     * @return String
     */
    public String getLabelScope() {
        return labelScope;
    }

    /**
     * Setter for LabelScope
     * @param labelScope
     */
    public void setLabelScope(final String labelScope) {
        this.labelScope = labelScope;
    }

    /**
     * Getter for MaxItemCount
     * @return int
     */
    public int getMaxItemCount() {
        return maxItemCount;
    }

    /**
     * Setter for MaxItemCount
     * @param maxItemCount
     */
    public void setMaxItemCount(final int maxItemCount) {
        this.maxItemCount = maxItemCount;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Owner
     * @return String
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for Owner
     * @param owner
     */
    public void setOwner(final String owner) {
        this.owner = owner;
    }
}
