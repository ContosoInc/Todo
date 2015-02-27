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

public class TfvcChangesetsRequestData {

    private Integer[] changesetIds;
    private int commentLength;
    private boolean includeLinks;

    public Integer[] getChangesetIds() {
        return changesetIds;
    }

    public void setChangesetIds(final Integer[] changesetIds) {
        this.changesetIds = changesetIds;
    }

    public int getCommentLength() {
        return commentLength;
    }

    public void setCommentLength(final int commentLength) {
        this.commentLength = commentLength;
    }

    public boolean getIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }
}
