package com.microsoft.vss.client.test.build;

import java.net.URI;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.build.BuildHttpClient;
import com.microsoft.vss.client.test.TestBase;

public class BuildBase
    extends TestBase {

    protected final BuildHttpClient buildClient;

    public BuildBase(final Client client, final URI uri) {
        buildClient = new BuildHttpClient(client, uri);
    }

}
