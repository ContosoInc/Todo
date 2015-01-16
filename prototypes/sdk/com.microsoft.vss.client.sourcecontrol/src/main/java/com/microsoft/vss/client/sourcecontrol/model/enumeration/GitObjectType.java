package com.microsoft.vss.client.sourcecontrol.model.enumeration;

import com.microsoft.vss.client.sourcecontrol.Messages;

public enum GitObjectType {
    Bad, Commit, Tree, Blob, Tag, Ext2, OfsDelta, RefDelta;

    public static final String str1 = Messages.getString("GitObjectType.Example"); //$NON-NLS-1$

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
