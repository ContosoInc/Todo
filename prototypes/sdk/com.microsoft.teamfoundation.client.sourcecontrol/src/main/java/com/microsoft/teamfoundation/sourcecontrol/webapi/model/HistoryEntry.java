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

public class HistoryEntry<T> {

    private ChangeList<T> changeList;
    private VersionControlChangeType itemChangeType;
    private String serverItem;

    public ChangeList<T> getChangeList() {
        return changeList;
    }

    public void setChangeList(final ChangeList<T> changeList) {
        this.changeList = changeList;
    }

    public VersionControlChangeType getItemChangeType() {
        return itemChangeType;
    }

    public void setItemChangeType(final VersionControlChangeType itemChangeType) {
        this.itemChangeType = itemChangeType;
    }

    public String getServerItem() {
        return serverItem;
    }

    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }
}
