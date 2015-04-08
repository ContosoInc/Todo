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

package com.microsoft.teamfoundation.core.webapi.model;


public enum ProjectChangeType {

    MODIFIED(0),
    DELETED(1),
    ADDED(2),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private ProjectChangeType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("MODIFIED")) { //$NON-NLS-1$
            return "modified"; //$NON-NLS-1$
        }

        if (name.equals("DELETED")) { //$NON-NLS-1$
            return "deleted"; //$NON-NLS-1$
        }

        if (name.equals("ADDED")) { //$NON-NLS-1$
            return "added"; //$NON-NLS-1$
        }

        return null;
    }
}
