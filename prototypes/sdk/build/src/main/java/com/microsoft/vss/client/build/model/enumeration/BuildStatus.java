package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildStatus {
    None(0), InProgress(1), Completed(2), Cancelling(4), Postponed(8), NotStarted(32), All(47);

    private final int value;

    BuildStatus(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
