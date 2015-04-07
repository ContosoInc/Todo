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


public class WorkspaceMapping {

    private String definitionUri;
    private int depth;
    private String localItem;
    private WorkspaceMappingType mappingType;
    private String serverItem;
    private int workspaceId;

    public String getDefinitionUri() {
        return definitionUri;
    }

    public void setDefinitionUri(final String definitionUri) {
        this.definitionUri = definitionUri;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(final int depth) {
        this.depth = depth;
    }

    public String getLocalItem() {
        return localItem;
    }

    public void setLocalItem(final String localItem) {
        this.localItem = localItem;
    }

    public WorkspaceMappingType getMappingType() {
        return mappingType;
    }

    public void setMappingType(final WorkspaceMappingType mappingType) {
        this.mappingType = mappingType;
    }

    public String getServerItem() {
        return serverItem;
    }

    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }

    public int getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(final int workspaceId) {
        this.workspaceId = workspaceId;
    }
}
