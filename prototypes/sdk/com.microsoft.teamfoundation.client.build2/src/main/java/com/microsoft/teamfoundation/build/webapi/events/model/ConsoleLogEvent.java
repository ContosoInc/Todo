/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.events.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsoleLogEvent
    extends RealtimeBuildEvent {

    private List<String> lines;
    private UUID timelineId;
    private UUID timelineRecordId;

    public List<String> getLines() {
        return lines;
    }

    public void setLines(final List<String> lines) {
        this.lines = lines;
    }

    public UUID getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(final UUID timelineId) {
        this.timelineId = timelineId;
    }

    public UUID getTimelineRecordId() {
        return timelineRecordId;
    }

    public void setTimelineRecordId(final UUID timelineRecordId) {
        this.timelineRecordId = timelineRecordId;
    }
}
