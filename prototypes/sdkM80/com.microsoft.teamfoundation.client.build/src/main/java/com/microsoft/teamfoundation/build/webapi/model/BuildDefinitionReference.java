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

public class BuildDefinitionReference
    extends DefinitionReference {

    private IdentityRef authoredBy;
    private DocumentQuality documentQuality;
    private int parentDefinitionId;
    private TeamProjectReference project;

    /**
     * Getter for AuthoredBy
     * @return IdentityRef
     */
    public IdentityRef getAuthoredBy() {
        return authoredBy;
    }

    /**
     * Setter for AuthoredBy
     * @param authoredBy
     */
    public void setAuthoredBy(final IdentityRef authoredBy) {
        this.authoredBy = authoredBy;
    }

    /**
     * Getter for DocumentQuality
     * @return DocumentQuality
     */
    public DocumentQuality getDocumentQuality() {
        return documentQuality;
    }

    /**
     * Setter for DocumentQuality
     * @param documentQuality
     */
    public void setDocumentQuality(final DocumentQuality documentQuality) {
        this.documentQuality = documentQuality;
    }

    /**
     * Getter for ParentDefinitionId
     * @return int
     */
    public int getParentDefinitionId() {
        return parentDefinitionId;
    }

    /**
     * Setter for ParentDefinitionId
     * @param parentDefinitionId
     */
    public void setParentDefinitionId(final int parentDefinitionId) {
        this.parentDefinitionId = parentDefinitionId;
    }

    /**
     * Getter for Project
     * @return TeamProjectReference
     */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
     * Setter for Project
     * @param project
     */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
