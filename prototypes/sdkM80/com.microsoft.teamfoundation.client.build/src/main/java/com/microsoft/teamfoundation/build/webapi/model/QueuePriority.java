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

public enum QueuePriority {

    LOW(5),
    BELOW_NORMAL(4),
    NORMAL(3),
    ABOVE_NORMAL(2),
    HIGH(1),
    ;
    
    private int value;

    private QueuePriority(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type QueuePriority
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("LOW")) { //$NON-NLS-1$
            return "low"; //$NON-NLS-1$
        }

        if (name.equals("BELOW_NORMAL")) { //$NON-NLS-1$
            return "belowNormal"; //$NON-NLS-1$
        }

        if (name.equals("NORMAL")) { //$NON-NLS-1$
            return "normal"; //$NON-NLS-1$
        }

        if (name.equals("ABOVE_NORMAL")) { //$NON-NLS-1$
            return "aboveNormal"; //$NON-NLS-1$
        }

        if (name.equals("HIGH")) { //$NON-NLS-1$
            return "high"; //$NON-NLS-1$
        }

        return null;
    }
}
