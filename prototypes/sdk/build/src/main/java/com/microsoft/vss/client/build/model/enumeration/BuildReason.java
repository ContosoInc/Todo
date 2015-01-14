package com.microsoft.vss.client.build.model.enumeration;

import java.util.EnumSet;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildReason {
    None(0), Manual(1), IndividualCI(2), BatchedCI(4), Schedule(8), ScheduleForced(16), UserCreated(32),
    ValidateShelveset(64), CheckInShelveset(128),
    // keep those two values in case server returns them in REST call, for all
    // other client side logic, should use the enumSet provided
    Triggered(Manual.value | IndividualCI.value | BatchedCI.value | Schedule.value | ScheduleForced.value
        | UserCreated.value | CheckInShelveset.value), All(Manual.value | IndividualCI.value | BatchedCI.value
        | Schedule.value | ScheduleForced.value | UserCreated.value | ValidateShelveset.value | CheckInShelveset.value);

    private final int value;

    BuildReason(int value) {
        this.value = value;
    }

    public EnumSet<BuildReason> getTriggeredReasons() {
        return EnumSet.of(Manual, IndividualCI, BatchedCI, Schedule, ScheduleForced, UserCreated, CheckInShelveset);
    }

    public EnumSet<BuildReason> getAllReasons() {
        return EnumSet.of(Manual, IndividualCI, BatchedCI, Schedule, ScheduleForced, UserCreated, ValidateShelveset,
            CheckInShelveset);
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
