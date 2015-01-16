package com.microsoft.vss.client.build.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.build.model.enumeration.BuildOptionInputType;
import com.microsoft.vss.client.core.StringUtil;

public class BuildOptionInputDefinition {
    private String name;
    private String label;
    private String defaultValue;
    private boolean required;
    private BuildOptionInputType inputType;
    private String helpMarkDown;
    private Map<String, String> options = new HashMap<String, String>();

    public BuildOptionInputDefinition() {
        setInputType(BuildOptionInputType.String);
        setDefaultValue(StringUtil.EMPTY);
        setRequired(false);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @JsonProperty("Type")
    public BuildOptionInputType getInputType() {
        return inputType;
    }

    @JsonProperty("Type")
    public void setInputType(final BuildOptionInputType inputType) {
        this.inputType = inputType;
    }

    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
    }

    @JsonProperty("Options")
    public Map<String, String> getOptions() {
        return options;
    }

    @JsonProperty("Options")
    public void setOptions(final Map<String, String> options) {
        this.options = options;
    }
}
