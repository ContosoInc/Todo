package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.model.ArtifactResource;
import com.microsoft.vss.client.build.model.BuildArtifact;
import com.microsoft.vss.client.core.StringUtil;

public class BuildArtifactTests
    extends BuildTestBase {
    public BuildArtifactTests(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01(final int buildId) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_01", this.getClass().getName())); //$NON-NLS-1$

        final List<BuildArtifact> artifacts = buildClient.getArtifacts(buildId);

        System.out.println(artifacts.size() + " artifact(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final BuildArtifact artifact : artifacts) {
            printArtifact(artifact);
        }

    }

    public void testGet_02(final int buildId) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        final List<BuildArtifact> artifacts = buildClient.getArtifacts(buildId, "drop"); //$NON-NLS-1$

        System.out.println(artifacts.size() + " artifact(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final BuildArtifact artifact : artifacts) {
            printArtifact(artifact);
        }

    }

    private void printArtifact(final BuildArtifact artifact) {
        System.out.println(StringUtil.pad(artifact.getId(), 8) + '\t' + artifact.getName());
        final ArtifactResource resource = artifact.getResource();
        System.out.println("        Type = " + resource.getType().toString()); //$NON-NLS-1$
        System.out.println("         Url = " + resource.getUrl()); //$NON-NLS-1$
        System.out.println(" DownloadUrl = " + resource.getDownloadUrl()); //$NON-NLS-1$
        System.out.println("        Data = " + resource.getData()); //$NON-NLS-1$
    }
}
