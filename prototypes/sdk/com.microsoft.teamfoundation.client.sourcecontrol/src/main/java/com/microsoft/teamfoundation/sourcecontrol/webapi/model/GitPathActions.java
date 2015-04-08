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

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public enum GitPathActions {

    NONE((byte) 0),
    EDIT((byte) 1),
    DELETE((byte) 2),
    ADD((byte) 3),
    RENAME((byte) 4),
    ;
    
    private byte value;

    private GitPathActions(final byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("EDIT")) { //$NON-NLS-1$
            return "edit"; //$NON-NLS-1$
        }

        if (name.equals("DELETE")) { //$NON-NLS-1$
            return "delete"; //$NON-NLS-1$
        }

        if (name.equals("ADD")) { //$NON-NLS-1$
            return "add"; //$NON-NLS-1$
        }

        if (name.equals("RENAME")) { //$NON-NLS-1$
            return "rename"; //$NON-NLS-1$
        }

        return null;
    }
}
