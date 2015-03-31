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

public class BuildOptionGroupDefinition {

    private String displayName;
    private boolean isExpanded;
    private String name;

    /**
     * Getter for DisplayName
     * @return String
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName
     * @param displayName
     */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for IsExpanded
     * @return boolean
     */
    public boolean getIsExpanded() {
        return isExpanded;
    }

    /**
     * Setter for IsExpanded
     * @param isExpanded
     */
    public void setIsExpanded(final boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
