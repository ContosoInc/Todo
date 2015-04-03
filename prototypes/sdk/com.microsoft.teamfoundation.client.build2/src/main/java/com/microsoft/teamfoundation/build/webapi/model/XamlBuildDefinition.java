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

import com.microsoft.teamfoundation.build.webapi.model.BuildController;
import com.microsoft.teamfoundation.build.webapi.model.BuildReason;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionReference;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionTriggerType;
import com.microsoft.teamfoundation.build.webapi.model.ShallowReference;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class XamlBuildDefinition
    extends DefinitionReference {

    private ReferenceLinks _links;
    private int batchSize;
    private String buildArgs;
    private int continuousIntegrationQuietPeriod;
    private BuildController controller;
    private Date createdOn;
    private String defaultDropLocation;
    private String description;
    private ShallowReference lastBuild;
    private BuildReason supportedReasons;
    private DefinitionTriggerType triggerType;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(final int batchSize) {
        this.batchSize = batchSize;
    }

    public String getBuildArgs() {
        return buildArgs;
    }

    public void setBuildArgs(final String buildArgs) {
        this.buildArgs = buildArgs;
    }

    public int getContinuousIntegrationQuietPeriod() {
        return continuousIntegrationQuietPeriod;
    }

    public void setContinuousIntegrationQuietPeriod(final int continuousIntegrationQuietPeriod) {
        this.continuousIntegrationQuietPeriod = continuousIntegrationQuietPeriod;
    }

    public BuildController getController() {
        return controller;
    }

    public void setController(final BuildController controller) {
        this.controller = controller;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getDefaultDropLocation() {
        return defaultDropLocation;
    }

    public void setDefaultDropLocation(final String defaultDropLocation) {
        this.defaultDropLocation = defaultDropLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ShallowReference getLastBuild() {
        return lastBuild;
    }

    public void setLastBuild(final ShallowReference lastBuild) {
        this.lastBuild = lastBuild;
    }

    public BuildReason getSupportedReasons() {
        return supportedReasons;
    }

    public void setSupportedReasons(final BuildReason supportedReasons) {
        this.supportedReasons = supportedReasons;
    }

    public DefinitionTriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(final DefinitionTriggerType triggerType) {
        this.triggerType = triggerType;
    }
}
