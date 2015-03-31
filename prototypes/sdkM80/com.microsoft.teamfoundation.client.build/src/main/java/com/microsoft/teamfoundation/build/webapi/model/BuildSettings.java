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

public class BuildSettings {

    private RetentionPolicy defaultRetentionPolicy;

    /**
     * Getter for DefaultRetentionPolicy
     * @return RetentionPolicy
     */
    public RetentionPolicy getDefaultRetentionPolicy() {
        return defaultRetentionPolicy;
    }

    /**
     * Setter for DefaultRetentionPolicy
     * @param defaultRetentionPolicy
     */
    public void setDefaultRetentionPolicy(final RetentionPolicy defaultRetentionPolicy) {
        this.defaultRetentionPolicy = defaultRetentionPolicy;
    }
}
