/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.build.webapi.events.model;

import com.microsoft.teamfoundation.build.webapi.events.model.RealtimeBuildEvent;
import com.microsoft.teamfoundation.build.webapi.model.TimelineRecord;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TimelineRecordsUpdatedEvent
    extends RealtimeBuildEvent {

    private List<TimelineRecord> timelineRecords;

    public List<TimelineRecord> getTimelineRecords() {
        return timelineRecords;
    }

    public void setTimelineRecords(final List<TimelineRecord> timelineRecords) {
        this.timelineRecords = timelineRecords;
    }
}
