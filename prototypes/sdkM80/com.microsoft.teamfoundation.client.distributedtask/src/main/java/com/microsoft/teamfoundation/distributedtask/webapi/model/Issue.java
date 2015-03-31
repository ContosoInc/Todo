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

public class Issue {

    private String category;
    private HashMap<String,String> data;
    private String message;
    private IssueType type;

    /**
     * Getter for Category
     * @return String
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter for Category
     * @param category
     */
    public void setCategory(final String category) {
        this.category = category;
    }

    /**
     * Getter for Data
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getData() {
        return data;
    }

    /**
     * Setter for Data
     * @param data
     */
    public void setData(final HashMap<String,String> data) {
        this.data = data;
    }

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
     * Getter for Type
     * @return IssueType
     */
    public IssueType getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final IssueType type) {
        this.type = type;
    }
}
