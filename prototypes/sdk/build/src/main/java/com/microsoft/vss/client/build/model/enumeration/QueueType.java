package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum QueueType {
    BuildController(1), AgentPool(2);

    private int type;

    QueueType(int type) {
        this.type = type;
    }
}
