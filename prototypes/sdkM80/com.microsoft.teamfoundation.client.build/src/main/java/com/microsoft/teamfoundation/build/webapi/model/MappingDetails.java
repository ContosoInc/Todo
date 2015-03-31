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

public class MappingDetails {

    private String mappingType;
    private String serverPath;

    /**
     * Getter for MappingType
     * @return String
     */
    public String getMappingType() {
        return mappingType;
    }

    /**
     * Setter for MappingType
     * @param mappingType
     */
    public void setMappingType(final String mappingType) {
        this.mappingType = mappingType;
    }

    /**
     * Getter for ServerPath
     * @return String
     */
    public String getServerPath() {
        return serverPath;
    }

    /**
     * Setter for ServerPath
     * @param serverPath
     */
    public void setServerPath(final String serverPath) {
        this.serverPath = serverPath;
    }
}
