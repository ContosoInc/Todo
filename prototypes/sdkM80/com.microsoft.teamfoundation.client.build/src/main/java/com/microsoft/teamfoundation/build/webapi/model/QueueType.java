/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;

public enum QueueType {

    BUILD_CONTROLLER(1),
    AGENT_POOL(2),
    ;
    
    private int value;

    private QueueType(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type QueueType
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BUILD_CONTROLLER")) { //$NON-NLS-1$
            return "buildController"; //$NON-NLS-1$
        }

        if (name.equals("AGENT_POOL")) { //$NON-NLS-1$
            return "agentPool"; //$NON-NLS-1$
        }

        return null;
    }
}
