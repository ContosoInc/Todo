package com.microsoft.tfs.plugin.impl;

import com.microsoft.tfs.plugin.TfsClientFactory;
import com.microsoft.vss.client.core.model.VssServiceException;
import hudson.util.Secret;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by yacao on 3/27/2015.
 */
public class TfsClientFactoryImpl implements TfsClientFactory {

    public static enum ServiceProvider {
        TFS,
        VSO
    }

    public TfsClient getValidatedClient(String url, String username, Secret password) throws URISyntaxException, VssServiceException {
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

    /*
     * Best educated guess about whether this is an onPrem installation
     *
     * This is only an optimization about what method try first, should never rely on it solely
     */
    private boolean guessIsOnPremInstallation(URI uri) {
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
