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

    public boolean getIsRename() {
        return isRename;
    }

    public void setIsRename(final boolean isRename) {
        this.isRename = isRename;
    }

    public String getServerItem() {
        return serverItem;
    }

    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }

    public int getVersionFrom() {
        return versionFrom;
    }

    public void setVersionFrom(final int versionFrom) {
        this.versionFrom = versionFrom;
    }

    public int getVersionTo() {
        return versionTo;
    }

    public void setVersionTo(final int versionTo) {
        this.versionTo = versionTo;
    }
}
