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


public enum WorkspaceMappingType {

    MAP(0),
    CLOAK(1),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private WorkspaceMappingType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("MAP")) { //$NON-NLS-1$
            return "map"; //$NON-NLS-1$
        }

        if (name.equals("CLOAK")) { //$NON-NLS-1$
            return "cloak"; //$NON-NLS-1$
        }

        return null;
    }
}
