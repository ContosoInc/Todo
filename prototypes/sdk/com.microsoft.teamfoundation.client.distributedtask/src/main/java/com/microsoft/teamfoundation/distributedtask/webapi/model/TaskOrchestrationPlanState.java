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

package com.microsoft.teamfoundation.distributedtask.webapi.model;


public enum TaskOrchestrationPlanState {

    IN_PROGRESS(1),
    QUEUED(2),
    COMPLETED(4),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private TaskOrchestrationPlanState(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("IN_PROGRESS")) { //$NON-NLS-1$
            return "inProgress"; //$NON-NLS-1$
        }

        if (name.equals("QUEUED")) { //$NON-NLS-1$
            return "queued"; //$NON-NLS-1$
        }

        if (name.equals("COMPLETED")) { //$NON-NLS-1$
            return "completed"; //$NON-NLS-1$
        }

        return null;
    }
}
