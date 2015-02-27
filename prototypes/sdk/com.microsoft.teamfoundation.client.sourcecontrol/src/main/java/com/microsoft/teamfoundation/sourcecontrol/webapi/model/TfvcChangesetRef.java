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

    public IdentityRef getAuthor() {
        return author;
    }

    public void setAuthor(final IdentityRef author) {
        this.author = author;
    }

    public int getChangesetId() {
        return changesetId;
    }

    public void setChangesetId(final int changesetId) {
        this.changesetId = changesetId;
    }

    public IdentityRef getCheckedInBy() {
        return checkedInBy;
    }

    public void setCheckedInBy(final IdentityRef checkedInBy) {
        this.checkedInBy = checkedInBy;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public boolean getCommentTruncated() {
        return commentTruncated;
    }

    public void setCommentTruncated(final boolean commentTruncated) {
        this.commentTruncated = commentTruncated;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public ReferenceLinks getLinks() {
        return links;
    }

    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
