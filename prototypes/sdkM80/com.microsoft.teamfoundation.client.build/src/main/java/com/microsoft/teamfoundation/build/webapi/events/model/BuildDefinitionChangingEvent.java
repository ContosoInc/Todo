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

public class BuildDefinitionChangingEvent {

    private AuditAction changeType;
    private BuildDefinition newDefinition;
    private BuildDefinition originalDefinition;

    /**
     * Getter for ChangeType
     * @return AuditAction
     */
    public AuditAction getChangeType() {
        return changeType;
    }

    /**
     * Setter for ChangeType
     * @param changeType
     */
    public void setChangeType(final AuditAction changeType) {
        this.changeType = changeType;
    }

    /**
     * Getter for NewDefinition
     * @return BuildDefinition
     */
    public BuildDefinition getNewDefinition() {
        return newDefinition;
    }

    /**
     * Setter for NewDefinition
     * @param newDefinition
     */
    public void setNewDefinition(final BuildDefinition newDefinition) {
        this.newDefinition = newDefinition;
    }

    /**
     * Getter for OriginalDefinition
     * @return BuildDefinition
     */
    public BuildDefinition getOriginalDefinition() {
        return originalDefinition;
    }

    /**
     * Setter for OriginalDefinition
     * @param originalDefinition
     */
    public void setOriginalDefinition(final BuildDefinition originalDefinition) {
        this.originalDefinition = originalDefinition;
    }
}
