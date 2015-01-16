package com.microsoft.vss.client.test.project;

import java.net.URI;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.core.model.TeamProject;

public class Project
    extends ProjectBase {

    public Project(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01(final String projectName) {

        UUID projectId = getProjectIdByName(projectName);
        final TeamProject project = projectClient.getProject(projectId.toString());

        printProject(project);
    }

    public void testGet_02(final String projectName) {

        UUID projectId = getProjectIdByName(projectName);
        final TeamProject project = projectClient.getProject(projectId.toString(), true);

        printProject(project);
    }

    public void testGet_03(final String projectName) {

        UUID projectId = getProjectIdByName(projectName);
        final TeamProject project = projectClient.getProject(projectId.toString(), true, true);

        printProject(project);
    }

    public void testUpdate_01(final String projectName, final String newDescription) {

        UUID projectId = getProjectIdByName(projectName);
        final TeamProject project = projectClient.getProject(projectId.toString());
        System.out.println("Old description = " + project.getDescription()); //$NON-NLS-1$

        final TeamProject projectUpdate = new TeamProject();

        projectUpdate.setId(project.getId());
        projectUpdate.setDescription(newDescription);

        projectClient.updateProject(projectId, projectUpdate);

        final TeamProject updatedProject = projectClient.getProject(projectId.toString());
        System.out.println("Old description = " + updatedProject.getDescription()); //$NON-NLS-1$
    }
}
