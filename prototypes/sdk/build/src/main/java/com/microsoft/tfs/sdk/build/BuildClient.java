package com.microsoft.tfs.sdk.build;

import com.microsoft.tfs.sdk.build.model.Build;
import com.microsoft.tfs.sdk.core.RESTClient;

import java.util.List;
import java.util.Map;

/**
 * Created by yacao on 12/11/2014.
 */
public interface BuildClient {

    public Build getBuild(int id, Map<String, List<String>> queryParams);
    public List<Build> getBuilds();

}
