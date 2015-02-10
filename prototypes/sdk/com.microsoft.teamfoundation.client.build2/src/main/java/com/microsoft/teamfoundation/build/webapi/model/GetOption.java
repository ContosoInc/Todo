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
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetOption {

    LATEST_ON_QUEUE(0),
    LATEST_ON_BUILD(1),
    CUSTOM(2),
    ;
    
    private int value;

    private GetOption(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("LATEST_ON_QUEUE")) { //$NON-NLS-1$
            return "latestOnQueue"; //$NON-NLS-1$
        }

        if (name.equals("LATEST_ON_BUILD")) { //$NON-NLS-1$
            return "latestOnBuild"; //$NON-NLS-1$
        }

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        return null;
    }
}
