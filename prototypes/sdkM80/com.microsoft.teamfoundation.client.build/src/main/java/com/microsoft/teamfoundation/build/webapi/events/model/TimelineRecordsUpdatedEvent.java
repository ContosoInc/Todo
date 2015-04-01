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

public class TimelineRecordsUpdatedEvent
    extends RealtimeBuildEvent {

    private List<TimelineRecord> timelineRecords;

    /**
     * Getter for TimelineRecords
     * @return List<TimelineRecord>
     */
    public List<TimelineRecord> getTimelineRecords() {
        return timelineRecords;
    }

    /**
     * Setter for TimelineRecords
     * @param timelineRecords
     */
    public void setTimelineRecords(final List<TimelineRecord> timelineRecords) {
        this.timelineRecords = timelineRecords;
    }
}