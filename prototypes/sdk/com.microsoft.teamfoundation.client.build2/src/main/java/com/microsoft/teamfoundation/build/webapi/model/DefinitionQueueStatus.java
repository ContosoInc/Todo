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
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DefinitionQueueStatus {

    ENABLED(0),
    PAUSED(1),
    DISABLED(2),
    ;
    
    private int value;

    private DefinitionQueueStatus(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ENABLED")) { //$NON-NLS-1$
            return "enabled"; //$NON-NLS-1$
        }

        if (name.equals("PAUSED")) { //$NON-NLS-1$
            return "paused"; //$NON-NLS-1$
        }

        if (name.equals("DISABLED")) { //$NON-NLS-1$
            return "disabled"; //$NON-NLS-1$
        }

        return null;
    }
}
