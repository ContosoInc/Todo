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

public class TfvcShelvesetRequestData {

    private boolean includeDetails;
    private boolean includeLinks;
    private boolean includeWorkItems;
    private int maxChangeCount;
    private int maxCommentLength;
    private String name;
    private String owner;

    /**
     * Getter for IncludeDetails
     * @return boolean
     */
    public boolean getIncludeDetails() {
        return includeDetails;
    }

    /**
     * Setter for IncludeDetails
     * @param includeDetails
     */
    public void setIncludeDetails(final boolean includeDetails) {
        this.includeDetails = includeDetails;
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
     * Getter for IncludeWorkItems
     * @return boolean
     */
    public boolean getIncludeWorkItems() {
        return includeWorkItems;
    }

    /**
     * Setter for IncludeWorkItems
     * @param includeWorkItems
     */
    public void setIncludeWorkItems(final boolean includeWorkItems) {
        this.includeWorkItems = includeWorkItems;
    }

    /**
     * Getter for MaxChangeCount
     * @return int
     */
    public int getMaxChangeCount() {
        return maxChangeCount;
    }

    /**
     * Setter for MaxChangeCount
     * @param maxChangeCount
     */
    public void setMaxChangeCount(final int maxChangeCount) {
        this.maxChangeCount = maxChangeCount;
    }

    /**
     * Getter for MaxCommentLength
     * @return int
     */
    public int getMaxCommentLength() {
        return maxCommentLength;
    }

    /**
     * Setter for MaxCommentLength
     * @param maxCommentLength
     */
    public void setMaxCommentLength(final int maxCommentLength) {
        this.maxCommentLength = maxCommentLength;
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
