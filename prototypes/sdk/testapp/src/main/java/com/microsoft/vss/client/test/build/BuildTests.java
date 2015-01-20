package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.model.Build;
import com.microsoft.vss.client.core.StringUtil;

public class BuildTests
    extends BuildTestBase {
    public BuildTests(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01(final String projectName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_01", this.getClass().getName())); //$NON-NLS-1$

        final UUID projectId = getProjectIdByName(projectName);

        if (projectId == null) {
            return;
        }

        final List<Build> builds =
            buildClient.getBuilds(projectId, null, null, null, null, null, null, null, null, null, null, null, 10);

        System.out.println(builds.size() + " build(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final Build build : builds) {
            System.out.println(StringUtil.pad(build.getId(), 8) + '\t' + build.getBuildNumber());
        }
        System.out.println(builds.size());
    }

    public void testGet_02(final int buildId) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        final Build build = buildClient.getBuild(buildId, null);
        System.out.println(StringUtil.pad(build.getId(), 8) + '\t' + build.getBuildNumber());
    }

}
