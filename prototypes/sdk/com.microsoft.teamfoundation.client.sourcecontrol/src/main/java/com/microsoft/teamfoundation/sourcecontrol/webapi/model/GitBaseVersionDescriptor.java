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
