package com.microsoft.tfs.sdk.build.impl;

import com.microsoft.tfs.sdk.build.BuildClient;
import com.microsoft.tfs.sdk.build.model.Build;
import com.microsoft.tfs.sdk.core.PathUtils;
import com.microsoft.tfs.sdk.core.RESTClient;

import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Created by yacao on 12/12/2014.
 */
public class BuildClientImpl implements BuildClient {

    private final URI baseUrl;
    private final RESTClient client;
    private final PathUtils pathUtils;

    public BuildClientImpl(String baseUrl, RESTClient client) throws URISyntaxException {
        this.baseUrl = new URI(baseUrl);
        this.client = client;
        this.pathUtils = new PathUtils();
    }

    @Override
    public Build getBuild(int id, Map<String, List<String>> queryParams) {

        URI uri = pathUtils.combinePath(baseUrl,
                Arrays.asList(PathConstants.SUB_AREA, PathConstants.BUILDS, Integer.toString(id)),
                (queryParams != null) ? queryParams : Collections.EMPTY_MAP);

        Build build = client.get(uri, Build.class);

        return build;
    }

    @Override
    public List<Build> getBuilds() {
        return null;
    }
}
