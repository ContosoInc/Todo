package com.microsoft.vss.client.test.jaxrs;

import java.util.List;
import java.util.Map.Entry;

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
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;

import com.microsoft.vss.client.core.jaxrs.ApiResourceEntityProvider;
import com.microsoft.vss.client.core.model.ApiResourceLocationCollection;

public class LowLevelTests {

    //   @formatter:off    
////////////////////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////                          ////////////////////////////////////////////
//////////////////////////     Low level tests      ////////////////////////////////////////////
//////////////////////////                          ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
    //    @formatter:on
    public void restCall() {

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
}
