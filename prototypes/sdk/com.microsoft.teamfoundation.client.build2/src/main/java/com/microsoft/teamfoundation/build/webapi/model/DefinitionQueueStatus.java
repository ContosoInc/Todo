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
