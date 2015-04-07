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


public enum GetOption {

    LATEST_ON_QUEUE(0),
    LATEST_ON_BUILD(1),
    CUSTOM(2),
    ;
    
    @SuppressWarnings("unused")
    private int value;

    private GetOption(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("LATEST_ON_QUEUE")) { //$NON-NLS-1$
            return "latestOnQueue"; //$NON-NLS-1$
        }

        if (name.equals("LATEST_ON_BUILD")) { //$NON-NLS-1$
            return "latestOnBuild"; //$NON-NLS-1$
        }

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        return null;
    }
}
