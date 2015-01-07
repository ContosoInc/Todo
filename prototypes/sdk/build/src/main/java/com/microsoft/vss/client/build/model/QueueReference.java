package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.QueueType;
import com.microsoft.vss.client.core.model.ShallowReference;

/**
 * Created by yacao on 12/12/2014.
 */
public class QueueReference
    extends ShallowReference {
    private QueueType queueType;

    public QueueType getQueueType() {
        return queueType;
    }

    public void setQueueType(QueueType queueType) {
        this.queueType = queueType;
    }
}
