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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(final String newObjectId) {
        this.newObjectId = newObjectId;
    }

    public String getOldObjectId() {
        return oldObjectId;
    }

    public void setOldObjectId(final String oldObjectId) {
        this.oldObjectId = oldObjectId;
    }

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }
}
