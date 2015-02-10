/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

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

public class Schedule {

    private String timeZoneId;
    private ScheduleDays utcDaysToBuild;
    private int utcStartTime;

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(final String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public ScheduleDays getUtcDaysToBuild() {
        return utcDaysToBuild;
    }

    public void setUtcDaysToBuild(final ScheduleDays utcDaysToBuild) {
        this.utcDaysToBuild = utcDaysToBuild;
    }

    public int getUtcStartTime() {
        return utcStartTime;
    }

    public void setUtcStartTime(final int utcStartTime) {
        this.utcStartTime = utcStartTime;
    }
}
