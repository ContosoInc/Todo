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

public enum DefinitionType {

    XAML(1),
    BUILD(2),
    ;
    
    private int value;

    private DefinitionType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("XAML")) { //$NON-NLS-1$
            return "xaml"; //$NON-NLS-1$
        }

        if (name.equals("BUILD")) { //$NON-NLS-1$
            return "build"; //$NON-NLS-1$
        }

        return null;
    }
}
