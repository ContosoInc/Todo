/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public enum TaskAreaVisibility {

    BUILD(1),
    ;
    
    private int value;

    private TaskAreaVisibility(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type TaskAreaVisibility
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BUILD")) { //$NON-NLS-1$
            return "build"; //$NON-NLS-1$
        }

        return null;
    }
}
