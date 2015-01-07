package com.microsoft.vss.client.build.model;

import java.util.List;

// TODO replace with VssCollectionWrapper and its JsonParser
public class BuildDefinitions {
    private int count;
    private List<BuildDefinition> value;

    public List<BuildDefinition> getValue() {
        return value;
    }

    public void setValue(final List<BuildDefinition> value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }
}
