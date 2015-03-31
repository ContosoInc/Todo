/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;

public enum DeleteOptions {

    NONE(0),
    DROP_LOCATION(1),
    TEST_RESULTS(2),
    LABEL(4),
    DETAILS(8),
    SYMBOLS(16),
    ALL(31),
    ;
    
    private int value;

    private DeleteOptions(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type DeleteOptions
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("DROP_LOCATION")) { //$NON-NLS-1$
            return "dropLocation"; //$NON-NLS-1$
        }

        if (name.equals("TEST_RESULTS")) { //$NON-NLS-1$
            return "testResults"; //$NON-NLS-1$
        }

        if (name.equals("LABEL")) { //$NON-NLS-1$
            return "label"; //$NON-NLS-1$
        }

        if (name.equals("DETAILS")) { //$NON-NLS-1$
            return "details"; //$NON-NLS-1$
        }

        if (name.equals("SYMBOLS")) { //$NON-NLS-1$
            return "symbols"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
