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

public class TfvcVersionDescriptor {

    private String version;
    private TfvcVersionOption versionOption;
    private TfvcVersionType versionType;

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
