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

public class GitTreeRef {

    private ReferenceLinks links;
    private String objectId;
    private long size;
    private List<GitTreeEntryRef> treeEntries;
    private String url;

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
     * Getter for ObjectId
     * @return String
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Setter for ObjectId
     * @param objectId
     */
    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    /**
     * Getter for Size
     * @return long
     */
    public long getSize() {
        return size;
    }

    /**
     * Setter for Size
     * @param size
     */
    public void setSize(final long size) {
        this.size = size;
    }

    /**
     * Getter for TreeEntries
     * @return List<GitTreeEntryRef>
     */
    public List<GitTreeEntryRef> getTreeEntries() {
        return treeEntries;
    }

    /**
     * Setter for TreeEntries
     * @param treeEntries
     */
    public void setTreeEntries(final List<GitTreeEntryRef> treeEntries) {
        this.treeEntries = treeEntries;
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
