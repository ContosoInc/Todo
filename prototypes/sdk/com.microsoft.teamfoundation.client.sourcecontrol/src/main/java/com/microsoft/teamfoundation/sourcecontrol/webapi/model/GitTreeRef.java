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
import com.fasterxml.jackson.annotation.JsonProperty;

public class GitTreeRef {

    private ReferenceLinks links;
    private String objectId;
    private long size;
    private List<GitTreeEntryRef> treeEntries;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        this.size = size;
    }

    public List<GitTreeEntryRef> getTreeEntries() {
        return treeEntries;
    }

    public void setTreeEntries(final List<GitTreeEntryRef> treeEntries) {
        this.treeEntries = treeEntries;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
