package com.microsoft.vss.client.test;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.test.build.BuildArtifactTests;
import com.microsoft.vss.client.test.build.BuildDefinitionTests;
import com.microsoft.vss.client.test.build.BuildTests;
import com.microsoft.vss.client.test.git.GitTests;
import com.microsoft.vss.client.test.project.ProjectTests;

public class Main {

    public static void main(String[] args)
        throws URISyntaxException {

        // arTests();
        dfTests();
        // vsoTests();

    }

    public static void dfTests()
        throws URISyntaxException {

        final Client client = JaxrsUtil.getClient(JaxrsUtil.getDfCredentials());
        final URI baseUri = JaxrsUtil.dfUri;

        ProjectTests projectTests = null;
        BuildTests buildTests = null;
        BuildArtifactTests artifactTests = null;
        BuildDefinitionTests definitionTests = null;
        GitTests gitTests = null;

        try {
            projectTests = new ProjectTests(client, baseUri);

            projectTests.testGet_01();
            projectTests.testGet_02();

            projectTests.testGet_03("gitTest_05"); //$NON-NLS-1$
            projectTests.testGet_04("gitTest_01"); //$NON-NLS-1$
            projectTests.testGet_04("tfsTest_01"); //$NON-NLS-1$
            projectTests.testGet_05("gitTest_02"); //$NON-NLS-1$

            projectTests.testUpdate_01("gitTest_01", "mkn sdhsdhsdhsdhdf ashgagha"); //$NON-NLS-1$ //$NON-NLS-2$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            buildTests = new BuildTests(client, baseUri);

            buildTests.testGet_01("gitTest_01"); //$NON-NLS-1$
            buildTests.testGet_02(1);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            artifactTests = new BuildArtifactTests(client, baseUri);

            artifactTests.testGet_01(1);
            artifactTests.testGet_02(1);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            definitionTests = new BuildDefinitionTests(client, baseUri);

            definitionTests.testGet_01("gitTest_01"); //$NON-NLS-1$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            gitTests = new GitTests(client, baseUri);

            gitTests.testGet_01();
            gitTests.testGet_02("gitTest_01"); //$NON-NLS-1$
            gitTests.testGet_03("gitTest_01", "gitTest_01"); //$NON-NLS-1$ //$NON-NLS-2$
            gitTests.testGet_04("gitTest_01", "gitTest_01"); //$NON-NLS-1$ //$NON-NLS-2$
            gitTests.testGet_05("gitTest_01", "gitTest_01"); //$NON-NLS-1$ //$NON-NLS-2$

            gitTests.testPatch_01("gitTest_01", "gitTest_01", "newTest_01"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

            gitTests.testPost_01("gitTest_01", "gitTest_01"); //$NON-NLS-1$ //$NON-NLS-2$
            gitTests.testPost_02("gitTest_01", "gitTest_01", "/ConsoleApplication1"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            gitTests.testPost_02("gitTest_01", "gitTest_01", "/ConsoleApplication1/ConsoleApplication1.sln"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        client.close();
    }

    public static void arTests()
        throws URISyntaxException {

        final Client client = JaxrsUtil.getClient(JaxrsUtil.getArCredentials());
        final URI baseUri = JaxrsUtil.arUri;

        ProjectTests projectTests = null;
        BuildTests buildTests = null;
        BuildArtifactTests artifactTests = null;
        BuildDefinitionTests definitionTests = null;

        try {
            projectTests = new ProjectTests(client, baseUri);

            projectTests.testGet_01();
            projectTests.testGet_02();

            projectTests.testGet_03("gitTest_05"); //$NON-NLS-1$
            projectTests.testGet_04("gitTest_01"); //$NON-NLS-1$
            projectTests.testGet_04("tfsTest_01"); //$NON-NLS-1$
            projectTests.testGet_05("gitTest_02"); //$NON-NLS-1$

            projectTests.testUpdate_01("gitTest_01", "mkn sdhsdhsdhsdhdf ashgagha"); //$NON-NLS-1$ //$NON-NLS-2$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            buildTests = new BuildTests(client, baseUri);

            buildTests.testGet_01("gitTest_01"); //$NON-NLS-1$
            buildTests.testGet_02(1);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            artifactTests = new BuildArtifactTests(client, baseUri);

            artifactTests.testGet_01(1);
            artifactTests.testGet_02(1);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            definitionTests = new BuildDefinitionTests(client, baseUri);

            definitionTests.testGet_01("gitTest_01"); //$NON-NLS-1$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        client.close();
    }

    public static void vsoTests()
        throws URISyntaxException {

        final Client client = JaxrsUtil.getClient(JaxrsUtil.getVsoCredentials());
        final URI baseUri = JaxrsUtil.vsoUri;

        ProjectTests projectTests = null;
        BuildTests buildTests = null;
        BuildArtifactTests artifactTests = null;
        BuildDefinitionTests definitionTests = null;

        try {
            projectTests = new ProjectTests(client, baseUri);

            projectTests.testGet_01();
            projectTests.testGet_02();

            projectTests.testGet_03("VSOnline"); //$NON-NLS-1$
            projectTests.testGet_04("VSOnline"); //$NON-NLS-1$
            projectTests.testGet_05("VSOnline"); //$NON-NLS-1$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            buildTests = new BuildTests(client, baseUri);

            buildTests.testGet_01("VSOnline"); //$NON-NLS-1$
            buildTests.testGet_02(112484);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            artifactTests = new BuildArtifactTests(client, baseUri);

            artifactTests.testGet_01(112484);
            artifactTests.testGet_02(112484);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            definitionTests = new BuildDefinitionTests(client, baseUri);

            definitionTests.testGet_01("VSOnline"); //$NON-NLS-1$
            definitionTests.testGet_02("VSOnline", "VSO.CI"); //$NON-NLS-1$ //$NON-NLS-2$

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        client.close();
    }
}
