package com.microsoft.teamfoundation.build.webapi;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.build.webapi.model.Build;
import com.microsoft.teamfoundation.build.webapi.model.BuildArtifact;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinition;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionReference;
import com.microsoft.vss.client.core.utils.ArgumentUtility;

public class BuildHttpClient
    extends BuildHttpClientBase {

    public BuildHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    public BuildDefinition addDefinition(final BuildDefinition definition) {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.addDefinition(definition, definition.getProject().getId(), null, null);
    }

    public BuildDefinition addDefinition(final BuildDefinition definition, final int definitionToCloneId) {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.addDefinition(definition, definition.getProject().getId(), definitionToCloneId, null);
    }

    public BuildDefinition addDefinition(final BuildDefinition definition, final int definitionToCloneId,
        final int definitionToCloneRevision) {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.addDefinition(definition, definition.getProject().getId(), definitionToCloneId,
            definitionToCloneRevision);
    }

    public List<BuildArtifact> getArtifacts(final int buildId) {
        return super.getArtifacts(buildId, null);
    }

    @Override
    public List<BuildArtifact> getArtifacts(final int buildId, final String artifactName) {
        ArgumentUtility.checkStringForNullOrEmpty(artifactName, "artifactName", true); //$NON-NLS-1$
        return super.getArtifacts(buildId, artifactName);
    }

    public List<BuildDefinitionReference> getDefinitions(final UUID project) {
        return super.getDefinitions(project, null);
    }

    public Build queueBuild(final Build build) {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.queueBuild(build, build.getProject().getId(), null);
    }

    @Override
    public Build queueBuild(final Build build, final Boolean ignoreWarnings) {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.queueBuild(build, build.getProject().getId(), ignoreWarnings);
    }

    public Build queueBuild(final Build build, final boolean ignoreWarnings) {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.queueBuild(build, build.getProject().getId(), ignoreWarnings);
    }

    @Override
    public Build updateBuild(final Build build, final int buildId) {
        ArgumentUtility.checkForNull(build, "build"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(build.getProject(), "build.Project"); //$NON-NLS-1$
        return super.updateBuild(build, build.getProject().getId(), buildId);
    }

    @Override
    public BuildDefinition updateDefinition(final BuildDefinition definition) {
        ArgumentUtility.checkForNull(definition, "definition"); //$NON-NLS-1$
        ArgumentUtility.checkForNull(definition.getProject(), "definition.Project"); //$NON-NLS-1$
        return super.updateDefinition(definition, definition.getProject().getId());
    }
}
