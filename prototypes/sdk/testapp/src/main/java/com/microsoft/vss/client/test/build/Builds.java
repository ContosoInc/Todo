package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.model.Build;
import com.microsoft.vss.client.core.StringUtil;

public class Builds
    extends BuildBase {
    public Builds(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01() {

        final UUID projectId = UUID.fromString("b924d696-3eae-4116-8443-9a18392d8544"); //$NON-NLS-1$
        final List<Build> builds =
            buildClient.getBuilds(projectId, null, null, null, null, null, null, null, null, null, null, null, 10);

        for (final Build build : builds) {
            System.out.println(StringUtil.pad(build.getId(), 8) + '\t' + build.getBuildNumber());
        }
        System.out.println(builds.size());

        final Build build = buildClient.getBuild(107853, null);
        System.out.println(StringUtil.pad(build.getId(), 8) + '\t' + build.getBuildNumber());
    }

}
