package com.microsoft.vss.client.core.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamProject
    extends TeamProjectReference {
    private String description;
    private Map<String, Map<String, String>> capabilities;
    private ReferenceLinks links;
    private WebApiTeamRef defaultTeam;
    private String tfsUri;

    /**
     * Project description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Project description.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Set of capabilities this project has (such as process template & version
     * control).
     */
    public Map<String, Map<String, String>> getCapabilities() {
        return capabilities;
    }

    /**
     * Set of capabilities this project has (such as process template & version
     * control).
     */
    public void setCapabilities(final Map<String, Map<String, String>> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * The links to other objects related to this object.
     */
    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * The links to other objects related to this object.
     */
    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * The shallow ref to the default team.
     */
    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    /**
     * The shallow ref to the default team.
     */
    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }

    /**
     * Tfs Uri to this project - useful when querying teams.
     */
    public String getTfsUri() {
        return tfsUri;
    }

    /**
     * Tfs Uri to this project - useful when querying teams.
     */
    public void setTfsUri(final String tfsUri) {
        this.tfsUri = tfsUri;
    }

}
