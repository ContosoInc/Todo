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
    private UUID userId;
    private long version;

    /**
     * Getter for Abbreviation
     * @return String
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter for Abbreviation
     * @param abbreviation
     */
    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
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
     * Getter for KnownNames
     * @return List<String>
     */
    public List<String> getKnownNames() {
        return knownNames;
    }

    /**
     * Setter for KnownNames
     * @param knownNames
     */
    public void setKnownNames(final List<String> knownNames) {
        this.knownNames = knownNames;
    }

    /**
     * Getter for LastUpdateTime
     * @return Date
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Setter for LastUpdateTime
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(final Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
     * Getter for Properties
     * @return List<ProjectProperty>
     */
    public List<ProjectProperty> getProperties() {
        return properties;
    }

    /**
     * Setter for Properties
     * @param properties
     */
    public void setProperties(final List<ProjectProperty> properties) {
        this.properties = properties;
    }

    /**
     * Getter for Revision
     * @return long
     */
    public long getRevision() {
        return revision;
    }

    /**
     * Setter for Revision
     * @param revision
     */
    public void setRevision(final long revision) {
        this.revision = revision;
    }

    /**
     * Getter for State
     * @return ProjectState
     */
    public ProjectState getState() {
        return state;
    }

    /**
     * Setter for State
     * @param state
     */
    public void setState(final ProjectState state) {
        this.state = state;
    }

    /**
     * Getter for Uri
     * @return String
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri
     * @param uri
     */
    public void setUri(final String uri) {
        this.uri = uri;
    }

    /**
     * Getter for UserId
     * @return UUID
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     * Setter for UserId
     * @param userId
     */
    public void setUserId(final UUID userId) {
        this.userId = userId;
    }

    /**
     * Getter for Version
     * @return long
     */
    public long getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final long version) {
        this.version = version;
    }
}
