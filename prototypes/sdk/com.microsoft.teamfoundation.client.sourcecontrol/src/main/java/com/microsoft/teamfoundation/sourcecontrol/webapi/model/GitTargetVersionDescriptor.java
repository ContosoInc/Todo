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

public class GitTargetVersionDescriptor
    extends GitVersionDescriptor {

    private String version;
    private GitVersionOptions versionOptions;
    private GitVersionType versionType;

    @JsonProperty("targetVersion")
    public String getVersion() {
        return version;
    }

    @JsonProperty("targetVersion")
    public void setVersion(final String version) {
        this.version = version;
    }

    @JsonProperty("targetVersionOptions")
    public GitVersionOptions getVersionOptions() {
        return versionOptions;
    }

    @JsonProperty("targetVersionOptions")
    public void setVersionOptions(final GitVersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    @JsonProperty("targetVersionType")
    public GitVersionType getVersionType() {
        return versionType;
    }

    @JsonProperty("targetVersionType")
    public void setVersionType(final GitVersionType versionType) {
        this.versionType = versionType;
    }
}
