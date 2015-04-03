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

public enum GitVersionOptions {

    NONE(0),
    PREVIOUS_CHANGE(1),
    FIRST_PARENT(2),
    ;
    
    private int value;

    private GitVersionOptions(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("PREVIOUS_CHANGE")) { //$NON-NLS-1$
            return "previousChange"; //$NON-NLS-1$
        }

        if (name.equals("FIRST_PARENT")) { //$NON-NLS-1$
            return "firstParent"; //$NON-NLS-1$
        }

        return null;
    }
}
