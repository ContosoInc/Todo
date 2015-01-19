package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.model.ArtifactResource;
import com.microsoft.vss.client.build.model.BuildArtifact;
import com.microsoft.vss.client.core.StringUtil;

public class BuildArtifacts
    extends BuildBase {
    public BuildArtifacts(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01() {

        final List<BuildArtifact> artifacts = buildClient.getArtifacts(110822);

        for (final BuildArtifact artifact : artifacts) {
            System.out.println(StringUtil.pad(artifact.getId(), 8) + '\t' + artifact.getName());
            final ArtifactResource resource = artifact.getResource();
            System.out.println("        Type = " + resource.getType().toString()); //$NON-NLS-1$
            System.out.println("         Url = " + resource.getUrl()); //$NON-NLS-1$
            System.out.println(" DownloadUrl = " + resource.getDownloadUrl()); //$NON-NLS-1$
            System.out.println("        Data = " + resource.getData()); //$NON-NLS-1$
        }
        System.out.println(artifacts.size());

    }

    public void testGet_02() {

        final List<BuildArtifact> artifacts = buildClient.getArtifacts(110822, "drop"); //$NON-NLS-1$

        for (final BuildArtifact artifact : artifacts) {
            System.out.println(StringUtil.pad(artifact.getId(), 8) + '\t' + artifact.getName());
            final ArtifactResource resource = artifact.getResource();
            System.out.println("        Type = " + resource.getType().toString()); //$NON-NLS-1$
            System.out.println("         Url = " + resource.getUrl()); //$NON-NLS-1$
            System.out.println(" DownloadUrl = " + resource.getDownloadUrl()); //$NON-NLS-1$
            System.out.println("        Data = " + resource.getData()); //$NON-NLS-1$
        }
        System.out.println(artifacts.size());

    }

}
