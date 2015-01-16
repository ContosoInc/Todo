package com.microsoft.vss.client.build.model;

import java.util.ArrayList;
import java.util.List;

public class BuildOptionDefinition
    extends BuildOptionDefinitionReference {
    private int ordinal;
    private String name;
    private String description;
    private List<BuildOptionInputDefinition> inputs = new ArrayList<BuildOptionInputDefinition>();

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(final int ordinal) {
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<BuildOptionInputDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(final List<BuildOptionInputDefinition> inputs) {
        this.inputs = inputs;
    }

}
