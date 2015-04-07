/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;


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
