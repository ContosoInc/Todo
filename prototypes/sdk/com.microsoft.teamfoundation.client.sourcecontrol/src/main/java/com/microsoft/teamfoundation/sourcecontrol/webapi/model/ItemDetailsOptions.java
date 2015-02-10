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
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemDetailsOptions {

    private boolean includeContentMetadata;
    private VersionControlRecursionType recursionLevel;

    public boolean getIncludeContentMetadata() {
        return includeContentMetadata;
    }

    public void setIncludeContentMetadata(final boolean includeContentMetadata) {
        this.includeContentMetadata = includeContentMetadata;
    }

    public VersionControlRecursionType getRecursionLevel() {
        return recursionLevel;
    }

    public void setRecursionLevel(final VersionControlRecursionType recursionLevel) {
        this.recursionLevel = recursionLevel;
    }
}
