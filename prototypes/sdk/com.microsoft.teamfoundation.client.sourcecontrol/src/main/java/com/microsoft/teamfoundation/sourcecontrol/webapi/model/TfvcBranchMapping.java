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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcBranchMapping {

    private String depth;
    private String serverItem;
    private String type;

    public String getDepth() {
        return depth;
    }

    public void setDepth(final String depth) {
        this.depth = depth;
    }

    public String getServerItem() {
        return serverItem;
    }

    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
