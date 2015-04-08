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


public enum IssueType {

    ERROR(1),
    WARNING(2),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private IssueType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        if (name.equals("WARNING")) { //$NON-NLS-1$
            return "warning"; //$NON-NLS-1$
        }

        return null;
    }
}
