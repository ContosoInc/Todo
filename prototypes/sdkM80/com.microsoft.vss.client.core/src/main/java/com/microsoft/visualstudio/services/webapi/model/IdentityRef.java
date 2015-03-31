/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.visualstudio.services.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;

public class IdentityRef {

    private String displayName;
    private String id;
    private String imageUrl;
    private boolean isAadIdentity;
    private boolean isContainer;
    private String profileUrl;
    private String uniqueName;
    private String url;

    /**
     * Getter for display name
     * @return String
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for display name
     * @param displayName
     */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for identify ref id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for identity ref id
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Getter for image url
     * @return String
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for image url
     * @param imageUrl
     */
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter to check if it is an AAD identity
     * @return boolean
     */
    public boolean getIsAadIdentity() {
        return isAadIdentity;
    }

    /**
     * Setter to indicate if it is an AAD identity
     * @param isAadIdentity
     */
    public void setIsAadIdentity(final boolean isAadIdentity) {
        this.isAadIdentity = isAadIdentity;
    }

    /**
     * Getter to check if container
     * @return boolean
     */
    public boolean getIsContainer() {
        return isContainer;
    }

    /**
     * Setter to indicate if it is a container
     * @param isContainer
     */
    public void setIsContainer(final boolean isContainer) {
        this.isContainer = isContainer;
    }

    /**
     * Getter for identity profile url
     * @return String
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Setter for identity profile url
     * @param profileUrl
     */
    public void setProfileUrl(final String profileUrl) {
        this.profileUrl = profileUrl;
    }

    /**
     * Getter for unique name of identity
     * @return String
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * Setter for unique name of identity
     * @param uniqueName
     */
    public void setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
    }

    /**
     * Getter for identity ref url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for identity ref url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
