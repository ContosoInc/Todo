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

public enum MaskType {

    VARIABLE(1),
    REGEX(2),
    ;
    
    private int value;

    private MaskType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("VARIABLE")) { //$NON-NLS-1$
            return "variable"; //$NON-NLS-1$
        }

        if (name.equals("REGEX")) { //$NON-NLS-1$
            return "regex"; //$NON-NLS-1$
        }

        return null;
    }
}
