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

public class TfvcLabel
    extends TfvcLabelRef {

    private List<TfvcItem> items;

    /**
     * Getter for Items
     * @return List<TfvcItem>
     */
    public List<TfvcItem> getItems() {
        return items;
    }

    /**
     * Setter for Items
     * @param items
     */
    public void setItems(final List<TfvcItem> items) {
        this.items = items;
    }
}
