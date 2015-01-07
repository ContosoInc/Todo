package com.microsoft.vss.client.build.model;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.vss.client.build.model.enumeration.DefinitionTriggerType;

public class BuildTrigger {

    private DefinitionTriggerType triggerType;

    // TODO Implement JsonReader for the set of BuildTrigger subclasses
    protected boolean batchChanges;
    protected List<String> branchFilters = new ArrayList<String>();

    protected BuildTrigger(final DefinitionTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public DefinitionTriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(final DefinitionTriggerType triggerType) {
        this.triggerType = triggerType;
    }
}
