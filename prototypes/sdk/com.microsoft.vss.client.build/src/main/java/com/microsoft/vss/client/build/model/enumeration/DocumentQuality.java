package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum DocumentQuality {
    Definition(1), Draft(2);

    private final int value;

    DocumentQuality(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
