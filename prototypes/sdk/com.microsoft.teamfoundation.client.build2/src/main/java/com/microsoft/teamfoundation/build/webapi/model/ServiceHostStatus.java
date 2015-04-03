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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public enum ServiceHostStatus {

    ONLINE(1),
    OFFLINE(2),
    ;
    
    private int value;

    private ServiceHostStatus(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ONLINE")) { //$NON-NLS-1$
            return "online"; //$NON-NLS-1$
        }

        if (name.equals("OFFLINE")) { //$NON-NLS-1$
            return "offline"; //$NON-NLS-1$
        }

        return null;
    }
}
