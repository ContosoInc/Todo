package com.microsoft.vss.client.test.project;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.common.model.ProjectState;
import com.microsoft.teamfoundation.core.webapi.model.TeamProject;
import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;

public class ProjectTests
    extends ProjectTestBase {

    public ProjectTests(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01() {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_01", this.getClass().getName())); //$NON-NLS-1$

        final List<TeamProjectReference> projects = coreClient.getProjects();

        System.out.println(projects.size() + " project(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final TeamProjectReference p : projects) {
            printProject(p);
        }

    }

    public void testGet_02() {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        for (final ProjectState state : ProjectState.values()) {
            final List<TeamProjectReference> projects = coreClient.getProjects(state);

            System.out.println(projects.size() + " " + state.toString() + " project(s) read"); //$NON-NLS-1$ //$NON-NLS-2$
            System.out.println();

            for (final TeamProjectReference p : projects) {
                printProject(p);
            }
        }
    }

    public void testGet_03(final String projectName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_03", this.getClass().getName())); //$NON-NLS-1$

        UUID projectId = getProjectIdByName(projectName);

        if (projectId == null) {
            return;
        }

        final TeamProject project = coreClient.getProject(projectId.toString());

        printProject(project);
    }

    public void testGet_04(final String projectName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        UUID projectId = getProjectIdByName(projectName);

        if (projectId == null) {
            return;
        }

        final TeamProject project = coreClient.getProject(projectId.toString(), true);

        printProject(project);
    }

    public void testGet_05(final String projectName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_05", this.getClass().getName())); //$NON-NLS-1$

        UUID projectId = getProjectIdByName(projectName);

        if (projectId == null) {
            return;
        }

        final TeamProject project = coreClient.getProject(projectId.toString(), true, true);

        printProject(project);
    }

    public void testUpdate_01(final String projectName, final String newDescription) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testUpdate_01", this.getClass().getName())); //$NON-NLS-1$

        UUID projectId = getProjectIdByName(projectName);

        if (projectId == null) {
            return;
        }

        final TeamProject project = coreClient.getProject(projectId.toString());
        System.out.println("Old description = " + project.getDescription()); //$NON-NLS-1$

        final TeamProject projectUpdate = new TeamProject();

        projectUpdate.setId(project.getId());
        projectUpdate.setDescription(newDescription);

        coreClient.updateProject(projectUpdate, projectId);

        final TeamProject updatedProject = coreClient.getProject(projectId.toString());
        System.out.println("New description = " + updatedProject.getDescription()); //$NON-NLS-1$
    }
}
