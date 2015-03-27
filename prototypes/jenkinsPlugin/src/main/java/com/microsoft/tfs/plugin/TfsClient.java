package com.microsoft.tfs.plugin;

import com.microsoft.teamfoundation.core.webapi.model.TeamProjectReference;
import com.microsoft.vss.client.core.model.VssServiceException;
import hudson.Util;
import hudson.util.Secret;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.RequestEntityProcessing;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Logger;

import com.microsoft.teamfoundation.build.webapi.BuildHttpClient;
import com.microsoft.teamfoundation.core.webapi.CoreHttpClient;
import com.microsoft.teamfoundation.distributedtask.webapi.DistributedTaskHttpClient;

/**
 * This class encapsulates all REST calls to TFS.
 *
 * The http connection uses basic auth to authenticate.
 */
public class TfsClient {
    private static final Logger logger = Logger.getLogger(TfsClient.class.getName());

    public static enum ServiceProvider {
        TFS,
        VSO
    }

    public static final String PROXY_URL_PROPERTY = "proxy_url";
    public static final String KEYSTORE_PATH_PROPERTY = "keystore_path";
    public static final String KEYSTORE_PASSWORD_PROPERTY = "keystore_password";
    public static final String TRUST_STORE_TYPE_PROPERTY = "trust_store_type";
    public static final String TRUST_MANAGER_FACTORY_ALGORITHM_PROPERTY = "trust_manager_factory_algorithm";
    public static final String SECURITY_PROTOCOL_PROPERTY = "security_protocol";

    private BuildHttpClient buildClient;
    private CoreHttpClient projectClient;
    private DistributedTaskHttpClient distributedTaskHttpClient;

    /**
     * Create a new REST client for TFS and verify it works
     *
     * If a valid client can not be constructed, will throw exception
     *
     * @param url TFS collection level url
     * @param username
     * @param password
     * @return new REST TFS client
     * @throws URISyntaxException
     */
    public static TfsClient newValidatedClient(String url, String username, Secret password) throws URISyntaxException, VssServiceException {
        URI uri = new URI(url);
        ServiceProvider provider = guessIsOnPremInstallation(uri) ? ServiceProvider.TFS : ServiceProvider.VSO;

        TfsClient client = null;
        try {
            client = new TfsClient(uri, provider, username, password);
            // if this returns without throwing VssServiceException, client is working
            client.getProjectClient().getProjects();
        } catch (VssServiceException vse){
            provider = (provider == ServiceProvider.TFS) ? ServiceProvider.VSO : ServiceProvider.TFS;

            client = new TfsClient(uri, provider, username, password);
            client.getProjectClient().getProjects();
        }

        return client;
    }

    /**
     * get Build subarea client
     */
    public BuildHttpClient getBuildClient() {
        return buildClient;
    }

    /**
     * get Project subarea client
     */
    public CoreHttpClient getProjectClient() {
        return projectClient;
    }

    /**
     * get DistributedTask subarea client
     */
    public DistributedTaskHttpClient getDistributedTaskHttpClient() {
        return distributedTaskHttpClient;
    }

    /*
     * Creating a apache http client based JAX-RS client
     */
    private Client getClient(URI uri, ServiceProvider provider, String username, Secret password) {
        ClientConfig clientConfig = new ClientConfig();

        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();

        if (ServiceProvider.TFS == provider) {
            /* NTLM auth for on premise installation */
            credentialsProvider.setCredentials(
                    new AuthScope(uri.getHost(), uri.getPort(), AuthScope.ANY_REALM, AuthSchemes.NTLM),
                    new NTCredentials(username, Secret.toString(password), uri.getHost(), ""));
            logger.info("Using NTLM authentication for on premise TeamFoundationServer");

        }  else if (ServiceProvider.VSO == provider) {
            // Basic Auth for VSO services
            credentialsProvider.setCredentials(
                    new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
                    new UsernamePasswordCredentials(username, Secret.toString(password)));
            logger.info("Using user/pass authentication for Visual Studio Online services");

            // also need to preemptively send basic auth header, or we will be redirected for oauth login
            clientConfig.property(ApacheClientProperties.PREEMPTIVE_BASIC_AUTHENTICATION, true);
        }

        clientConfig.property(ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.BUFFERED);

        if (System.getProperty(PROXY_URL_PROPERTY) != null) {
            clientConfig.property(ClientProperties.PROXY_URI, System.getProperty(PROXY_URL_PROPERTY));
            clientConfig.property(ApacheClientProperties.SSL_CONFIG, getSslConfigurator());
        }

        clientConfig.property(ApacheClientProperties.CREDENTIALS_PROVIDER, credentialsProvider);
        clientConfig.connectorProvider(new ApacheConnectorProvider());

        return ClientBuilder.newClient(clientConfig);
    }

    /*
     * Setting up ssl proxy
     */
    private static SslConfigurator getSslConfigurator() {
        String keystorePath = System.getProperty(KEYSTORE_PATH_PROPERTY);
        String keystorePassword = System.getProperty(KEYSTORE_PASSWORD_PROPERTY);

        String trustStoreType = System.getProperty(TRUST_STORE_TYPE_PROPERTY);
        if (Util.fixEmptyAndTrim(trustStoreType) == null) {
            trustStoreType = "JKS";
        }

        String trustManagerFactoryAlgorithm = System.getProperty(TRUST_MANAGER_FACTORY_ALGORITHM_PROPERTY);
        if (Util.fixEmptyAndTrim(trustManagerFactoryAlgorithm) == null) {
            trustManagerFactoryAlgorithm = "PKIX";
        }

        String securityProtocol = System.getProperty(SECURITY_PROTOCOL_PROPERTY);
        if (Util.fixEmptyAndTrim(securityProtocol) == null) {
            securityProtocol = "SSL";
        }

        final SslConfigurator sslConfig = SslConfigurator.newInstance().trustStoreFile(keystorePath)
                .trustStorePassword(keystorePassword)
                .trustStoreType(trustStoreType)
                .trustManagerFactoryAlgorithm(trustManagerFactoryAlgorithm)
                .securityProtocol(securityProtocol);

        return sslConfig;
    }

    /*
     * Creating a tfs client
     */
    private TfsClient(URI uri, ServiceProvider provider, String username, Secret password) {
        Client client = getClient(uri, provider, username, password);

        projectClient = new CoreHttpClient(client, uri);
        buildClient = new BuildHttpClient(client, uri);
        distributedTaskHttpClient = new DistributedTaskHttpClient(client, uri);
    }


    /*
     * Best educated guess about whether this is an onPrem installation
     *
     * This is only an optimization about what method try first, should never rely on it solely
     */
    private static boolean guessIsOnPremInstallation(URI uri) {
        if (uri == null) {
            return false;
        }

        String host = uri.getHost().toLowerCase();
        if (host.endsWith("visualstudio.com") || host.endsWith(".tfsallin.net")) {
            return false;
        }

        return true;
    }

}
