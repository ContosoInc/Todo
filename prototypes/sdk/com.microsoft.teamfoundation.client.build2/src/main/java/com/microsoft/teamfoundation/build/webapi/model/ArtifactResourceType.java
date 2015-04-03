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
