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

public enum BuildOptionInputType {

    STRING(0),
    BOOLEAN(1),
    STRING_LIST(2),
    RADIO(3),
    PICK_LIST(4),
    MULTI_LINE(5),
    ;
    
    private int value;

    private BuildOptionInputType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("STRING")) { //$NON-NLS-1$
            return "string"; //$NON-NLS-1$
        }

        if (name.equals("BOOLEAN")) { //$NON-NLS-1$
            return "boolean"; //$NON-NLS-1$
        }

        if (name.equals("STRING_LIST")) { //$NON-NLS-1$
            return "stringList"; //$NON-NLS-1$
        }

        if (name.equals("RADIO")) { //$NON-NLS-1$
            return "radio"; //$NON-NLS-1$
        }

        if (name.equals("PICK_LIST")) { //$NON-NLS-1$
            return "pickList"; //$NON-NLS-1$
        }

        if (name.equals("MULTI_LINE")) { //$NON-NLS-1$
            return "multiLine"; //$NON-NLS-1$
        }

        return null;
    }
}
