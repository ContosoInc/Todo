/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskOrchestrationPlanReference {

    private URI artifactLocation;
    private URI artifactUri;
    private UUID planId;

    public URI getArtifactLocation() {
        return artifactLocation;
    }

    public void setArtifactLocation(final URI artifactLocation) {
        this.artifactLocation = artifactLocation;
    }

    public URI getArtifactUri() {
        return artifactUri;
    }

    public void setArtifactUri(final URI artifactUri) {
        this.artifactUri = artifactUri;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }
}
