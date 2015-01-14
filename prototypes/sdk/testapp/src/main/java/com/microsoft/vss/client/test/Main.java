package com.microsoft.vss.client.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;

import com.microsoft.vss.client.build.BuildHttpClient;
import com.microsoft.vss.client.build.model.Build;
import com.microsoft.vss.client.core.StringUtil;
import com.microsoft.vss.client.core.jaxrs.ApiResourceEntityProvider;
import com.microsoft.vss.client.core.model.ApiResourceLocationCollection;
import com.microsoft.vss.client.core.model.TeamProjectReference;
import com.microsoft.vss.client.project.ProjectHttpClient;

public class Main
    implements AutoCloseable {

    public static void main(String[] args)
        throws URISyntaxException {

        final URI arUri = new URI("https://arukhlin.visualstudio.com/DefaultCollection"); //$NON-NLS-1$
        final URI vsoUri = new URI("https://mseng.visualstudio.com/DefaultCollection"); //$NON-NLS-1$

        try (final Main tests = new Main()) {
            final Client client = tests.getClient();

            tests.ProjectRestTest_01(client, vsoUri);

            tests.BuildRestTest_01(client, vsoUri);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void ProjectRestTest_01(final Client client, final URI uri) {
        ProjectHttpClient projectClient = new ProjectHttpClient(client, uri);

        final List<TeamProjectReference> projects = projectClient.getProjects();

        for (final TeamProjectReference p : projects) {
            System.out.println(p.getId().toString() + '\t' + p.getName());
        }

        System.out.println(projects.size());
    }

    private void BuildRestTest_01(final Client client, final URI uri) {
        BuildHttpClient buildClient = new BuildHttpClient(client, uri);

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

    private Client getClient() {
        CredentialsProvider credentialsProvider = getBasicCredentialsProvider();

        ClientConfig clientConfig = new ClientConfig().connectorProvider(new ApacheConnectorProvider());
        clientConfig.property(ApacheClientProperties.CREDENTIALS_PROVIDER, credentialsProvider);
        clientConfig.property(ApacheClientProperties.PREEMPTIVE_BASIC_AUTHENTICATION, true);

        final Client client = ClientBuilder.newClient(clientConfig);

        return client;
    }

    private CredentialsProvider getBasicCredentialsProvider() {
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, getBasicCredentials());

        return credentialsProvider;
    }

    private Credentials getBasicCredentials() {
        final Credentials arCredentials = new UsernamePasswordCredentials("alexrukhlin", "LinLinLin1"); //$NON-NLS-1$ //$NON-NLS-2$
        final Credentials vsoCredentials = new UsernamePasswordCredentials("alexr", "LinLinLin1"); //$NON-NLS-1$ //$NON-NLS-2$
        return vsoCredentials;
    }

    //   @formatter:off    
////////////////////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////     Low level tests      ////////////////////////////////////////////
//////////////////////////                          ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
    //    @formatter:on
    private void RestCall() {

        ClientConfig clientConfig = new ClientConfig().connectorProvider(new ApacheConnectorProvider());

        final Client client = ClientBuilder.newClient(clientConfig);
        final WebTarget target = client.target("https://arukhlin.visualstudio.com/DefaultCollection/_apis"); //$NON-NLS-1$

        /*
         * final JerseyClient jerseyClient = (JerseyClient) client; final
         * ApacheConnectorProvider connectorProvider = (ApacheConnectorProvider)
         * jerseyClient.getConfiguration().getConnectorProvider();
         */
        final Builder builder =
            target.register(ApiResourceEntityProvider.class).request().accept(
                "application/json;api-version=2.0-preview.2"); //$NON-NLS-1$

        MultivaluedMap<String, String> headers = getHeaders();
        for (final Entry<String, List<String>> e : headers.entrySet()) {
            for (final String value : e.getValue()) {
                builder.header(e.getKey(), value);
            }
        }

        final Response response = builder.options();

        MediaType m = response.getMediaType();
        System.out.println(m);
        StatusType s = response.getStatusInfo();
        System.out.println(s);

        /*
         * String t = response.readEntity(String.class);
         * ApiResourceLocationCollection c = null;
         */

        ApiResourceLocationCollection c = response.readEntity(ApiResourceLocationCollection.class);

        if (c != null) {
            System.out.println(c);
        }
    }

    private MultivaluedMap<String, String> getHeaders() {

        final MultivaluedMap<String, String> headers = new MultivaluedHashMap<String, String>();

        addAuthorizationHeader(headers);

        return headers;
    }

    private void addAuthorizationHeader(MultivaluedMap<String, String> headers) {
        String AUTHORIZATION_HEADER = "Authorization"; //$NON-NLS-1$
        String userName = "alexrukhlin"; //$NON-NLS-1$
        String password = "LinLinLin1"; //$NON-NLS-1$

        String data = userName + ":" + password; //$NON-NLS-1$
        String encodedCredential = new String(Base64.encodeBase64(data.getBytes()));
        String basicAuthHeader = String.format("Basic %s", encodedCredential); //$NON-NLS-1$

        headers.add(AUTHORIZATION_HEADER, basicAuthHeader);
    }

    @Override
    public void close()
        throws Exception {
        // TODO Auto-generated method stub

    }
}
