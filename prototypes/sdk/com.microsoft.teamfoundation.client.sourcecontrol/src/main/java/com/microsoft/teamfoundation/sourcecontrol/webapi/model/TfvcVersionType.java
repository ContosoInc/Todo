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

public enum TfvcVersionType {

    NONE(0),
    CHANGESET(1),
    SHELVESET(2),
    CHANGE(3),
    DATE(4),
    LATEST(5),
    TIP(6),
    MERGE_SOURCE(7),
    ;
    
    private int value;

    private TfvcVersionType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("CHANGESET")) { //$NON-NLS-1$
            return "changeset"; //$NON-NLS-1$
        }

        if (name.equals("SHELVESET")) { //$NON-NLS-1$
            return "shelveset"; //$NON-NLS-1$
        }

        if (name.equals("CHANGE")) { //$NON-NLS-1$
            return "change"; //$NON-NLS-1$
        }

        if (name.equals("DATE")) { //$NON-NLS-1$
            return "date"; //$NON-NLS-1$
        }

        if (name.equals("LATEST")) { //$NON-NLS-1$
            return "latest"; //$NON-NLS-1$
        }

        if (name.equals("TIP")) { //$NON-NLS-1$
            return "tip"; //$NON-NLS-1$
        }

        if (name.equals("MERGE_SOURCE")) { //$NON-NLS-1$
            return "mergeSource"; //$NON-NLS-1$
        }

        return null;
    }
}
