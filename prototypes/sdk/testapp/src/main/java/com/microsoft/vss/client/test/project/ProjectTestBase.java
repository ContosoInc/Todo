package com.microsoft.vss.client.test.project;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.core.model.TeamProject;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.ProjectHttpClient;
import com.microsoft.vss.client.test.JsonUtil;
import com.microsoft.vss.client.test.TestBase;

public class ProjectTestBase
    extends TestBase {

    protected final ProjectHttpClient projectClient;

    public ProjectTestBase(final Client client, final URI baseUrl) {
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

    public void printProject(final TeamProject project) {

        printProject((TeamProjectReference) project);
        System.out.println();
        System.out.println("Description     = " + project.getDescription()); //$NON-NLS-1$
        System.out.println("TfsUri          = " + project.getTfsUri()); //$NON-NLS-1$
        System.out.println("Capabilities    = " + JsonUtil.toJson(project.getCapabilities())); //$NON-NLS-1$
        System.out.println("DefaultTeam     = " + JsonUtil.toJson(project.getDefaultTeam())); //$NON-NLS-1$
        System.out.println("Links           = " + JsonUtil.toJson(project.getLinks())); //$NON-NLS-1$

    }

    public void printProject(final TeamProjectReference project) {

        System.out.println("Id              = " + project.getId()); //$NON-NLS-1$
        System.out.println("Name            = " + project.getName()); //$NON-NLS-1$
        System.out.println("Abbreviation    = " + project.getAbbreviation()); //$NON-NLS-1$
        System.out.println("Url             = " + project.getUrl()); //$NON-NLS-1$

    }
}
