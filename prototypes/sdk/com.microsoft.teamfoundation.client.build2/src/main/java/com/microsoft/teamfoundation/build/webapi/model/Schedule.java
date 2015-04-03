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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.ScheduleDays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Schedule {

    private List<String> branchFilters;
    private ScheduleDays daysToBuild;
    private UUID scheduleJobId;
    private int startHours;
    private int startMinutes;
    private String timeZoneId;

    public List<String> getBranchFilters() {
        return branchFilters;
    }

    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }

    public ScheduleDays getDaysToBuild() {
        return daysToBuild;
    }

    public void setDaysToBuild(final ScheduleDays daysToBuild) {
        this.daysToBuild = daysToBuild;
    }

    public UUID getScheduleJobId() {
        return scheduleJobId;
    }

    public void setScheduleJobId(final UUID scheduleJobId) {
        this.scheduleJobId = scheduleJobId;
    }

    public int getStartHours() {
        return startHours;
    }

    public void setStartHours(final int startHours) {
        this.startHours = startHours;
    }

    public int getStartMinutes() {
        return startMinutes;
    }

    public void setStartMinutes(final int startMinutes) {
        this.startMinutes = startMinutes;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(final String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}
