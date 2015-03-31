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

public class PropertyValue {

    private UUID changedBy;
    private Date changedDate;
    private String propertyName;
    private Object value;

    /**
     * Getter for ChangedBy
     * @return UUID
     */
    public UUID getChangedBy() {
        return changedBy;
    }

    /**
     * Setter for ChangedBy
     * @param changedBy
     */
    public void setChangedBy(final UUID changedBy) {
        this.changedBy = changedBy;
    }

    /**
     * Getter for ChangedDate
     * @return Date
     */
    public Date getChangedDate() {
        return changedDate;
    }

    /**
     * Setter for ChangedDate
     * @param changedDate
     */
    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

    /**
     * Getter for PropertyName
     * @return String
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Setter for PropertyName
     * @param propertyName
     */
    public void setPropertyName(final String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Getter for Value
     * @return Object
     */
    public Object getValue() {
        return value;
    }

    /**
     * Setter for Value
     * @param value
     */
    public void setValue(final Object value) {
        this.value = value;
    }
}
