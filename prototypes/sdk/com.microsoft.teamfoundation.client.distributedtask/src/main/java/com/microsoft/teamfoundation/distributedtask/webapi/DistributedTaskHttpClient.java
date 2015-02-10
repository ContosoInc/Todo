package com.microsoft.teamfoundation.distributedtask.webapi;

import java.net.URI;

import javax.ws.rs.client.Client;

public class DistributedTaskHttpClient
    extends DistributedTaskHttpClientBase {

    public DistributedTaskHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

}
