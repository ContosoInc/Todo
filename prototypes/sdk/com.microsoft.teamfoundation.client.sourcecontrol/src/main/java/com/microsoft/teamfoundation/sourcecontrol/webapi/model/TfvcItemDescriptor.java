/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcVersionOption;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcVersionType;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.VersionControlRecursionType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcItemDescriptor {

    private String path;
    private VersionControlRecursionType recursionLevel;
    private String version;
    private TfvcVersionOption versionOption;
    private TfvcVersionType versionType;

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public VersionControlRecursionType getRecursionLevel() {
        return recursionLevel;
    }

    public void setRecursionLevel(final VersionControlRecursionType recursionLevel) {
        this.recursionLevel = recursionLevel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public TfvcVersionOption getVersionOption() {
        return versionOption;
    }

    public void setVersionOption(final TfvcVersionOption versionOption) {
        this.versionOption = versionOption;
    }

    public TfvcVersionType getVersionType() {
        return versionType;
    }

    public void setVersionType(final TfvcVersionType versionType) {
        this.versionType = versionType;
    }
}
