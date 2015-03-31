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

public class MaskHint {

    private MaskType type;
    private String value;

    /**
     * Getter for Type
     * @return MaskType
     */
    public MaskType getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final MaskType type) {
        this.type = type;
    }

    /**
     * Getter for Value
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value
     * @param value
     */
    public void setValue(final String value) {
        this.value = value;
    }
}
