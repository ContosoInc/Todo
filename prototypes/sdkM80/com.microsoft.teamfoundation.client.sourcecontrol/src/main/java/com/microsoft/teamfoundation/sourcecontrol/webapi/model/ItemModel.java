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

    /**
     * Getter for ContentMetadata
     * @return FileContentMetadata
     */
    public FileContentMetadata getContentMetadata() {
        return contentMetadata;
    }

    /**
     * Setter for ContentMetadata
     * @param contentMetadata
     */
    public void setContentMetadata(final FileContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
    }

    /**
     * Getter for IsFolder
     * @return boolean
     */
    public boolean getIsFolder() {
        return isFolder;
    }

    /**
     * Setter for IsFolder
     * @param isFolder
     */
    public void setIsFolder(final boolean isFolder) {
        this.isFolder = isFolder;
    }

    /**
     * Getter for IsSymbolicLink
     * @return boolean
     */
    public boolean getIsSymbolicLink() {
        return isSymbolicLink;
    }

    /**
     * Setter for IsSymbolicLink
     * @param isSymbolicLink
     */
    public void setIsSymbolicLink(final boolean isSymbolicLink) {
        this.isSymbolicLink = isSymbolicLink;
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
     * Getter for Path
     * @return String
     */
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path
     * @param path
     */
    public void setPath(final String path) {
        this.path = path;
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
