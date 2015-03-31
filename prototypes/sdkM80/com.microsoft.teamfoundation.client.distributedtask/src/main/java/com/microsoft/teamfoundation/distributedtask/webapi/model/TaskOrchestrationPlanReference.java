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

public class TaskOrchestrationPlanReference {

    private URI artifactLocation;
    private URI artifactUri;
    private UUID planId;

    /**
     * Getter for ArtifactLocation
     * @return URI
     */
    public URI getArtifactLocation() {
        return artifactLocation;
    }

    /**
     * Setter for ArtifactLocation
     * @param artifactLocation
     */
    public void setArtifactLocation(final URI artifactLocation) {
        this.artifactLocation = artifactLocation;
    }

    /**
     * Getter for ArtifactUri
     * @return URI
     */
    public URI getArtifactUri() {
        return artifactUri;
    }

    /**
     * Setter for ArtifactUri
     * @param artifactUri
     */
    public void setArtifactUri(final URI artifactUri) {
        this.artifactUri = artifactUri;
    }

    /**
     * Getter for PlanId
     * @return UUID
     */
    public UUID getPlanId() {
        return planId;
    }

    /**
     * Setter for PlanId
     * @param planId
     */
    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }
}
