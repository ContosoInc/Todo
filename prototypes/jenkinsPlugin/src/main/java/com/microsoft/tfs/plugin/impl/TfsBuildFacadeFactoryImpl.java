package com.microsoft.tfs.plugin.impl;

import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.teamfoundation.distributedtask.webapi.model.Demand;
import com.microsoft.tfs.plugin.TfsBuildFacade;
import com.microsoft.tfs.plugin.TfsBuildFacadeFactory;
import com.microsoft.tfs.plugin.TfsClient;
import hudson.model.AbstractBuild;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TfsBuildFacadeFactoryImpl implements TfsBuildFacadeFactory {

    private static final Logger logger = Logger.getLogger(TfsBuildFacadeFactoryImpl.class.getName());

    @Override
    public TfsBuildFacade createBuildOnTfs(String projectId, int buildDefinition, AbstractBuild jenkinsBuild, TfsClient tfsClient) {
        if (jenkinsBuild == null || tfsClient == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        List<AgentPoolQueue> queues = tfsClient.getBuildClient().getQueues(null);
        if (queues == null || queues.isEmpty()) {
            throw new RuntimeException("No queue defined on TFS, cannot create a build without a queue");
        }

        TeamProjectReference project = tfsClient.getProjectClient().getProject(projectId);
        if (project == null) {
            throw new RuntimeException(String.format("Could not find the project: %s", projectId));
        }

        BuildDefinition definition = tfsClient.getBuildClient().getDefinition(project.getId(), buildDefinition, null);
        if (definition == null) {
            throw new RuntimeException(String.format("Could not find the buildDefinition: %d", buildDefinition));
        }

        QueueReference anyQueue = queues.get(0);
        Build buildContainer = createBuildContainer(project, definition, anyQueue);
        Build queuedBuild = tfsClient.getBuildClient().queueBuild(buildContainer, true);

        logger.info(String.format("Queued build on TFS with plan Id %s", queuedBuild.getOrchestrationPlan().getPlanId()));

        return new TfsBuildFacadeImpl(queuedBuild, jenkinsBuild, tfsClient);
    }

    @Override
    public TfsBuildFacade getBuildOnTfs(int tfsBuildId, AbstractBuild jenkinsBuild, TfsClient tfsClient) {
        Build tfsBuild = tfsClient.getBuildClient().getBuild(tfsBuildId, null);

        return new TfsBuildFacadeImpl(tfsBuild, jenkinsBuild, tfsClient);
    }

    private Build createBuildContainer(TeamProjectReference project, BuildDefinition definition, QueueReference queue) {
        Build b = new Build();
        b.setQueue(queue);
        b.setDefinition(definition);
        b.setProject(project);

        b.setParameters("{}");
        b.setDemands(Collections.<Demand>emptyList());

        b.setQueueOptions(QueueOptions.DO_NOT_RUN);

        return b;
    }
}
