package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.build.webapi.model.Build;
import com.microsoft.vss.client.core.utils.StringUtil;

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

        final Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, -1);

        final List<Build> builds =
            buildClient.getBuilds(projectId, null, null, null, calendar.getTime(), null, null, null, null, null, null,
                null, null, 10, null);

        System.out.println(builds.size() + " build(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final Build build : builds) {
            printBuild(build);
        }
        System.out.println(builds.size());
    }

    public void testGet_02(final String projectName, final int buildId) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        final Build build = buildClient.getBuild(projectName, buildId, null);
        printBuild(build);
    }

    private void printBuild(final Build build) {
        System.out.println("          Id = " + StringUtil.pad(build.getId(), 8)); //$NON-NLS-1$
        System.out.println(" BuildNumber = " + build.getBuildNumber()); //$NON-NLS-1$
        System.out.println("         Uri = " + build.getUri()); //$NON-NLS-1$
        System.out.println("      Result = " + build.getResult()); //$NON-NLS-1$
        System.out.println("      Status = " + build.getStatus()); //$NON-NLS-1$
    }
}
