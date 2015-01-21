package com.microsoft.vss.client.sourcecontrol.model.enumeration;

public enum VersionControlRecursionType {
    None(0), OneLevel(1), Full(120);

    private int value;

    VersionControlRecursionType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
