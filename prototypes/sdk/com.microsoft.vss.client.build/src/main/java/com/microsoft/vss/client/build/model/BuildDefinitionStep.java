package com.microsoft.vss.client.build.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionStep {
    private TaskDefinitionReference taskDefinition;
    private Map<String, String> inputs = new HashMap<String, String>();
    private boolean enabled;

    @JsonProperty("Task")
    public TaskDefinitionReference getTaskDefinition() {
        return taskDefinition;
    }

    @JsonProperty("Task")
    public void setTaskDefinition(final TaskDefinitionReference taskDefinition) {
        this.taskDefinition = taskDefinition;
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
