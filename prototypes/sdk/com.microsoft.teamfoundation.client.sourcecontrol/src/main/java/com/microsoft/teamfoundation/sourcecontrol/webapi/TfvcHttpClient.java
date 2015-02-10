package com.microsoft.teamfoundation.sourcecontrol.webapi;

import java.net.URI;

import javax.ws.rs.client.Client;

public class TfvcHttpClient
    extends TfvcHttpClientBase {

    public TfvcHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

}
