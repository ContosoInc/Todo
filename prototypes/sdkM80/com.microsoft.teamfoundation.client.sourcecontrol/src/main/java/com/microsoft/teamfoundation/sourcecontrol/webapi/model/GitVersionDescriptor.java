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

public class GitVersionDescriptor {

    private String version;
    private GitVersionOptions versionOptions;
    private GitVersionType versionType;

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
