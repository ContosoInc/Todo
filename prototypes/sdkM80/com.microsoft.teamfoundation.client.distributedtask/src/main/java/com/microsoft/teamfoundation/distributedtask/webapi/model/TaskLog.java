/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public class TaskLog
    extends TaskLogReference {

    private Date createdOn;
    private URI indexLocation;
    private Date lastChangedOn;
    private long lineCount;
    private String path;

    /**
     * Getter for CreatedOn
     * @return Date
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn
     * @param createdOn
     */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for IndexLocation
     * @return URI
     */
    public URI getIndexLocation() {
        return indexLocation;
    }

    /**
     * Setter for IndexLocation
     * @param indexLocation
     */
    public void setIndexLocation(final URI indexLocation) {
        this.indexLocation = indexLocation;
    }

    /**
     * Getter for LastChangedOn
     * @return Date
     */
    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    /**
     * Setter for LastChangedOn
     * @param lastChangedOn
     */
    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for LineCount
     * @return long
     */
    public long getLineCount() {
        return lineCount;
    }

    /**
     * Setter for LineCount
     * @param lineCount
     */
    public void setLineCount(final long lineCount) {
        this.lineCount = lineCount;
    }

    /**
     * Getter for Path
     * @return String
     */
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path
     * @param path
     */
    public void setPath(final String path) {
        this.path = path;
    }
}
