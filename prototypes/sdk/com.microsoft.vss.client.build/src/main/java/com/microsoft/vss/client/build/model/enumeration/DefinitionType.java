package com.microsoft.vss.client.build.model.enumeration;

public enum DefinitionType {
    Xaml(1), Build(2);

    private final int value;

    DefinitionType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
