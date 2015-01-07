package com.microsoft.vss.client.build.model;

import java.util.List;

// TODO replace with VssCollectionWrapper and its JsonParser
public class Builds {
    private int count;
    private List<Build> value;

    public List<Build> getValue() {
        return value;
    }

    public void setValue(final List<Build> value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }
}
