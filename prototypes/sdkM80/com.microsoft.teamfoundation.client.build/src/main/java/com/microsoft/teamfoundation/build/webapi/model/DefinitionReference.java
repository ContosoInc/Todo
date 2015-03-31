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

public class DefinitionReference
    extends ShallowReference {

    private DefinitionType definitionType;
    private QueueReference queue;
    private DefinitionQueueStatus queueStatus;
    private int revision;
    private URI uri;

    /**
     * Getter for DefinitionType
     * @return DefinitionType
     */
    public DefinitionType getDefinitionType() {
        return definitionType;
    }

    /**
     * Setter for DefinitionType
     * @param definitionType
     */
    public void setDefinitionType(final DefinitionType definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * Getter for Queue
     * @return QueueReference
     */
    public QueueReference getQueue() {
        return queue;
    }

    /**
     * Setter for Queue
     * @param queue
     */
    public void setQueue(final QueueReference queue) {
        this.queue = queue;
    }

    /**
     * Getter for QueueStatus
     * @return DefinitionQueueStatus
     */
    public DefinitionQueueStatus getQueueStatus() {
        return queueStatus;
    }

    /**
     * Setter for QueueStatus
     * @param queueStatus
     */
    public void setQueueStatus(final DefinitionQueueStatus queueStatus) {
        this.queueStatus = queueStatus;
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

    /**
     * Getter for Uri
     * @return URI
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Setter for Uri
     * @param uri
     */
    public void setUri(final URI uri) {
        this.uri = uri;
    }
}
