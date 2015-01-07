package com.microsoft.vss.client.build.model;

import java.net.URI;
import java.util.UUID;

/**
 * Created by yacao on 12/12/2014.
 */
public class TaskOrchestrationPlanReference {
    private URI artifactLocation;
    private URI artifactUri;
    private UUID planId;

    public URI getArtifactLocation() {
        return artifactLocation;
    }

    public void setArtifactLocation(URI artifactLocation) {
        this.artifactLocation = artifactLocation;
    }

    public URI getArtifactUri() {
        return artifactUri;
    }

    public void setArtifactUri(URI artifactUri) {
        this.artifactUri = artifactUri;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(UUID planId) {
        this.planId = planId;
    }
}
