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

public enum TaskOrchestrationItemType {

    CONTAINER(0),
    JOB(1),
    ;
    
    private int value;

    private TaskOrchestrationItemType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CONTAINER")) { //$NON-NLS-1$
            return "container"; //$NON-NLS-1$
        }

        if (name.equals("JOB")) { //$NON-NLS-1$
            return "job"; //$NON-NLS-1$
        }

        return null;
    }
}
