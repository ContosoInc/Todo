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
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskOrchestrationItem {

    private TaskOrchestrationItemType itemType;

    public TaskOrchestrationItemType getItemType() {
        return itemType;
    }

    public void setItemType(final TaskOrchestrationItemType itemType) {
        this.itemType = itemType;
    }
}