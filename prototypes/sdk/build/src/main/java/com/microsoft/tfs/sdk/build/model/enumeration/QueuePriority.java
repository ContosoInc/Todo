package com.microsoft.tfs.sdk.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum QueuePriority {
    Low(5),
    BelowNormal(4),
    Normal(3),
    AboveNormal(2),
    High(1);

    private int priority;
    QueuePriority(int priority) {
        this.priority = priority;
    }
}
