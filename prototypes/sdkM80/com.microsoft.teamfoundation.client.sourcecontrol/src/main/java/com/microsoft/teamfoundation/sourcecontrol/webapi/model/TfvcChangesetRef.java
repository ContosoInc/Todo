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

public class TfvcChangesetRef {

    private IdentityRef author;
    private int changesetId;
    private IdentityRef checkedInBy;
    private String comment;
    private boolean commentTruncated;
    private Date createdDate;
    private ReferenceLinks links;
    private String url;

    /**
     * Getter for Author
     * @return IdentityRef
     */
    public IdentityRef getAuthor() {
        return author;
    }

    /**
     * Setter for Author
     * @param author
     */
    public void setAuthor(final IdentityRef author) {
        this.author = author;
    }

    /**
     * Getter for ChangesetId
     * @return int
     */
    public int getChangesetId() {
        return changesetId;
    }

    /**
     * Setter for ChangesetId
     * @param changesetId
     */
    public void setChangesetId(final int changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * Getter for CheckedInBy
     * @return IdentityRef
     */
    public IdentityRef getCheckedInBy() {
        return checkedInBy;
    }

    /**
     * Setter for CheckedInBy
     * @param checkedInBy
     */
    public void setCheckedInBy(final IdentityRef checkedInBy) {
        this.checkedInBy = checkedInBy;
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
     * Getter for CreatedDate
     * @return Date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter for CreatedDate
     * @param createdDate
     */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
