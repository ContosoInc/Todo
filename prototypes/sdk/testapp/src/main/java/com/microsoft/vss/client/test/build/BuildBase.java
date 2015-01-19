package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.BuildHttpClient;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.ProjectHttpClient;
import com.microsoft.vss.client.test.TestBase;

public class BuildBase
    extends TestBase {

    protected final BuildHttpClient buildClient;

    public BuildBase(final Client client, final URI uri) {
        buildClient = new BuildHttpClient(client, uri);
    }

    protected UUID getProjectIdByName(final String projectName) {

        final List<TeamProjectReference> projects =
            new ProjectHttpClient(buildClient.getClient(), buildClient.getBaseUrl()).getProjects();
        UUID projectId = null;

        for (final TeamProjectReference p : projects) {
            if (p.getName().equalsIgnoreCase(projectName)) {
                projectId = p.getId();
                break;
            }
        }

        return projectId;
    }

}
