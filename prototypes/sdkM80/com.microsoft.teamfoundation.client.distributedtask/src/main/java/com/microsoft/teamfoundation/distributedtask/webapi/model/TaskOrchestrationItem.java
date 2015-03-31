/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public class TaskOrchestrationItem {

    private TaskOrchestrationItemType itemType;

    /**
     * Getter for ItemType
     * @return TaskOrchestrationItemType
     */
    public TaskOrchestrationItemType getItemType() {
        return itemType;
    }

    /**
     * Setter for ItemType
     * @param itemType
     */
    public void setItemType(final TaskOrchestrationItemType itemType) {
        this.itemType = itemType;
    }
}
