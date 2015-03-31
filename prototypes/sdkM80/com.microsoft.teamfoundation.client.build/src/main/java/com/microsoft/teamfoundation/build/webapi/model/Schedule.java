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

public class Schedule {

    private List<String> branchFilters;
    private ScheduleDays daysToBuild;
    private UUID scheduleJobId;
    private int startHours;
    private int startMinutes;
    private String timeZoneId;

    /**
     * Getter for BranchFilters
     * @return List<String>
     */
    public List<String> getBranchFilters() {
        return branchFilters;
    }

    /**
     * Setter for BranchFilters
     * @param branchFilters
     */
    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }

    /**
     * Getter for DaysToBuild
     * @return ScheduleDays
     */
    public ScheduleDays getDaysToBuild() {
        return daysToBuild;
    }

    /**
     * Setter for DaysToBuild
     * @param daysToBuild
     */
    public void setDaysToBuild(final ScheduleDays daysToBuild) {
        this.daysToBuild = daysToBuild;
    }

    /**
     * Getter for ScheduleJobId
     * @return UUID
     */
    public UUID getScheduleJobId() {
        return scheduleJobId;
    }

    /**
     * Setter for ScheduleJobId
     * @param scheduleJobId
     */
    public void setScheduleJobId(final UUID scheduleJobId) {
        this.scheduleJobId = scheduleJobId;
    }

    /**
     * Getter for StartHours
     * @return int
     */
    public int getStartHours() {
        return startHours;
    }

    /**
     * Setter for StartHours
     * @param startHours
     */
    public void setStartHours(final int startHours) {
        this.startHours = startHours;
    }

    /**
     * Getter for StartMinutes
     * @return int
     */
    public int getStartMinutes() {
        return startMinutes;
    }

    /**
     * Setter for StartMinutes
     * @param startMinutes
     */
    public void setStartMinutes(final int startMinutes) {
        this.startMinutes = startMinutes;
    }

    /**
     * Getter for TimeZoneId
     * @return String
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Setter for TimeZoneId
     * @param timeZoneId
     */
    public void setTimeZoneId(final String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}
