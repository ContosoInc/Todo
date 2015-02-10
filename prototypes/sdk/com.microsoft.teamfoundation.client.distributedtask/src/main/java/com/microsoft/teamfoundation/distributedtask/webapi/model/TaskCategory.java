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
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TaskCategory {

    NONE(0),
    UTILITY(1),
    BUILD(2),
    TEST(3),
    DEPLOY(4),
    ;
    
    private int value;

    private TaskCategory(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("UTILITY")) { //$NON-NLS-1$
            return "utility"; //$NON-NLS-1$
        }

        if (name.equals("BUILD")) { //$NON-NLS-1$
            return "build"; //$NON-NLS-1$
        }

        if (name.equals("TEST")) { //$NON-NLS-1$
            return "test"; //$NON-NLS-1$
        }

        if (name.equals("DEPLOY")) { //$NON-NLS-1$
            return "deploy"; //$NON-NLS-1$
        }

        return null;
    }
}
