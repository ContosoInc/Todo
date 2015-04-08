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

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRefUpdate;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRefUpdateMode;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class UpdateRefsRequest {

    private List<GitRefUpdate> refUpdateRequests;
    private GitRefUpdateMode updateMode;

    public List<GitRefUpdate> getRefUpdateRequests() {
        return refUpdateRequests;
    }

    public void setRefUpdateRequests(final List<GitRefUpdate> refUpdateRequests) {
        this.refUpdateRequests = refUpdateRequests;
    }

    public GitRefUpdateMode getUpdateMode() {
        return updateMode;
    }

    public void setUpdateMode(final GitRefUpdateMode updateMode) {
        this.updateMode = updateMode;
    }
}
