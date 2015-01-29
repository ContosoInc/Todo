package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.distributedtask.model.enumeration.TimelineRecordState;

public class TimelineRecord {
    public UUID id;
    public UUID parentId;
    @JsonProperty("type")
    public String recordType;
    public String name;
    public Date startTime;
    public Date finishTime;
    public String currentOperation;
    public int percentComplete;
    public TimelineRecordState state;
    public TaskResult result;
    public String resultCode;
    public int changeId;
    public Date lastModified;
    public String workerName;
    public int order;
    public TaskLogReference log;
    public TimelineReference details;
    public int errorCount;
    public int warningCount;
    public List<Issue> issues = new ArrayList<Issue>();
    public URI location;

}
