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


public class GitTargetVersionDescriptor
    extends GitVersionDescriptor {

    private String targetVersion;
    private GitVersionOptions targetVersionOptions;
    private GitVersionType targetVersionType;

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(final String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public GitVersionOptions getTargetVersionOptions() {
        return targetVersionOptions;
    }

    public void setTargetVersionOptions(final GitVersionOptions targetVersionOptions) {
        this.targetVersionOptions = targetVersionOptions;
    }

    public GitVersionType getTargetVersionType() {
        return targetVersionType;
    }

    public void setTargetVersionType(final GitVersionType targetVersionType) {
        this.targetVersionType = targetVersionType;
    }
}
