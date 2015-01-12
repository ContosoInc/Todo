package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.QueueType;
import com.microsoft.vss.client.distributedtask.model.TaskAgentPoolReference;

public class AgentPoolQueue
    extends QueueReference {
    public TaskAgentPoolReference pool;

    public AgentPoolQueue() {
        setQueueType(QueueType.AgentPool);
    }
}
