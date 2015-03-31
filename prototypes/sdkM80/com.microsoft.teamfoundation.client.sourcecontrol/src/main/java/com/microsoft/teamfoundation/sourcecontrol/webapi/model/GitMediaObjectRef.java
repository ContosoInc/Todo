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

public class GitMediaObjectRef {

    private String id;
    private ReferenceLinks links;
    private String oid;
    private long size;
    private String url;

    /**
     * Getter for Id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
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
     * Getter for Oid
     * @return String
     */
    public String getOid() {
        return oid;
    }

    /**
     * Setter for Oid
     * @param oid
     */
    public void setOid(final String oid) {
        this.oid = oid;
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
