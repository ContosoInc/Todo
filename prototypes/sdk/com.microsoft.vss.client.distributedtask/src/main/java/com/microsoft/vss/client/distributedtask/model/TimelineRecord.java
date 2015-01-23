package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.distributedtask.model.enumeration.TimelineRecordState;

public class TimelineRecord {
    public UUID Id;
    public UUID ParentId;
    @JsonProperty("Type")
    public String RecordType;
    public String Name;
    public Date StartTime;
    public Date FinishTime;
    public String CurrentOperation;
    public int PercentComplete;
    public TimelineRecordState State;
    public TaskResult Result;
    public String ResultCode;
    public int ChangeId;
    public Date LastModified;
    public String WorkerName;
    public int Order;
    public TaskLogReference Log;
    public TimelineReference Details;
    public int ErrorCount;
    public int WarningCount;
    public List<Issue> Issues = new ArrayList<Issue>();
    public URI Location;

}
