package com.microsoft.vss.client.build.model.enumeration;

public enum BuildOptionInputType {
    String, Boolean, StringList, Radio;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
