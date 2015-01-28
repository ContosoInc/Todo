package com.microsoft.vss.client.core.serialization;

import java.util.ArrayList;
import java.util.List;

public class VssJsonCollectionWrapper<T> {
    private int count;
    private List<T> value;

    public VssJsonCollectionWrapper() {
        this(new ArrayList<T>());
    }

    public VssJsonCollectionWrapper(final List<T> value) {
        this.value = value;
        this.count = value.size();
    }

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

    public static VssJsonCollectionWrapper<Object> newInstance(final List<?> value) {
        final List<Object> newValue = new ArrayList<Object>();
        newValue.addAll(value);
        return new VssJsonCollectionWrapper<Object>(newValue);
    }
}
