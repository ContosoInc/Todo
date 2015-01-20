package com.microsoft.vss.client.test;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.test.build.BuildArtifactTests;
import com.microsoft.vss.client.test.build.BuildDefinitionTests;
import com.microsoft.vss.client.test.build.BuildTests;
import com.microsoft.vss.client.test.project.ProjectTests;

public class Main {

    public static void main(String[] args)
        throws URISyntaxException {

        final Client client = JaxrsUtil.getClient(JaxrsUtil.getArCredentials());
        final URI baseUri = JaxrsUtil.arUri;

        try (final ProjectTests tests = new ProjectTests(client, baseUri)) {

            tests.testGet_01();
            tests.testGet_02();

            tests.testGet_03("gitTest_05"); //$NON-NLS-1$
            tests.testGet_04("gitTest_01"); //$NON-NLS-1$
            tests.testGet_04("tfsTest_01"); //$NON-NLS-1$
            tests.testGet_05("gitTest_02"); //$NON-NLS-1$

            tests.testUpdate_01("gitTest_01", "mkn sdhsdhsdhsdhdf ashgagha"); //$NON-NLS-1$ //$NON-NLS-2$

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (final BuildTests tests = new BuildTests(client, baseUri)) {

            tests.testGet_01("gitTest_01"); //$NON-NLS-1$
            tests.testGet_02(0);

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (final BuildArtifactTests tests = new BuildArtifactTests(client, baseUri)) {

            tests.testGet_01(0);
            tests.testGet_02(0);

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (final BuildDefinitionTests tests = new BuildDefinitionTests(client, baseUri)) {

            tests.testGet_01(""); //$NON-NLS-1$

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        client.close();
    }
}
