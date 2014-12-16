package com.microsoft.tfs.sdk.build.model.enumeration;

import java.util.EnumSet;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildReason {
    None(0),
    Manual(1),
    IndividualCI(2),
    BatchedCI(4),
    Schedule(8),
    ScheduleForced(16),
    UserCreated(32),
    ValidateShelveset(64),
    CheckInShelveset(128),
    //keep those two values in case server returns them in REST call, for all other client side logic, should use the enumSet provided
    Triggered(Manual.reason | IndividualCI.reason | BatchedCI.reason | Schedule.reason | ScheduleForced.reason | UserCreated.reason | CheckInShelveset.reason),
    All(Manual.reason | IndividualCI.reason | BatchedCI.reason | Schedule.reason | ScheduleForced.reason | UserCreated.reason | ValidateShelveset.reason | CheckInShelveset.reason);

    private int reason;
    BuildReason(int reason) {
        this.reason = reason;
    }

    public EnumSet<BuildReason> getTriggeredReasons() {
        return EnumSet.of(Manual, IndividualCI, BatchedCI, Schedule, ScheduleForced, UserCreated, CheckInShelveset);
    }

    public EnumSet<BuildReason> getAllReasons() {
        return EnumSet.of(Manual, IndividualCI, BatchedCI, Schedule, ScheduleForced, UserCreated, ValidateShelveset, CheckInShelveset);
    }
}
