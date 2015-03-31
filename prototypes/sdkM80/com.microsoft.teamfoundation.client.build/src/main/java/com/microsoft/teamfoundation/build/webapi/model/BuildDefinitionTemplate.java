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

public class BuildDefinitionTemplate {

    private boolean canDelete;
    private String category;
    private String description;
    private UUID iconTaskId;
    private String id;
    private String name;
    private BuildDefinition template;

    /**
     * Getter for CanDelete
     * @return boolean
     */
    public boolean getCanDelete() {
        return canDelete;
    }

    /**
     * Setter for CanDelete
     * @param canDelete
     */
    public void setCanDelete(final boolean canDelete) {
        this.canDelete = canDelete;
    }

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
     * Getter for IconTaskId
     * @return UUID
     */
    public UUID getIconTaskId() {
        return iconTaskId;
    }

    /**
     * Setter for IconTaskId
     * @param iconTaskId
     */
    public void setIconTaskId(final UUID iconTaskId) {
        this.iconTaskId = iconTaskId;
    }

    /**
     * Getter for Id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Template
     * @return BuildDefinition
     */
    public BuildDefinition getTemplate() {
        return template;
    }

    /**
     * Setter for Template
     * @param template
     */
    public void setTemplate(final BuildDefinition template) {
        this.template = template;
    }
}
