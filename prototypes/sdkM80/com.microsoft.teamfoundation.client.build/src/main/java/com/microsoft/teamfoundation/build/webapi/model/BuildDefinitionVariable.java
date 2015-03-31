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

public class BuildDefinitionVariable {

    private boolean allowOverride;
    private boolean isSecret;
    private String value;

    /**
     * Getter for AllowOverride
     * @return boolean
     */
    public boolean getAllowOverride() {
        return allowOverride;
    }

    /**
     * Setter for AllowOverride
     * @param allowOverride
     */
    public void setAllowOverride(final boolean allowOverride) {
        this.allowOverride = allowOverride;
    }

    /**
     * Getter for IsSecret
     * @return boolean
     */
    public boolean getIsSecret() {
        return isSecret;
    }

    /**
     * Setter for IsSecret
     * @param isSecret
     */
    public void setIsSecret(final boolean isSecret) {
        this.isSecret = isSecret;
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
