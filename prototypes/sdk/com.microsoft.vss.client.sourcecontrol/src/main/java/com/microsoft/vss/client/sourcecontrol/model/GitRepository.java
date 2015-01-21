package com.microsoft.vss.client.sourcecontrol.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.core.model.ReferenceLinks;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitRepositoryType;

public class GitRepository {
    public final static String ROOT_PATH = "/"; //$NON-NLS-1$

    private UUID id;
    private String name;
    private String url;
    private TeamProjectReference projectReference;
    private String defaultBranch;
    private String remoteUrl;
    private GitRepositoryType type;
    private ReferenceLinks links;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @JsonProperty("project")
    public TeamProjectReference getProjectReference() {
        return projectReference;
    }

    @JsonProperty("project")
    public void setProjectReference(final TeamProjectReference projectReference) {
        this.projectReference = projectReference;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public GitRepositoryType getType() {
        return type;
    }

    public void setType(final GitRepositoryType type) {
        this.type = type;
    }

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

}
