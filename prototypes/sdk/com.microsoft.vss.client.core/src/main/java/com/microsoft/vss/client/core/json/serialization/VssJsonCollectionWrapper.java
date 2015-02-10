package com.microsoft.vss.client.core.json.serialization;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.core.Messages;

public class VssJsonCollectionWrapper<T> {
    private int count;
    private T value;

    public VssJsonCollectionWrapper() {}

    public VssJsonCollectionWrapper(final T value) {
        this.value = value;
        if (value == null) {
            this.count = 0;
        } else if (value instanceof List<?>) {
            this.count = ((List<?>) value).size();
        } else if (value instanceof Collection<?>) {
            this.count = ((Collection<?>) value).size();
        } else {
            throw new IllegalArgumentException(MessageFormat.format(
                Messages.getString("VssJsonCollectionWrapper.CannotWrapFormat"), //$NON-NLS-1$
                value.getClass().getName()));
        }
    }

    @JsonProperty("value")
    public T getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(final T value) {
        this.value = value;
    }

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(final int count) {
        this.count = count;
    }

    public static VssJsonCollectionWrapper<List<?>> newInstance(final List<?> value) {
        final List<Object> newValue = new ArrayList<Object>();
        newValue.addAll(value);
        return new VssJsonCollectionWrapper<List<?>>(newValue);
    }
}
