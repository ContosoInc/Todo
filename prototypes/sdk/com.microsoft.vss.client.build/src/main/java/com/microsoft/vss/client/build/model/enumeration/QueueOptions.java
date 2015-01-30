package com.microsoft.vss.client.build.model.enumeration;

public enum QueueOptions {
    DoNotRun(1), None(0);

    private final int value;

    QueueOptions(int options) {
        this.value = options;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
