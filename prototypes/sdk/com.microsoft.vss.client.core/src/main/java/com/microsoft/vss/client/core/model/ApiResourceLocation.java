package com.microsoft.vss.client.core.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResourceLocation {
    private UUID id;
    private String area;
    private String resourceName;
    private String routeTemplate;
    private String routeName;
    private int resourceVersion;
    private String minVersion;
    private String maxVersion;
    private String releasedVersion;

    @JsonProperty
    public UUID getId() {
        return id;
    }

    @JsonProperty
    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty
    public String getArea() {
        return area;
    }

    @JsonProperty
    public void setArea(final String area) {
        this.area = area;
    }

    @JsonProperty
    public String getResourceName() {
        return resourceName;
    }

    @JsonProperty
    public void setResourceName(final String resourceName) {
        this.resourceName = resourceName;
    }

    @JsonProperty
    public String getRouteTemplate() {
        return routeTemplate;
    }

    @JsonProperty
    public void setRouteTemplate(final String routeTemplate) {
        this.routeTemplate = routeTemplate;
    }

    @JsonProperty
    public String getRouteName() {
        return routeName;
    }

    @JsonProperty
    public void setRouteName(final String routeName) {
        this.routeName = routeName;
    }

    @JsonProperty
    public int getResourceVersion() {
        return resourceVersion;
    }

    @JsonProperty
    public void setResourceVersion(final int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @JsonProperty
    public String getMinVersion() {
        return minVersion;
    }

    @JsonProperty
    public void setMinVersion(final String minVersion) {
        this.minVersion = minVersion;
    }

    @JsonProperty
    public String getMaxVersion() {
        return maxVersion;
    }

    @JsonProperty
    public void setMaxVersion(final String maxVersion) {
        this.maxVersion = maxVersion;
    }

    @JsonProperty
    public String getReleasedVersion() {
        return releasedVersion;
    }

    @JsonProperty
    public void setReleasedVersion(final String releasedVersion) {
        this.releasedVersion = releasedVersion;
    }
}
