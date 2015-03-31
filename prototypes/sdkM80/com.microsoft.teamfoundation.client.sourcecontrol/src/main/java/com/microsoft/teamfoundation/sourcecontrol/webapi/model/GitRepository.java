/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class GitRepository {

    private String defaultBranch;
    private UUID id;
    private ReferenceLinks links;
    private String name;
    private TeamProjectReference projectReference;
    private String remoteUrl;
    private GitRepositoryType type;
    private String url;

    /**
     * Getter for DefaultBranch
     * @return String
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Setter for DefaultBranch
     * @param defaultBranch
     */
    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * Getter for Id
     * @return UUID
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for ProjectReference
     * @return TeamProjectReference
     */
    public TeamProjectReference getProjectReference() {
        return projectReference;
    }

    /**
     * Setter for ProjectReference
     * @param projectReference
     */
    public void setProjectReference(final TeamProjectReference projectReference) {
        this.projectReference = projectReference;
    }

    /**
     * Getter for RemoteUrl
     * @return String
     */
    public String getRemoteUrl() {
        return remoteUrl;
    }

    /**
     * Setter for RemoteUrl
     * @param remoteUrl
     */
    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    /**
     * Getter for Type
     * @return GitRepositoryType
     */
    public GitRepositoryType getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final GitRepositoryType type) {
        this.type = type;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
