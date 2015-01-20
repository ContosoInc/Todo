package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.BuildHttpClient;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.ProjectHttpClient;
import com.microsoft.vss.client.test.TestBase;

public class BuildTestBase
    extends TestBase {

    protected final BuildHttpClient buildClient;
    protected final ProjectHttpClient projectClient;

    public BuildTestBase(final Client client, final URI baseUrl) {
        buildClient = new BuildHttpClient(client, baseUrl);
        projectClient = new ProjectHttpClient(client, baseUrl);
    }

    protected UUID getProjectIdByName(final String projectName) {

        final List<TeamProjectReference> projects = projectClient.getProjects();
        UUID projectId = null;

        for (final TeamProjectReference p : projects) {
            if (p.getName().equalsIgnoreCase(projectName)) {
                projectId = p.getId();
                break;
            }
        }

        if (projectId == null) {
            System.out.println(MessageFormat.format(
                "Project {0} not found at {1}", projectName, projectClient.getBaseUrl())); //$NON-NLS-1$
        }

        return projectId;
    }

}
