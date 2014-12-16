package com.microsoft.tfs.sdk.build.model;

import com.microsoft.tfs.sdk.build.model.enumeration.QueueType;
import com.microsoft.tfs.sdk.core.model.ShallowReference;

/**
 * Created by yacao on 12/12/2014.
 */
public class QueueReference extends ShallowReference {
    private QueueType queueType;

    public QueueType getQueueType() {
        return queueType;
    }

    public void setQueueType(QueueType queueType) {
        this.queueType = queueType;
    }
}
