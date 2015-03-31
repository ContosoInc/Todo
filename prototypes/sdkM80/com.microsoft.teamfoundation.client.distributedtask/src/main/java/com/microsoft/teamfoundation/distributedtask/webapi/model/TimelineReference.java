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

public class TimelineReference {

    private int changeId;
    private UUID id;
    private URI location;

    /**
     * Getter for ChangeId
     * @return int
     */
    public int getChangeId() {
        return changeId;
    }

    /**
     * Setter for ChangeId
     * @param changeId
     */
    public void setChangeId(final int changeId) {
        this.changeId = changeId;
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
     * Getter for Location
     * @return URI
     */
    public URI getLocation() {
        return location;
    }

    /**
     * Setter for Location
     * @param location
     */
    public void setLocation(final URI location) {
        this.location = location;
    }
}
