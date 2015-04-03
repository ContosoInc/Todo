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

package com.microsoft.teamfoundation.distributedtask.webapi.model;

import com.microsoft.teamfoundation.distributedtask.webapi.model.TaskOrchestrationItemType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TaskOrchestrationItem {

    private TaskOrchestrationItemType itemType;

    public TaskOrchestrationItemType getItemType() {
        return itemType;
    }

    public void setItemType(final TaskOrchestrationItemType itemType) {
        this.itemType = itemType;
    }
}
