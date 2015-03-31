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

public enum GitVersionOptions {

    NONE(0),
    PREVIOUS_CHANGE(1),
    FIRST_PARENT(2),
    ;
    
    private int value;

    private GitVersionOptions(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type GitVersionOptions
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("PREVIOUS_CHANGE")) { //$NON-NLS-1$
            return "previousChange"; //$NON-NLS-1$
        }

        if (name.equals("FIRST_PARENT")) { //$NON-NLS-1$
            return "firstParent"; //$NON-NLS-1$
        }

        return null;
    }
}
