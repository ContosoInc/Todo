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

public class TfvcItem
    extends ItemModel {

    private Date changeDate;
    private int changesetVersion;
    private int deletionId;
    private int encoding;
    private int fileId;
    private int id;
    private boolean isBranch;
    private boolean isPendingChange;

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(final Date changeDate) {
        this.changeDate = changeDate;
    }

    @JsonProperty("version")
    public int getChangesetVersion() {
        return changesetVersion;
    }

    @JsonProperty("version")
    public void setChangesetVersion(final int changesetVersion) {
        this.changesetVersion = changesetVersion;
    }

    public int getDeletionId() {
        return deletionId;
    }

    public void setDeletionId(final int deletionId) {
        this.deletionId = deletionId;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(final int fileId) {
        this.fileId = fileId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean getIsBranch() {
        return isBranch;
    }

    public void setIsBranch(final boolean isBranch) {
        this.isBranch = isBranch;
    }

    public boolean getIsPendingChange() {
        return isPendingChange;
    }

    public void setIsPendingChange(final boolean isPendingChange) {
        this.isPendingChange = isPendingChange;
    }
}
