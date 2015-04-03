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

import com.microsoft.teamfoundation.build.webapi.model.WorkspaceMapping;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class WorkspaceTemplate {

    private String definitionUri;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private List<WorkspaceMapping> mappings;
    private int workspaceId;

    public String getDefinitionUri() {
        return definitionUri;
    }

    public void setDefinitionUri(final String definitionUri) {
        this.definitionUri = definitionUri;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<WorkspaceMapping> getMappings() {
        return mappings;
    }

    public void setMappings(final List<WorkspaceMapping> mappings) {
        this.mappings = mappings;
    }

    public int getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(final int workspaceId) {
        this.workspaceId = workspaceId;
    }
}
