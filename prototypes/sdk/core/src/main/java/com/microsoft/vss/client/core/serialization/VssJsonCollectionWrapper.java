package com.microsoft.vss.client.core.serialization;

import java.util.List;

public class VssJsonCollectionWrapper<T> {
    private int count;
    private List<T> value;

    public List<T> getValue() {
        return value;
    }

    public void setValue(final List<T> value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }
}
