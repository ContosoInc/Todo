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

public class InformationNode {

    private HashMap<String,String> fields;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int nodeId;
    private int parentId;
    private String type;

    /**
     * Getter for Fields
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getFields() {
        return fields;
    }

    /**
     * Setter for Fields
     * @param fields
     */
    public void setFields(final HashMap<String,String> fields) {
        this.fields = fields;
    }

    /**
     * Getter for LastModifiedBy
     * @return String
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Setter for LastModifiedBy
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Getter for LastModifiedDate
     * @return Date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Setter for LastModifiedDate
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Getter for NodeId
     * @return int
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId
     * @param nodeId
     */
    public void setNodeId(final int nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for ParentId
     * @return int
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Setter for ParentId
     * @param parentId
     */
    public void setParentId(final int parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for Type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final String type) {
        this.type = type;
    }
}