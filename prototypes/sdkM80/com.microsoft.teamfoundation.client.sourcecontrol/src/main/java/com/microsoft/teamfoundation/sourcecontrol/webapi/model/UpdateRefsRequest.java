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

public class UpdateRefsRequest {

    private List<GitRefUpdate> refUpdateRequests;
    private GitRefUpdateMode updateMode;

    /**
     * Getter for RefUpdateRequests
     * @return List<GitRefUpdate>
     */
    public List<GitRefUpdate> getRefUpdateRequests() {
        return refUpdateRequests;
    }

    /**
     * Setter for RefUpdateRequests
     * @param refUpdateRequests
     */
    public void setRefUpdateRequests(final List<GitRefUpdate> refUpdateRequests) {
        this.refUpdateRequests = refUpdateRequests;
    }

    /**
     * Getter for UpdateMode
     * @return GitRefUpdateMode
     */
    public GitRefUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Setter for UpdateMode
     * @param updateMode
     */
    public void setUpdateMode(final GitRefUpdateMode updateMode) {
        this.updateMode = updateMode;
    }
}
