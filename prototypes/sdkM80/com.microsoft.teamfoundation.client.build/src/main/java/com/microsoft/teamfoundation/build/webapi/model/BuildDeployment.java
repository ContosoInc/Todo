/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;

public class BuildDeployment {

    private BuildSummary deployment;
    private ShallowReference sourceBuild;

    /**
     * Getter for Deployment
     * @return BuildSummary
     */
    public BuildSummary getDeployment() {
        return deployment;
    }

    /**
     * Setter for Deployment
     * @param deployment
     */
    public void setDeployment(final BuildSummary deployment) {
        this.deployment = deployment;
    }

    /**
     * Getter for SourceBuild
     * @return ShallowReference
     */
    public ShallowReference getSourceBuild() {
        return sourceBuild;
    }

    /**
     * Setter for SourceBuild
     * @param sourceBuild
     */
    public void setSourceBuild(final ShallowReference sourceBuild) {
        this.sourceBuild = sourceBuild;
    }
}
