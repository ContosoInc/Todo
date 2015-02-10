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
import com.fasterxml.jackson.annotation.JsonProperty;

public class Change<T> {

    private VersionControlChangeType changeType;
    private T item;
    private ItemContent newContent;
    private String sourceServerItem;
    private String url;

    public VersionControlChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(final VersionControlChangeType changeType) {
        this.changeType = changeType;
    }

    public T getItem() {
        return item;
    }

    public void setItem(final T item) {
        this.item = item;
    }

    public ItemContent getNewContent() {
        return newContent;
    }

    public void setNewContent(final ItemContent newContent) {
        this.newContent = newContent;
    }

    public String getSourceServerItem() {
        return sourceServerItem;
    }

    public void setSourceServerItem(final String sourceServerItem) {
        this.sourceServerItem = sourceServerItem;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
