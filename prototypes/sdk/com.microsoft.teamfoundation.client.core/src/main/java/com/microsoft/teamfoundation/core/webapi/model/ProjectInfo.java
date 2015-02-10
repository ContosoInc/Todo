/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectInfo {

    private String abbreviation;
    private UUID id;
    private List<String> knownNames;
    private Date lastUpdateTime;
    private String name;
    private List<ProjectProperty> properties;
    private long revision;
    private ProjectState state;
    private String uri;
    private long version;

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public List<String> getKnownNames() {
        return knownNames;
    }

    public void setKnownNames(final List<String> knownNames) {
        this.knownNames = knownNames;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(final Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ProjectProperty> getProperties() {
        return properties;
    }

    public void setProperties(final List<ProjectProperty> properties) {
        this.properties = properties;
    }

    public long getRevision() {
        return revision;
    }

    public void setRevision(final long revision) {
        this.revision = revision;
    }

    public ProjectState getState() {
        return state;
    }

    public void setState(final ProjectState state) {
        this.state = state;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(final long version) {
        this.version = version;
    }
}
