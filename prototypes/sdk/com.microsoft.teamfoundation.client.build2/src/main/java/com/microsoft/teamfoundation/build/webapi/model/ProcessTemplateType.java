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


public enum ProcessTemplateType {

    CUSTOM(0),
    DEFAULT(1),
    UPGRADE(2),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private ProcessTemplateType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        if (name.equals("DEFAULT")) { //$NON-NLS-1$
            return "default"; //$NON-NLS-1$
        }

        if (name.equals("UPGRADE")) { //$NON-NLS-1$
            return "upgrade"; //$NON-NLS-1$
        }

        return null;
    }
}
