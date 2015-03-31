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

public enum ArtifactResourceType {

    UNKNOWN(0),
    LOCAL_PATH(1),
    VERSION_CONTROL(2),
    CONTAINER(3),
    ;
    
    private int value;

    private ArtifactResourceType(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type ArtifactResourceType
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKNOWN")) { //$NON-NLS-1$
            return "unknown"; //$NON-NLS-1$
        }

        if (name.equals("LOCAL_PATH")) { //$NON-NLS-1$
            return "localPath"; //$NON-NLS-1$
        }

        if (name.equals("VERSION_CONTROL")) { //$NON-NLS-1$
            return "versionControl"; //$NON-NLS-1$
        }

        if (name.equals("CONTAINER")) { //$NON-NLS-1$
            return "container"; //$NON-NLS-1$
        }

        return null;
    }
}
