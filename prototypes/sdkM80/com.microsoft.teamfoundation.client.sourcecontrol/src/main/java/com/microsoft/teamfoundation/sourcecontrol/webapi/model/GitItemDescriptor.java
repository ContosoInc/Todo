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

public class GitItemDescriptor {

    private String path;
    private VersionControlRecursionType recursionLevel;
    private String version;
    private GitVersionOptions versionOptions;
    private GitVersionType versionType;

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
     * Getter for RecursionLevel
     * @return VersionControlRecursionType
     */
    public VersionControlRecursionType getRecursionLevel() {
        return recursionLevel;
    }

    /**
     * Setter for RecursionLevel
     * @param recursionLevel
     */
    public void setRecursionLevel(final VersionControlRecursionType recursionLevel) {
        this.recursionLevel = recursionLevel;
    }

    /**
     * Getter for Version
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final String version) {
        this.version = version;
    }

    /**
     * Getter for VersionOptions
     * @return GitVersionOptions
     */
    public GitVersionOptions getVersionOptions() {
        return versionOptions;
    }

    /**
     * Setter for VersionOptions
     * @param versionOptions
     */
    public void setVersionOptions(final GitVersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    /**
     * Getter for VersionType
     * @return GitVersionType
     */
    public GitVersionType getVersionType() {
        return versionType;
    }

    /**
     * Setter for VersionType
     * @param versionType
     */
    public void setVersionType(final GitVersionType versionType) {
        this.versionType = versionType;
    }
}
