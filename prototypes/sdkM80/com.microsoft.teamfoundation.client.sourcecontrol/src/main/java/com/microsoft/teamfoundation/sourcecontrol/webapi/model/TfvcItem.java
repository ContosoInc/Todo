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

    /**
     * Getter for ChangeDate
     * @return Date
     */
    public Date getChangeDate() {
        return changeDate;
    }

    /**
     * Setter for ChangeDate
     * @param changeDate
     */
    public void setChangeDate(final Date changeDate) {
        this.changeDate = changeDate;
    }

    /**
     * Getter for ChangesetVersion
     * @return int
     */
    public int getChangesetVersion() {
        return changesetVersion;
    }

    /**
     * Setter for ChangesetVersion
     * @param changesetVersion
     */
    public void setChangesetVersion(final int changesetVersion) {
        this.changesetVersion = changesetVersion;
    }

    /**
     * Getter for DeletionId
     * @return int
     */
    public int getDeletionId() {
        return deletionId;
    }

    /**
     * Setter for DeletionId
     * @param deletionId
     */
    public void setDeletionId(final int deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * Getter for Encoding
     * @return int
     */
    public int getEncoding() {
        return encoding;
    }

    /**
     * Setter for Encoding
     * @param encoding
     */
    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    /**
     * Getter for FileId
     * @return int
     */
    public int getFileId() {
        return fileId;
    }

    /**
     * Setter for FileId
     * @param fileId
     */
    public void setFileId(final int fileId) {
        this.fileId = fileId;
    }

    /**
     * Getter for Id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * Getter for IsBranch
     * @return boolean
     */
    public boolean getIsBranch() {
        return isBranch;
    }

    /**
     * Setter for IsBranch
     * @param isBranch
     */
    public void setIsBranch(final boolean isBranch) {
        this.isBranch = isBranch;
    }

    /**
     * Getter for IsPendingChange
     * @return boolean
     */
    public boolean getIsPendingChange() {
        return isPendingChange;
    }

    /**
     * Setter for IsPendingChange
     * @param isPendingChange
     */
    public void setIsPendingChange(final boolean isPendingChange) {
        this.isPendingChange = isPendingChange;
    }
}
