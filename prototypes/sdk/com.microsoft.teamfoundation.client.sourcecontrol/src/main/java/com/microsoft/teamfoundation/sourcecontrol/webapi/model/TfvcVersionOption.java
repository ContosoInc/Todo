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
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TfvcVersionOption {

    NONE(0),
    PREVIOUS(1),
    USE_RENAME(2),
    ;
    
    private int value;

    private TfvcVersionOption(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("PREVIOUS")) { //$NON-NLS-1$
            return "previous"; //$NON-NLS-1$
        }

        if (name.equals("USE_RENAME")) { //$NON-NLS-1$
            return "useRename"; //$NON-NLS-1$
        }

        return null;
    }
}
