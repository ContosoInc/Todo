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
import com.fasterxml.jackson.annotation.JsonProperty;

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
