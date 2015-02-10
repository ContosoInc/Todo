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

public enum BuildReason {

    NONE(0),
    MANUAL(1),
    INDIVIDUAL_C_I(2),
    BATCHED_C_I(4),
    SCHEDULE(8),
    SCHEDULE_FORCED(16),
    USER_CREATED(32),
    VALIDATE_SHELVESET(64),
    CHECK_IN_SHELVESET(128),
    TRIGGERED(191),
    ALL(255),
    ;
    
    private int value;

    private BuildReason(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("MANUAL")) { //$NON-NLS-1$
            return "manual"; //$NON-NLS-1$
        }

        if (name.equals("INDIVIDUAL_C_I")) { //$NON-NLS-1$
            return "individualCI"; //$NON-NLS-1$
        }

        if (name.equals("BATCHED_C_I")) { //$NON-NLS-1$
            return "batchedCI"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULE")) { //$NON-NLS-1$
            return "schedule"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULE_FORCED")) { //$NON-NLS-1$
            return "scheduleForced"; //$NON-NLS-1$
        }

        if (name.equals("USER_CREATED")) { //$NON-NLS-1$
            return "userCreated"; //$NON-NLS-1$
        }

        if (name.equals("VALIDATE_SHELVESET")) { //$NON-NLS-1$
            return "validateShelveset"; //$NON-NLS-1$
        }

        if (name.equals("CHECK_IN_SHELVESET")) { //$NON-NLS-1$
            return "checkInShelveset"; //$NON-NLS-1$
        }

        if (name.equals("TRIGGERED")) { //$NON-NLS-1$
            return "triggered"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
