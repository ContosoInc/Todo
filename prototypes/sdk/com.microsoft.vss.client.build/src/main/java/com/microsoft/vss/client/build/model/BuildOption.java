package com.microsoft.vss.client.build.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildOption {
    private BuildOptionDefinitionReference buildOptionDefinition;
    private Map<String, String> inputs = new HashMap<String, String>();
    private boolean enabled;

    @JsonProperty("Definition")
    public BuildOptionDefinitionReference getBuildOptionDefinition() {
        return buildOptionDefinition;
    }

    @JsonProperty("Definition")
    public void setBuildOptionDefinition(final BuildOptionDefinitionReference buildOptionDefinition) {
        this.buildOptionDefinition = buildOptionDefinition;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(final Map<String, String> inputs) {
        this.inputs = inputs;
    }

}
