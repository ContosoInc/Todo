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

public enum IssueType {

    ERROR(1),
    WARNING(2),
    ;
    
    private int value;

    private IssueType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        if (name.equals("WARNING")) { //$NON-NLS-1$
            return "warning"; //$NON-NLS-1$
        }

        return null;
    }
}
