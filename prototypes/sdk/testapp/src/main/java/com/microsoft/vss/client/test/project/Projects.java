package com.microsoft.vss.client.test.project;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.ProjectState;

public class Projects
    extends ProjectBase {

    public Projects(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01() {

        final List<TeamProjectReference> projects = projectClient.getProjects();

        System.out.println(projects.size() + " project(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final TeamProjectReference p : projects) {
            printProject(p);
        }

    }

    public void testGet_02() {

        for (final ProjectState state : ProjectState.values()) {
            final List<TeamProjectReference> projects = projectClient.getProjects();

            System.out.println(projects.size() + " " + state.toString() + " project(s) read"); //$NON-NLS-1$ //$NON-NLS-2$
            System.out.println();

            for (final TeamProjectReference p : projects) {
                printProject(p);
            }
        }
    }
}
