/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.build.webapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public enum BuildReason {

    NONE(0),
    MANUAL(1),
    INDIVIDUAL_C_I(2),
    BATCHED_C_I(4),
    SCHEDULE(8),
    USER_CREATED(32),
    VALIDATE_SHELVESET(64),
    CHECK_IN_SHELVESET(128),
    TRIGGERED(175),
    ALL(239),
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
