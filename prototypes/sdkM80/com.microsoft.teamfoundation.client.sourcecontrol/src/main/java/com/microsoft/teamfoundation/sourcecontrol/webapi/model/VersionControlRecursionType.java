/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public enum VersionControlRecursionType {

    NONE(0),
    ONE_LEVEL(1),
    FULL(120),
    ;
    
    private int value;

    private VersionControlRecursionType(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type VersionControlRecursionType
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("ONE_LEVEL")) { //$NON-NLS-1$
            return "oneLevel"; //$NON-NLS-1$
        }

        if (name.equals("FULL")) { //$NON-NLS-1$
            return "full"; //$NON-NLS-1$
        }

        return null;
    }
}
