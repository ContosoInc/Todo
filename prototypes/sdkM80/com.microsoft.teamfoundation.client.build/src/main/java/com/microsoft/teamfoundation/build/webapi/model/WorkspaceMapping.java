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

public class WorkspaceMapping {

    private int depth;
    private String localItem;
    private WorkspaceMappingType mappingType;
    private String serverItem;

    /**
     * Getter for Depth
     * @return int
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Setter for Depth
     * @param depth
     */
    public void setDepth(final int depth) {
        this.depth = depth;
    }

    /**
     * Getter for LocalItem
     * @return String
     */
    public String getLocalItem() {
        return localItem;
    }

    /**
     * Setter for LocalItem
     * @param localItem
     */
    public void setLocalItem(final String localItem) {
        this.localItem = localItem;
    }

    /**
     * Getter for MappingType
     * @return WorkspaceMappingType
     */
    public WorkspaceMappingType getMappingType() {
        return mappingType;
    }

    /**
     * Setter for MappingType
     * @param mappingType
     */
    public void setMappingType(final WorkspaceMappingType mappingType) {
        this.mappingType = mappingType;
    }

    /**
     * Getter for ServerItem
     * @return String
     */
    public String getServerItem() {
        return serverItem;
    }

    /**
     * Setter for ServerItem
     * @param serverItem
     */
    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }
}
