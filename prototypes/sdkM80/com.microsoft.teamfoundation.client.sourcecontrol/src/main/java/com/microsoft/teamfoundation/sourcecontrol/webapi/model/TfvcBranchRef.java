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

public class TfvcBranchRef
    extends TfvcShallowBranchRef {

    private Date createdDate;
    private String description;
    private boolean isDeleted;
    private ReferenceLinks links;
    private IdentityRef owner;
    private String url;

    /**
     * Getter for CreatedDate
     * @return Date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter for CreatedDate
     * @param createdDate
     */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for IsDeleted
     * @return boolean
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Setter for IsDeleted
     * @param isDeleted
     */
    public void setIsDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for Owner
     * @return IdentityRef
     */
    public IdentityRef getOwner() {
        return owner;
    }

    /**
     * Setter for Owner
     * @param owner
     */
    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
