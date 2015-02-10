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
import com.fasterxml.jackson.annotation.JsonProperty;

public class DefinitionReference
    extends ShallowReference {

    private DefinitionType definitionType;
    private QueueReference queue;
    private DefinitionQueueStatus queueStatus;
    private int revision;
    private String uri;

    public DefinitionType getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(final DefinitionType definitionType) {
        this.definitionType = definitionType;
    }

    public QueueReference getQueue() {
        return queue;
    }

    public void setQueue(final QueueReference queue) {
        this.queue = queue;
    }

    public DefinitionQueueStatus getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(final DefinitionQueueStatus queueStatus) {
        this.queueStatus = queueStatus;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }
}
