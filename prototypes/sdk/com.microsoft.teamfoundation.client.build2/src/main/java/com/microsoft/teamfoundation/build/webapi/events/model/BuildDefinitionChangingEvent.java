/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.events.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionChangingEvent {

    private AuditAction changeType;
    private BuildDefinition newDefinition;
    private BuildDefinition originalDefinition;

    public AuditAction getChangeType() {
        return changeType;
    }

    public void setChangeType(final AuditAction changeType) {
        this.changeType = changeType;
    }

    public BuildDefinition getNewDefinition() {
        return newDefinition;
    }

    public void setNewDefinition(final BuildDefinition newDefinition) {
        this.newDefinition = newDefinition;
    }

    public BuildDefinition getOriginalDefinition() {
        return originalDefinition;
    }

    public void setOriginalDefinition(final BuildDefinition originalDefinition) {
        this.originalDefinition = originalDefinition;
    }
}
