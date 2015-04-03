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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public enum GitRepositoryType {

    NORMAL((byte) 0),
    SUPER((byte) 1),
    ;
    
    private byte value;

    private GitRepositoryType(final byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NORMAL")) { //$NON-NLS-1$
            return "normal"; //$NON-NLS-1$
        }

        if (name.equals("SUPER")) { //$NON-NLS-1$
            return "super"; //$NON-NLS-1$
        }

        return null;
    }
}
