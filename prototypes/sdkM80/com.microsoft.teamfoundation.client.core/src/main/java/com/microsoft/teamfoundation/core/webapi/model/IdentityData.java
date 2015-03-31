/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;

public class IdentityData {

    private UUID[] identityIds;

    /**
     * Getter for IdentityIds
     * @return UUID[]
     */
    public UUID[] getIdentityIds() {
        return identityIds;
    }

    /**
     * Setter for IdentityIds
     * @param identityIds
     */
    public void setIdentityIds(final UUID[] identityIds) {
        this.identityIds = identityIds;
    }
}
