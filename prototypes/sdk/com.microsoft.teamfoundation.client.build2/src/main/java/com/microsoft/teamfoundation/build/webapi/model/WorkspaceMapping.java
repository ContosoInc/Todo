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

public class WorkspaceMapping {

    private int depth;
    private String localItem;
    private WorkspaceMappingType mappingType;
    private String serverItem;

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
}
