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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.BuildSummary;
import com.microsoft.teamfoundation.build.webapi.model.ShallowReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildDeployment {

    private BuildSummary deployment;
    private ShallowReference sourceBuild;

    public BuildSummary getDeployment() {
        return deployment;
    }

    public void setDeployment(final BuildSummary deployment) {
        this.deployment = deployment;
    }

    public ShallowReference getSourceBuild() {
        return sourceBuild;
    }

    public void setSourceBuild(final ShallowReference sourceBuild) {
        this.sourceBuild = sourceBuild;
    }
}
