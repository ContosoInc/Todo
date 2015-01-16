package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildResult {
    None(0), Succeeded(2), PartiallySucceeded(4), Failed(8), Stopped(16), Canceled(32);

    private final int value;

    BuildResult(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
