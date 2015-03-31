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

    /**
     * Getter for id
     * @return UUID
     */
    @JsonProperty
    public UUID getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id
     */
    @JsonProperty
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
     * Getter for resource area
     * @return String
     */
    @JsonProperty
    public String getArea() {
        return area;
    }

    /**
     * Setter for resource area
     * @param area
     */
    @JsonProperty
    public void setArea(final String area) {
        this.area = area;
    }

    /**
     * Getter for resource name
     * @return String
     */
    @JsonProperty
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Setter for resource name
     * @param resourceName
     */
    @JsonProperty
    public void setResourceName(final String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Getter for route template
     * @return String
     */
    @JsonProperty
    public String getRouteTemplate() {
        return routeTemplate;
    }

    /**
     * Setter for route template
     * @param routeTemplate
     */
    @JsonProperty
    public void setRouteTemplate(final String routeTemplate) {
        this.routeTemplate = routeTemplate;
    }

    /**
     * Getter for resource route name
     * @return String
     */
    @JsonProperty
    public String getRouteName() {
        return routeName;
    }

    /**
     * Setter for resource route name
     * @param routeName
     */
    @JsonProperty
    public void setRouteName(final String routeName) {
        this.routeName = routeName;
    }

    /**
     * Getter for resource version
     * @return int
     */
    @JsonProperty
    public int getResourceVersion() {
        return resourceVersion;
    }

    /**
     * Setter for resource version
     * @param resourceVersion
     */
    @JsonProperty
    public void setResourceVersion(final int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
     * Getter for min version
     * @return String
     */
    @JsonProperty
    public String getMinVersion() {
        return minVersion;
    }

    /**
     * Setter for min version
     * @param minVersion
     */
    @JsonProperty
    public void setMinVersion(final String minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * Getter for max version
     * @return String
     */
    @JsonProperty
    public String getMaxVersion() {
        return maxVersion;
    }

    /**
     * Setter for max version
     * @param maxVersion
     */
    @JsonProperty
    public void setMaxVersion(final String maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
     * Getter for released version
     * @return String
     */
    @JsonProperty
    public String getReleasedVersion() {
        return releasedVersion;
    }

    /**
     * Setter for released version
     * @param releasedVersion
     */
    @JsonProperty
    public void setReleasedVersion(final String releasedVersion) {
        this.releasedVersion = releasedVersion;
    }
}
