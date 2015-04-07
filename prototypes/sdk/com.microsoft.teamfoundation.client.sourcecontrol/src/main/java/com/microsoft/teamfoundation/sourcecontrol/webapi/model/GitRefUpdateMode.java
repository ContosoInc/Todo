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


public enum GitRefUpdateMode {

    BEST_EFFORT(0),
    ALL_OR_NONE(1),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private GitRefUpdateMode(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BEST_EFFORT")) { //$NON-NLS-1$
            return "bestEffort"; //$NON-NLS-1$
        }

        if (name.equals("ALL_OR_NONE")) { //$NON-NLS-1$
            return "allOrNone"; //$NON-NLS-1$
        }

        return null;
    }
}
