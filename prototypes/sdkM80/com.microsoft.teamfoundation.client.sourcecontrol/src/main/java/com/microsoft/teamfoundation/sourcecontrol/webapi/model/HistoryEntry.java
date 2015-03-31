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

public class HistoryEntry<T> {

    private ChangeList<T> changeList;
    private VersionControlChangeType itemChangeType;
    private String serverItem;

    /**
     * Getter for ChangeList
     * @return ChangeList<T>
     */
    public ChangeList<T> getChangeList() {
        return changeList;
    }

    /**
     * Setter for ChangeList
     * @param changeList
     */
    public void setChangeList(final ChangeList<T> changeList) {
        this.changeList = changeList;
    }

    /**
     * Getter for ItemChangeType
     * @return VersionControlChangeType
     */
    public VersionControlChangeType getItemChangeType() {
        return itemChangeType;
    }

    /**
     * Setter for ItemChangeType
     * @param itemChangeType
     */
    public void setItemChangeType(final VersionControlChangeType itemChangeType) {
        this.itemChangeType = itemChangeType;
    }

    /**
     * Getter for ServerItem
     * @return String
     */
    public String getServerItem() {
        return serverItem;
    }

    /**
     * Setter for ServerItem
     * @param serverItem
     */
    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }
}
