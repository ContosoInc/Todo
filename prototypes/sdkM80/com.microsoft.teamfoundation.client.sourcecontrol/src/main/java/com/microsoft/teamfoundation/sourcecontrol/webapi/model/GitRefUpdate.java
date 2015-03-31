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

public class GitRefUpdate {

    private String name;
    private String newObjectId;
    private String oldObjectId;
    private UUID repositoryId;

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
     * Getter for NewObjectId
     * @return String
     */
    public String getNewObjectId() {
        return newObjectId;
    }

    /**
     * Setter for NewObjectId
     * @param newObjectId
     */
    public void setNewObjectId(final String newObjectId) {
        this.newObjectId = newObjectId;
    }

    /**
     * Getter for OldObjectId
     * @return String
     */
    public String getOldObjectId() {
        return oldObjectId;
    }

    /**
     * Setter for OldObjectId
     * @param oldObjectId
     */
    public void setOldObjectId(final String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    /**
     * Getter for RepositoryId
     * @return UUID
     */
    public UUID getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId
     * @param repositoryId
     */
    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }
}
