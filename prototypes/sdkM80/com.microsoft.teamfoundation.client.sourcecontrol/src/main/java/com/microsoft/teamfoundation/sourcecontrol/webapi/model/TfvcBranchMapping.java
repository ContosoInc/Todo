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

public class TfvcBranchMapping {

    private String depth;
    private String serverItem;
    private String type;

    /**
     * Getter for Depth
     * @return String
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Setter for Depth
     * @param depth
     */
    public void setDepth(final String depth) {
        this.depth = depth;
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

    /**
     * Getter for Type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final String type) {
        this.type = type;
    }
}
