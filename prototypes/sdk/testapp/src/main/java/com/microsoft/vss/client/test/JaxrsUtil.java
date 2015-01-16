package com.microsoft.vss.client.test;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

public abstract class JaxrsUtil {

    final static URI arUri = getBaseUri("https://arukhlin.visualstudio.com/DefaultCollection"); //$NON-NLS-1$
    final static URI vsoUri = getBaseUri("https://mseng.visualstudio.com/DefaultCollection"); //$NON-NLS-1$

    public static Client getClient(final Credentials credentials) {
        CredentialsProvider credentialsProvider = getBasicCredentialsProvider(credentials);

        ClientConfig clientConfig = new ClientConfig().connectorProvider(new ApacheConnectorProvider());
        clientConfig.property(ApacheClientProperties.CREDENTIALS_PROVIDER, credentialsProvider);
        clientConfig.property(ApacheClientProperties.PREEMPTIVE_BASIC_AUTHENTICATION, true);

        /*
         * !!!!!!!! Define Fiddler as a local HTTP proxy !!!!!!!!!!!!
         */
        clientConfig.property(ClientProperties.PROXY_URI, "http://127.0.0.1:8888"); //$NON-NLS-1$
        clientConfig.property(ApacheClientProperties.SSL_CONFIG, getSslConfigurator());
        /*
         * !!!!!!!! Comment out two lines above if you do not use Fiddler
         * !!!!!!!!!!!!
         */

        final Client client = ClientBuilder.newClient(clientConfig);

        return client;
    }

    private static SslConfigurator getSslConfigurator() {
        final SslConfigurator sslConfig = SslConfigurator.newInstance().trustStoreFile("c:\\FiddlerKeystore.jks") //$NON-NLS-1$
        .trustStorePassword("ideafix") //$NON-NLS-1$
        .trustStoreType("JKS") //$NON-NLS-1$
        .trustManagerFactoryAlgorithm("PKIX") //$NON-NLS-1$
        .securityProtocol("SSL"); //$NON-NLS-1$

        return sslConfig;
    }

    private static CredentialsProvider getBasicCredentialsProvider(final Credentials credentials) {
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, credentials);

        return credentialsProvider;
    }

    public static URI getBaseUri(final String uri) {
        try {
            return new URI(uri);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public static Credentials getAlternativeCredentials(final String user, final String password) {
        final Credentials vsoCredentials = new UsernamePasswordCredentials(user, password);
        return vsoCredentials;
    }

    public static Credentials getVsoCredentials() {
        return getAlternativeCredentials("alexr", "LinLinLin1"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public static Credentials getArCredentials() {
        return getAlternativeCredentials("alexrukhlin", "LinLinLin1"); //$NON-NLS-1$ //$NON-NLS-2$
    }
}
