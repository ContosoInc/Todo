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


public enum AuditAction {

    ADD(1),
    UPDATE(2),
    DELETE(3),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private AuditAction(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ADD")) { //$NON-NLS-1$
            return "add"; //$NON-NLS-1$
        }

        if (name.equals("UPDATE")) { //$NON-NLS-1$
            return "update"; //$NON-NLS-1$
        }

        if (name.equals("DELETE")) { //$NON-NLS-1$
            return "delete"; //$NON-NLS-1$
        }

        return null;
    }
}
