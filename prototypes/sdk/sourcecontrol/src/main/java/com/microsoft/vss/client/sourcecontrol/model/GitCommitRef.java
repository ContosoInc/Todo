package com.microsoft.vss.client.sourcecontrol.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.microsoft.vss.client.core.model.ReferenceLinks;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.VersionControlChangeType;

public class GitCommitRef {
    public String commitId;
    public GitUserDate author;
    public GitUserDate committer;
    public String comment;
    public boolean commentTruncated;
    public Map<VersionControlChangeType, Integer> changeCounts = new HashMap<VersionControlChangeType, Integer>();
    public List<GitChange> changes;
    public List<String> parents;
    public String url;
    public String remoteUrl;
    public ReferenceLinks links;

}
