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

public class Change<T> {

    private VersionControlChangeType changeType;
    private T item;
    private ItemContent newContent;
    private String sourceServerItem;
    private String url;

    /**
     * Getter for ChangeType
     * @return VersionControlChangeType
     */
    public VersionControlChangeType getChangeType() {
        return changeType;
    }

    /**
     * Setter for ChangeType
     * @param changeType
     */
    public void setChangeType(final VersionControlChangeType changeType) {
        this.changeType = changeType;
    }

    /**
     * Getter for Item
     * @return T
     */
    public T getItem() {
        return item;
    }

    /**
     * Setter for Item
     * @param item
     */
    public void setItem(final T item) {
        this.item = item;
    }

    /**
     * Getter for NewContent
     * @return ItemContent
     */
    public ItemContent getNewContent() {
        return newContent;
    }

    /**
     * Setter for NewContent
     * @param newContent
     */
    public void setNewContent(final ItemContent newContent) {
        this.newContent = newContent;
    }

    /**
     * Getter for SourceServerItem
     * @return String
     */
    public String getSourceServerItem() {
        return sourceServerItem;
    }

    /**
     * Setter for SourceServerItem
     * @param sourceServerItem
     */
    public void setSourceServerItem(final String sourceServerItem) {
        this.sourceServerItem = sourceServerItem;
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
