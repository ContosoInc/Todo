/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.build.webapi.model;

import java.net.URI;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;

public class DefinitionReference
    extends ShallowReference {

    private TeamProjectReference project;
    private DefinitionQueueStatus queueStatus;
    private int revision;
    private DefinitionType type;
    private URI uri;

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public DefinitionQueueStatus getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(final DefinitionQueueStatus queueStatus) {
        this.queueStatus = queueStatus;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public DefinitionType getType() {
        return type;
    }

    public void setType(final DefinitionType type) {
        this.type = type;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(final URI uri) {
        this.uri = uri;
    }
}
