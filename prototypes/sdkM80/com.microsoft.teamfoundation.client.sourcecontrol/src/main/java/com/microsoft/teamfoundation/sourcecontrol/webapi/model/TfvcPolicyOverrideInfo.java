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

public class TfvcPolicyOverrideInfo {

    private String comment;
    private List<TfvcPolicyFailureInfo> policyFailures;

    /**
     * Getter for Comment
     * @return String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment
     * @param comment
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    /**
     * Getter for PolicyFailures
     * @return List<TfvcPolicyFailureInfo>
     */
    public List<TfvcPolicyFailureInfo> getPolicyFailures() {
        return policyFailures;
    }

    /**
     * Setter for PolicyFailures
     * @param policyFailures
     */
    public void setPolicyFailures(final List<TfvcPolicyFailureInfo> policyFailures) {
        this.policyFailures = policyFailures;
    }
}
