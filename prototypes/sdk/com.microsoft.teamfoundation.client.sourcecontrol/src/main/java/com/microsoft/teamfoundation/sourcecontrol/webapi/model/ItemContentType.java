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

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
