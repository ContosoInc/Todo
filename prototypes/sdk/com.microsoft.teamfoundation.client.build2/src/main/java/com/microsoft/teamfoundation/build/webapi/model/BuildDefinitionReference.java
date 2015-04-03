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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.AgentPoolQueue;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionQuality;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionReference;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildDefinitionReference
    extends DefinitionReference {

    private IdentityRef authoredBy;
    private DefinitionReference draftOf;
    private DefinitionQuality quality;
    private AgentPoolQueue queue;

    public IdentityRef getAuthoredBy() {
        return authoredBy;
    }

    public void setAuthoredBy(final IdentityRef authoredBy) {
        this.authoredBy = authoredBy;
    }

    public DefinitionReference getDraftOf() {
        return draftOf;
    }

    public void setDraftOf(final DefinitionReference draftOf) {
        this.draftOf = draftOf;
    }

    public DefinitionQuality getQuality() {
        return quality;
    }

    public void setQuality(final DefinitionQuality quality) {
        this.quality = quality;
    }

    public AgentPoolQueue getQueue() {
        return queue;
    }

    public void setQueue(final AgentPoolQueue queue) {
        this.queue = queue;
    }
}
