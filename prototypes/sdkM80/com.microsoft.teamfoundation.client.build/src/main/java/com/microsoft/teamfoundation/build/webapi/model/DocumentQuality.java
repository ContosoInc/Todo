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

public enum DocumentQuality {

    DEFINITION(1),
    DRAFT(2),
    ;
    
    private int value;

    private DocumentQuality(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type DocumentQuality
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DEFINITION")) { //$NON-NLS-1$
            return "definition"; //$NON-NLS-1$
        }

        if (name.equals("DRAFT")) { //$NON-NLS-1$
            return "draft"; //$NON-NLS-1$
        }

        return null;
    }
}
