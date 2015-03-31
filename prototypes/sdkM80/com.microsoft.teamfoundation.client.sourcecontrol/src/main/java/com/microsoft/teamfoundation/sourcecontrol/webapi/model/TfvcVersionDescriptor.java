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

public class TfvcVersionDescriptor {

    private String version;
    private TfvcVersionOption versionOption;
    private TfvcVersionType versionType;

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
     * Getter for VersionOption
     * @return TfvcVersionOption
     */
    public TfvcVersionOption getVersionOption() {
        return versionOption;
    }

    /**
     * Setter for VersionOption
     * @param versionOption
     */
    public void setVersionOption(final TfvcVersionOption versionOption) {
        this.versionOption = versionOption;
    }

    /**
     * Getter for VersionType
     * @return TfvcVersionType
     */
    public TfvcVersionType getVersionType() {
        return versionType;
    }

    /**
     * Setter for VersionType
     * @param versionType
     */
    public void setVersionType(final TfvcVersionType versionType) {
        this.versionType = versionType;
    }
}
