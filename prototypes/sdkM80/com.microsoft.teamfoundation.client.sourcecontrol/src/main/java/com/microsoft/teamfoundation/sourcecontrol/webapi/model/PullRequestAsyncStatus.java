/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public enum PullRequestAsyncStatus {

    NOT_SET((byte) 0),
    QUEUED((byte) 1),
    CONFLICTS((byte) 2),
    SUCCEEDED((byte) 3),
    REJECTED_BY_POLICY((byte) 4),
    FAILURE((byte) 5),
    ;
    
    private byte value;

    private PullRequestAsyncStatus(final byte value) {
        this.value = value;
    }

    /**
     * String representation of an object of type PullRequestAsyncStatus
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NOT_SET")) { //$NON-NLS-1$
            return "notSet"; //$NON-NLS-1$
        }

        if (name.equals("QUEUED")) { //$NON-NLS-1$
            return "queued"; //$NON-NLS-1$
        }

        if (name.equals("CONFLICTS")) { //$NON-NLS-1$
            return "conflicts"; //$NON-NLS-1$
        }

        if (name.equals("SUCCEEDED")) { //$NON-NLS-1$
            return "succeeded"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED_BY_POLICY")) { //$NON-NLS-1$
            return "rejectedByPolicy"; //$NON-NLS-1$
        }

        if (name.equals("FAILURE")) { //$NON-NLS-1$
            return "failure"; //$NON-NLS-1$
        }

        return null;
    }
}
