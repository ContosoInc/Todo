/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionReference
    extends DefinitionReference {

    private IdentityRef authoredBy;
    private DocumentQuality documentQuality;
    private int parentDefinitionId;
    private TeamProjectReference project;

    public IdentityRef getAuthoredBy() {
        return authoredBy;
    }

    public void setAuthoredBy(final IdentityRef authoredBy) {
        this.authoredBy = authoredBy;
    }

    public DocumentQuality getDocumentQuality() {
        return documentQuality;
    }

    public void setDocumentQuality(final DocumentQuality documentQuality) {
        this.documentQuality = documentQuality;
    }

    public int getParentDefinitionId() {
        return parentDefinitionId;
    }

    public void setParentDefinitionId(final int parentDefinitionId) {
        this.parentDefinitionId = parentDefinitionId;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
