/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;

public class WebApiProjectCollection
    extends WebApiProjectCollectionRef {

    private String description;
    private String state;

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for State
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * Setter for State
     * @param state
     */
    public void setState(final String state) {
        this.state = state;
    }
}
