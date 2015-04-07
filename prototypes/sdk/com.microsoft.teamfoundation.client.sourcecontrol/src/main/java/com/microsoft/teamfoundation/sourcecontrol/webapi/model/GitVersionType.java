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


public enum GitVersionType {

    BRANCH(0),
    TAG(1),
    COMMIT(2),
    INDEX(3),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private GitVersionType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BRANCH")) { //$NON-NLS-1$
            return "branch"; //$NON-NLS-1$
        }

        if (name.equals("TAG")) { //$NON-NLS-1$
            return "tag"; //$NON-NLS-1$
        }

        if (name.equals("COMMIT")) { //$NON-NLS-1$
            return "commit"; //$NON-NLS-1$
        }

        if (name.equals("INDEX")) { //$NON-NLS-1$
            return "index"; //$NON-NLS-1$
        }

        return null;
    }
}
