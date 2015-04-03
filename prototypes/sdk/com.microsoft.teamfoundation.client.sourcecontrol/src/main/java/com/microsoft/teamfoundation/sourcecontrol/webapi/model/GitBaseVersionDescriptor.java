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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionDescriptor;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionOptions;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitBaseVersionDescriptor
    extends GitVersionDescriptor {

    private String baseVersion;
    private GitVersionOptions baseVersionOptions;
    private GitVersionType baseVersionType;

    public String getBaseVersion() {
        return baseVersion;
    }

    public void setBaseVersion(final String baseVersion) {
        this.baseVersion = baseVersion;
    }

    public GitVersionOptions getBaseVersionOptions() {
        return baseVersionOptions;
    }

    public void setBaseVersionOptions(final GitVersionOptions baseVersionOptions) {
        this.baseVersionOptions = baseVersionOptions;
    }

    public GitVersionType getBaseVersionType() {
        return baseVersionType;
    }

    public void setBaseVersionType(final GitVersionType baseVersionType) {
        this.baseVersionType = baseVersionType;
    }
}
