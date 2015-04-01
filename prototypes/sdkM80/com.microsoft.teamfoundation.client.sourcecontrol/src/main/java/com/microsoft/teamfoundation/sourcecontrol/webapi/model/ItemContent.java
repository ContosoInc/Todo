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

public class ItemContent {

    private String content;
    private ItemContentType contentType;

    /**
     * Getter for Content
     * @return String
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content
     * @param content
     */
    public void setContent(final String content) {
        this.content = content;
    }

    /**
     * Getter for ContentType
     * @return ItemContentType
     */
    public ItemContentType getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType
     * @param contentType
     */
    public void setContentType(final ItemContentType contentType) {
        this.contentType = contentType;
    }
}