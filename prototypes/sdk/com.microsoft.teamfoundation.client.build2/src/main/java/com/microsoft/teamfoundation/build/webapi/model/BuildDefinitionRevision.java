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
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionRevision {

    private IdentityRef changedBy;
    private Date changedDate;
    private AuditAction changeType;
    private String comment;
    private String name;
    private int revision;

    public IdentityRef getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(final IdentityRef changedBy) {
        this.changedBy = changedBy;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

    public AuditAction getChangeType() {
        return changeType;
    }

    public void setChangeType(final AuditAction changeType) {
        this.changeType = changeType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }
}
