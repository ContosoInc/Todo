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

public class TfvcPolicyFailureInfo {

    private String message;
    private String policyName;

    /**
     * Getter for Message
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message
     * @param message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Getter for PolicyName
     * @return String
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Setter for PolicyName
     * @param policyName
     */
    public void setPolicyName(final String policyName) {
        this.policyName = policyName;
    }
}
