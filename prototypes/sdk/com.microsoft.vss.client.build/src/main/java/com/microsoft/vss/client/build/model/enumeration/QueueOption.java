package com.microsoft.vss.client.build.model.enumeration;

public enum QueueOption {
    DoNotRun(1), Run(0);

    private final int value;

    QueueOption(int option) {
        this.value = option;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
