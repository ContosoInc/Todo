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

public class ItemDetailsOptions {

    private boolean includeContentMetadata;
    private VersionControlRecursionType recursionLevel;

    /**
     * Getter for IncludeContentMetadata
     * @return boolean
     */
    public boolean getIncludeContentMetadata() {
        return includeContentMetadata;
    }

    /**
     * Setter for IncludeContentMetadata
     * @param includeContentMetadata
     */
    public void setIncludeContentMetadata(final boolean includeContentMetadata) {
        this.includeContentMetadata = includeContentMetadata;
    }

    /**
     * Getter for RecursionLevel
     * @return VersionControlRecursionType
     */
    public VersionControlRecursionType getRecursionLevel() {
        return recursionLevel;
    }

    /**
     * Setter for RecursionLevel
     * @param recursionLevel
     */
    public void setRecursionLevel(final VersionControlRecursionType recursionLevel) {
        this.recursionLevel = recursionLevel;
    }
}
