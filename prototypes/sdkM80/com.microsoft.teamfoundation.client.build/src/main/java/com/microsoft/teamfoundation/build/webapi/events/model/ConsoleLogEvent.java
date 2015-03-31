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

public class ConsoleLogEvent
    extends RealtimeBuildEvent {

    private List<String> lines;
    private UUID timelineId;
    private UUID timelineRecordId;

    /**
     * Getter for Lines
     * @return List<String>
     */
    public List<String> getLines() {
        return lines;
    }

    /**
     * Setter for Lines
     * @param lines
     */
    public void setLines(final List<String> lines) {
        this.lines = lines;
    }

    /**
     * Getter for TimelineId
     * @return UUID
     */
    public UUID getTimelineId() {
        return timelineId;
    }

    /**
     * Setter for TimelineId
     * @param timelineId
     */
    public void setTimelineId(final UUID timelineId) {
        this.timelineId = timelineId;
    }

    /**
     * Getter for TimelineRecordId
     * @return UUID
     */
    public UUID getTimelineRecordId() {
        return timelineRecordId;
    }

    /**
     * Setter for TimelineRecordId
     * @param timelineRecordId
     */
    public void setTimelineRecordId(final UUID timelineRecordId) {
        this.timelineRecordId = timelineRecordId;
    }
}
