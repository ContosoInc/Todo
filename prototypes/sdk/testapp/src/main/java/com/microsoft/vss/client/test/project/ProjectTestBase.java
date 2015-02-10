package com.microsoft.vss.client.test.project;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.core.webapi.CoreHttpClient;
import com.microsoft.teamfoundation.core.webapi.model.TeamProject;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.vss.client.test.JsonUtil;
import com.microsoft.vss.client.test.TestBase;

public class ProjectTestBase
    extends TestBase {

    protected final CoreHttpClient coreClient;

    public ProjectTestBase(final Client client, final URI baseUrl) {
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

    public static void printProject(final TeamProject project) {

        printProject((TeamProjectReference) project);
        System.out.println();
        System.out.println("Description     = " + project.getDescription()); //$NON-NLS-1$
        System.out.println("TfsUri          = " + project.getTfsUri()); //$NON-NLS-1$
        System.out.println("Capabilities    = " + JsonUtil.toJson(project.getCapabilities())); //$NON-NLS-1$
        System.out.println("DefaultTeam     = " + JsonUtil.toJson(project.getDefaultTeam())); //$NON-NLS-1$
        System.out.println("Links           = " + JsonUtil.toJson(project.getLinks())); //$NON-NLS-1$

    }

    public static void printProject(final TeamProjectReference project) {

        System.out.println("Id              = " + project.getId()); //$NON-NLS-1$
        System.out.println("Name            = " + project.getName()); //$NON-NLS-1$
        System.out.println("Abbreviation    = " + project.getAbbreviation()); //$NON-NLS-1$
        System.out.println("Url             = " + project.getUrl()); //$NON-NLS-1$

    }
}
