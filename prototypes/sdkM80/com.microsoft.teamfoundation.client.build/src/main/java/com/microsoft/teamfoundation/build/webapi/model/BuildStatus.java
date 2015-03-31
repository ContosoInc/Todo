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

public enum BuildStatus {

    NONE(0),
    IN_PROGRESS(1),
    COMPLETED(2),
    CANCELLING(4),
    POSTPONED(8),
    NOT_STARTED(32),
    ALL(47),
    ;
    
    private int value;

    private BuildStatus(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type BuildStatus
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("IN_PROGRESS")) { //$NON-NLS-1$
            return "inProgress"; //$NON-NLS-1$
        }

        if (name.equals("COMPLETED")) { //$NON-NLS-1$
            return "completed"; //$NON-NLS-1$
        }

        if (name.equals("CANCELLING")) { //$NON-NLS-1$
            return "cancelling"; //$NON-NLS-1$
        }

        if (name.equals("POSTPONED")) { //$NON-NLS-1$
            return "postponed"; //$NON-NLS-1$
        }

        if (name.equals("NOT_STARTED")) { //$NON-NLS-1$
            return "notStarted"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
