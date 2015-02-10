package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.build.webapi.BuildHttpClient;
import com.microsoft.teamfoundation.core.webapi.CoreHttpClient;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.vss.client.test.TestBase;

public class BuildTestBase
    extends TestBase {

    protected final BuildHttpClient buildClient;
    protected final CoreHttpClient coreClient;

    public BuildTestBase(final Client client, final URI baseUrl) {
        buildClient = new BuildHttpClient(client, baseUrl);
        coreClient = new CoreHttpClient(client, baseUrl);
    }

    protected UUID getProjectIdByName(final String projectName) {

        final List<TeamProjectReference> projects = coreClient.getProjects();
        UUID projectId = null;

        for (final TeamProjectReference p : projects) {
            if (p.getName().equalsIgnoreCase(projectName)) {
                projectId = p.getId();
                break;
            }
        }

        if (projectId == null) {
            System.out.println(MessageFormat.format(
                "Project {0} not found at {1}", projectName, coreClient.getBaseUrl())); //$NON-NLS-1$
        }

        return projectId;
    }

}
