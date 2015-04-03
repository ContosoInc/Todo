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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcItem;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcLabelRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcLabel
    extends TfvcLabelRef {

    private List<TfvcItem> items;

    public List<TfvcItem> getItems() {
        return items;
    }

    public void setItems(final List<TfvcItem> items) {
        this.items = items;
    }
}
