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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionOptions;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitVersionDescriptor {

    private String version;
    private GitVersionOptions versionOptions;
    private GitVersionType versionType;

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public GitVersionOptions getVersionOptions() {
        return versionOptions;
    }

    public void setVersionOptions(final GitVersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    public GitVersionType getVersionType() {
        return versionType;
    }

    public void setVersionType(final GitVersionType versionType) {
        this.versionType = versionType;
    }
}
