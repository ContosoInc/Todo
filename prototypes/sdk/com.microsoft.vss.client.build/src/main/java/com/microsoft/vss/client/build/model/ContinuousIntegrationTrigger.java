package com.microsoft.vss.client.build.model;

import java.util.List;

import com.microsoft.vss.client.build.model.enumeration.DefinitionTriggerType;

public class ContinuousIntegrationTrigger
    extends BuildTrigger {

    /*
     * TODO Implement JsonReader for the set of BuildTrigger subclasses private
     * boolean batchChanges; private List<String> branchFilters = new
     * ArrayList<String>();
     */
    public ContinuousIntegrationTrigger() {
        super(DefinitionTriggerType.ContinuousIntegration);
    }

    public boolean getBatchChanges() {
        return batchChanges;
    }

    public void setBatchChanges(final boolean batchChanges) {
        this.batchChanges = batchChanges;
    }

    public List<String> getBranchFilters() {
        return branchFilters;
    }

    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }
}
