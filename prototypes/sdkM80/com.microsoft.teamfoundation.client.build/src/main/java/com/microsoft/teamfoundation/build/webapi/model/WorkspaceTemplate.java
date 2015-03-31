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

public class WorkspaceTemplate {

    private String definitionUri;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private List<WorkspaceMapping> mappings;

    /**
     * Getter for DefinitionUri
     * @return String
     */
    public String getDefinitionUri() {
        return definitionUri;
    }

    /**
     * Setter for DefinitionUri
     * @param definitionUri
     */
    public void setDefinitionUri(final String definitionUri) {
        this.definitionUri = definitionUri;
    }

    /**
     * Getter for LastModifiedBy
     * @return String
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Setter for LastModifiedBy
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Getter for LastModifiedDate
     * @return Date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Setter for LastModifiedDate
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Getter for Mappings
     * @return List<WorkspaceMapping>
     */
    public List<WorkspaceMapping> getMappings() {
        return mappings;
    }

    /**
     * Setter for Mappings
     * @param mappings
     */
    public void setMappings(final List<WorkspaceMapping> mappings) {
        this.mappings = mappings;
    }
}
