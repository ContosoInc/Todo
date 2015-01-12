package com.microsoft.vss.client.build.model;

public class BuildArtifact {
    private int id;
    private String name;
    private ArtifactResource resource;

    /**
     * The artifact id.
     */
    public int getId() {
        return id;
    }

    /**
     * The artifact id.
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * The name of the artifact
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the artifact
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * The actual resource
     */
    public ArtifactResource getResource() {
        return resource;
    }

    /**
     * The actual resource
     */
    public void setResource(final ArtifactResource resource) {
        this.resource = resource;
    }
}
