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

public class TfvcMergeSource {

    private boolean isRename;
    private String serverItem;
    private int versionFrom;
    private int versionTo;

    /**
     * Getter for IsRename
     * @return boolean
     */
    public boolean getIsRename() {
        return isRename;
    }

    /**
     * Setter for IsRename
     * @param isRename
     */
    public void setIsRename(final boolean isRename) {
        this.isRename = isRename;
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

    /**
     * Getter for VersionFrom
     * @return int
     */
    public int getVersionFrom() {
        return versionFrom;
    }

    /**
     * Setter for VersionFrom
     * @param versionFrom
     */
    public void setVersionFrom(final int versionFrom) {
        this.versionFrom = versionFrom;
    }

    /**
     * Getter for VersionTo
     * @return int
     */
    public int getVersionTo() {
        return versionTo;
    }

    /**
     * Setter for VersionTo
     * @param versionTo
     */
    public void setVersionTo(final int versionTo) {
        this.versionTo = versionTo;
    }
}
