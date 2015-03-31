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

public class TfvcShelvesetRef {

    private String comment;
    private boolean commentTruncated;
    private Date createdDate;
    private String id;
    private ReferenceLinks links;
    private String name;
    private IdentityRef owner;
    private String url;

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
     * Getter for Id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
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
     * Getter for Owner
     * @return IdentityRef
     */
    public IdentityRef getOwner() {
        return owner;
    }

    /**
     * Setter for Owner
     * @param owner
     */
    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
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
