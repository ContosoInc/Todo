package com.microsoft.vss.client.test;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.test.build.Builds;
import com.microsoft.vss.client.test.project.Project;
import com.microsoft.vss.client.test.project.Projects;

public class Main {

    public static void main(String[] args)
        throws URISyntaxException {

        final Client client = JaxrsUtil.getClient(JaxrsUtil.getArCredentials());
        final URI baseUri = JaxrsUtil.arUri;

        try (final Project tests = new Project(client, baseUri)) {

            tests.testGet_01("gitTest_05"); //$NON-NLS-1$
            tests.testGet_02("gitTest_01"); //$NON-NLS-1$
            tests.testGet_02("tfsTest_01"); //$NON-NLS-1$
            tests.testGet_03("gitTest_02"); //$NON-NLS-1$

            // tests.BuildRestTest_01(client, JaxrsUtil.vsoUri);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (final Projects tests = new Projects(client, baseUri)) {

            tests.testGet_01();
            tests.testGet_02();

            // tests.BuildRestTest_01(client, JaxrsUtil.vsoUri);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (final Builds tests = new Builds(client, baseUri)) {

            tests.testGet_01();

            // tests.BuildRestTest_01(client, JaxrsUtil.vsoUri);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        client.close();
    }
}
