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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.DefinitionTriggerType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildDefinitionSourceProvider {

    private String definitionUri;
    private HashMap<String,String> fields;
    private int id;
    private Date lastModified;
    private String name;
    private DefinitionTriggerType supportedTriggerTypes;

    public String getDefinitionUri() {
        return definitionUri;
    }

    public void setDefinitionUri(final String definitionUri) {
        this.definitionUri = definitionUri;
    }

    public HashMap<String,String> getFields() {
        return fields;
    }

    public void setFields(final HashMap<String,String> fields) {
        this.fields = fields;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DefinitionTriggerType getSupportedTriggerTypes() {
        return supportedTriggerTypes;
    }

    public void setSupportedTriggerTypes(final DefinitionTriggerType supportedTriggerTypes) {
        this.supportedTriggerTypes = supportedTriggerTypes;
    }
}
