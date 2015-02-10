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

public enum ItemContentType {

    RAW_TEXT(0),
    BASE64_ENCODED(1),
    ;
    
    private int value;

    private ItemContentType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("RAW_TEXT")) { //$NON-NLS-1$
            return "rawText"; //$NON-NLS-1$
        }

        if (name.equals("BASE64_ENCODED")) { //$NON-NLS-1$
            return "base64Encoded"; //$NON-NLS-1$
        }

        return null;
    }
}
