package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum QueuePriority {
    Low(5), BelowNormal(4), Normal(3), AboveNormal(2), High(1);

    private final int value;

    QueuePriority(int priority) {
        this.value = priority;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
