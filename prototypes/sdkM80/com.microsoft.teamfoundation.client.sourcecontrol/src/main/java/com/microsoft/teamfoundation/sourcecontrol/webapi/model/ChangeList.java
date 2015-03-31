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

public class ChangeList<T> {

    private boolean allChangesIncluded;
    private HashMap<VersionControlChangeType,Integer> changeCounts;
    private List<Change<T>> changes;
    private String comment;
    private boolean commentTruncated;
    private Date creationDate;
    private CheckinNote[] notes;
    private String owner;
    private String ownerDisplayName;
    private UUID ownerId;
    private Date sortDate;
    private String version;

    /**
     * Getter for AllChangesIncluded
     * @return boolean
     */
    public boolean getAllChangesIncluded() {
        return allChangesIncluded;
    }

    /**
     * Setter for AllChangesIncluded
     * @param allChangesIncluded
     */
    public void setAllChangesIncluded(final boolean allChangesIncluded) {
        this.allChangesIncluded = allChangesIncluded;
    }

    /**
     * Getter for ChangeCounts
     * @return HashMap<VersionControlChangeType,Integer>
     */
    public HashMap<VersionControlChangeType,Integer> getChangeCounts() {
        return changeCounts;
    }

    /**
     * Setter for ChangeCounts
     * @param changeCounts
     */
    public void setChangeCounts(final HashMap<VersionControlChangeType,Integer> changeCounts) {
        this.changeCounts = changeCounts;
    }

    /**
     * Getter for Changes
     * @return List<Change<T>>
     */
    public List<Change<T>> getChanges() {
        return changes;
    }

    /**
     * Setter for Changes
     * @param changes
     */
    public void setChanges(final List<Change<T>> changes) {
        this.changes = changes;
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
     * Getter for CommentTruncated
     * @return boolean
     */
    public boolean getCommentTruncated() {
        return commentTruncated;
    }

    /**
     * Setter for CommentTruncated
     * @param commentTruncated
     */
    public void setCommentTruncated(final boolean commentTruncated) {
        this.commentTruncated = commentTruncated;
    }

    /**
     * Getter for CreationDate
     * @return Date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Setter for CreationDate
     * @param creationDate
     */
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Getter for Notes
     * @return CheckinNote[]
     */
    public CheckinNote[] getNotes() {
        return notes;
    }

    /**
     * Setter for Notes
     * @param notes
     */
    public void setNotes(final CheckinNote[] notes) {
        this.notes = notes;
    }

    /**
     * Getter for Owner
     * @return String
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for Owner
     * @param owner
     */
    public void setOwner(final String owner) {
        this.owner = owner;
    }

    /**
     * Getter for OwnerDisplayName
     * @return String
     */
    public String getOwnerDisplayName() {
        return ownerDisplayName;
    }

    /**
     * Setter for OwnerDisplayName
     * @param ownerDisplayName
     */
    public void setOwnerDisplayName(final String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
    }

    /**
     * Getter for OwnerId
     * @return UUID
     */
    public UUID getOwnerId() {
        return ownerId;
    }

    /**
     * Setter for OwnerId
     * @param ownerId
     */
    public void setOwnerId(final UUID ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Getter for SortDate
     * @return Date
     */
    public Date getSortDate() {
        return sortDate;
    }

    /**
     * Setter for SortDate
     * @param sortDate
     */
    public void setSortDate(final Date sortDate) {
        this.sortDate = sortDate;
    }

    /**
     * Getter for Version
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}
