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


public enum QueuePriority {

    LOW(5),
    BELOW_NORMAL(4),
    NORMAL(3),
    ABOVE_NORMAL(2),
    HIGH(1),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private QueuePriority(final int value) {
        this.value = value;
    }

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
