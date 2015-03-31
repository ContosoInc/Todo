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

public class TaskAgentMessage {

    private String body;
    private long messageId;
    private String messageType;

    /**
     * Getter for Body
     * @return String
     */
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body
     * @param body
     */
    public void setBody(final String body) {
        this.body = body;
    }

    /**
     * Getter for MessageId
     * @return long
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Setter for MessageId
     * @param messageId
     */
    public void setMessageId(final long messageId) {
        this.messageId = messageId;
    }

    /**
     * Getter for MessageType
     * @return String
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Setter for MessageType
     * @param messageType
     */
    public void setMessageType(final String messageType) {
        this.messageType = messageType;
    }
}
