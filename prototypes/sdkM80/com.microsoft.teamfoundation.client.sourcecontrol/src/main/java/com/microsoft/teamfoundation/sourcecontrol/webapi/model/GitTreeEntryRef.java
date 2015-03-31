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

public class GitTreeEntryRef {

    private GitObjectType gitObjectType;
    private String mode;
    private String objectId;
    private String relativePath;
    private long size;
    private String url;

    /**
     * Getter for GitObjectType
     * @return GitObjectType
     */
    public GitObjectType getGitObjectType() {
        return gitObjectType;
    }

    /**
     * Setter for GitObjectType
     * @param gitObjectType
     */
    public void setGitObjectType(final GitObjectType gitObjectType) {
        this.gitObjectType = gitObjectType;
    }

    /**
     * Getter for Mode
     * @return String
     */
    public String getMode() {
        return mode;
    }

    /**
     * Setter for Mode
     * @param mode
     */
    public void setMode(final String mode) {
        this.mode = mode;
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
     * Getter for RelativePath
     * @return String
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * Setter for RelativePath
     * @param relativePath
     */
    public void setRelativePath(final String relativePath) {
        this.relativePath = relativePath;
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
