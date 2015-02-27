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

public class ItemModel {

    private FileContentMetadata contentMetadata;
    private boolean isFolder;
    private boolean isSymbolicLink;
    private ReferenceLinks links;
    private String path;
    private String url;

    public FileContentMetadata getContentMetadata() {
        return contentMetadata;
    }

    public void setContentMetadata(final FileContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
    }

    public boolean getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(final boolean isFolder) {
        this.isFolder = isFolder;
    }

    public boolean getIsSymbolicLink() {
        return isSymbolicLink;
    }

    public void setIsSymbolicLink(final boolean isSymbolicLink) {
        this.isSymbolicLink = isSymbolicLink;
    }

    public ReferenceLinks getLinks() {
        return links;
    }

    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
