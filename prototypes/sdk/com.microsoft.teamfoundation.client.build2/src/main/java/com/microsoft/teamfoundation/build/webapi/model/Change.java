/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.build.webapi.model;

import java.net.URI;
import java.util.Date;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;

public class Change {

    private IdentityRef author;
    private URI displayUri;
    private String id;
    private URI location;
    private String message;
    private boolean messageTruncated;
    private Date timestamp;
    private String type;

    public IdentityRef getAuthor() {
        return author;
    }

    public void setAuthor(final IdentityRef author) {
        this.author = author;
    }

    public URI getDisplayUri() {
        return displayUri;
    }

    public void setDisplayUri(final URI displayUri) {
        this.displayUri = displayUri;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(final URI location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public boolean getMessageTruncated() {
        return messageTruncated;
    }

    public void setMessageTruncated(final boolean messageTruncated) {
        this.messageTruncated = messageTruncated;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
