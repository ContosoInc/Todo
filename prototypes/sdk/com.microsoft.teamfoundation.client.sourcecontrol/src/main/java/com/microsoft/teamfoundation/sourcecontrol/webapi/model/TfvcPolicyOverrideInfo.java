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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcPolicyFailureInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcPolicyOverrideInfo {

    private String comment;
    private List<TfvcPolicyFailureInfo> policyFailures;

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public List<TfvcPolicyFailureInfo> getPolicyFailures() {
        return policyFailures;
    }

    public void setPolicyFailures(final List<TfvcPolicyFailureInfo> policyFailures) {
        this.policyFailures = policyFailures;
    }
}
