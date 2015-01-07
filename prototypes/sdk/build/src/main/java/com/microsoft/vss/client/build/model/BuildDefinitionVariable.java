package com.microsoft.vss.client.build.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildDefinitionVariable {
    private String value;
    private boolean allowOverride;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @JsonProperty("AllowOverride")
    public boolean allowsOverride() {
        return allowOverride;
    }

    @JsonProperty("AllowOverride")
    public void setAllowOverride(boolean allowOverride) {
        this.allowOverride = allowOverride;
    }

}
