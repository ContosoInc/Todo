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


public enum DefinitionTriggerType {

    NONE(1),
    CONTINUOUS_INTEGRATION(2),
    BATCHED_CONTINUOUS_INTEGRATION(4),
    SCHEDULE(8),
    GATED_CHECK_IN(16),
    BATCHED_GATED_CHECK_IN(32),
    ALL(63),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private DefinitionTriggerType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("CONTINUOUS_INTEGRATION")) { //$NON-NLS-1$
            return "continuousIntegration"; //$NON-NLS-1$
        }

        if (name.equals("BATCHED_CONTINUOUS_INTEGRATION")) { //$NON-NLS-1$
            return "batchedContinuousIntegration"; //$NON-NLS-1$
        }

        if (name.equals("SCHEDULE")) { //$NON-NLS-1$
            return "schedule"; //$NON-NLS-1$
        }

        if (name.equals("GATED_CHECK_IN")) { //$NON-NLS-1$
            return "gatedCheckIn"; //$NON-NLS-1$
        }

        if (name.equals("BATCHED_GATED_CHECK_IN")) { //$NON-NLS-1$
            return "batchedGatedCheckIn"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
