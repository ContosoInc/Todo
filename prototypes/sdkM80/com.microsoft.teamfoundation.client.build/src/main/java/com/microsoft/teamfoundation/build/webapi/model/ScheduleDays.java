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

public enum ScheduleDays {

    NONE(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(4),
    THURSDAY(8),
    FRIDAY(16),
    SATURDAY(32),
    SUNDAY(64),
    ALL(127),
    ;
    
    private int value;

    private ScheduleDays(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type ScheduleDays
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("MONDAY")) { //$NON-NLS-1$
            return "monday"; //$NON-NLS-1$
        }

        if (name.equals("TUESDAY")) { //$NON-NLS-1$
            return "tuesday"; //$NON-NLS-1$
        }

        if (name.equals("WEDNESDAY")) { //$NON-NLS-1$
            return "wednesday"; //$NON-NLS-1$
        }

        if (name.equals("THURSDAY")) { //$NON-NLS-1$
            return "thursday"; //$NON-NLS-1$
        }

        if (name.equals("FRIDAY")) { //$NON-NLS-1$
            return "friday"; //$NON-NLS-1$
        }

        if (name.equals("SATURDAY")) { //$NON-NLS-1$
            return "saturday"; //$NON-NLS-1$
        }

        if (name.equals("SUNDAY")) { //$NON-NLS-1$
            return "sunday"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
