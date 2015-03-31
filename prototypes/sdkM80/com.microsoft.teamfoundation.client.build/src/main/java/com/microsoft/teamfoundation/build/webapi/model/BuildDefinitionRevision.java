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

public class BuildDefinitionRevision {

    private IdentityRef changedBy;
    private Date changedDate;
    private AuditAction changeType;
    private String comment;
    private String name;
    private int revision;

    /**
     * Getter for ChangedBy
     * @return IdentityRef
     */
    public IdentityRef getChangedBy() {
        return changedBy;
    }

    /**
     * Setter for ChangedBy
     * @param changedBy
     */
    public void setChangedBy(final IdentityRef changedBy) {
        this.changedBy = changedBy;
    }

    /**
     * Getter for ChangedDate
     * @return Date
     */
    public Date getChangedDate() {
        return changedDate;
    }

    /**
     * Setter for ChangedDate
     * @param changedDate
     */
    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

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
     * Getter for Comment
     * @return String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment
     * @param comment
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Revision
     * @return int
     */
    public int getRevision() {
        return revision;
    }

    /**
     * Setter for Revision
     * @param revision
     */
    public void setRevision(final int revision) {
        this.revision = revision;
    }
}
