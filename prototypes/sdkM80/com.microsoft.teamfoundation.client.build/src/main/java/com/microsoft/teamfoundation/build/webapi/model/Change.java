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

public class Change {

    private IdentityRef author;
    private URI displayUri;
    private String id;
    private URI location;
    private String message;
    private boolean messageTruncated;
    private Date timestamp;
    private String type;

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
     * Getter for DisplayUri
     * @return URI
     */
    public URI getDisplayUri() {
        return displayUri;
    }

    /**
     * Setter for DisplayUri
     * @param displayUri
     */
    public void setDisplayUri(final URI displayUri) {
        this.displayUri = displayUri;
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
     * Getter for Location
     * @return URI
     */
    public URI getLocation() {
        return location;
    }

    /**
     * Setter for Location
     * @param location
     */
    public void setLocation(final URI location) {
        this.location = location;
    }

    /**
     * Getter for Message
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message
     * @param message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Getter for MessageTruncated
     * @return boolean
     */
    public boolean getMessageTruncated() {
        return messageTruncated;
    }

    /**
     * Setter for MessageTruncated
     * @param messageTruncated
     */
    public void setMessageTruncated(final boolean messageTruncated) {
        this.messageTruncated = messageTruncated;
    }

    /**
     * Getter for Timestamp
     * @return Date
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp
     * @param timestamp
     */
    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for Type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final String type) {
        this.type = type;
    }
}
