package com.microsoft.vss.client.build.model.enumeration;

public enum DefinitionTriggerType {
    /**
     * Manual builds only.
     */
    None(1),

    /**
     * A build should be started for each changeset.
     */
    ContinuousIntegration(2),

    /**
     * A build should be started for multiple changesets at a time at a
     * specified interval.
     */
    BatchedContinuousIntegration(4),

    /**
     * A build should be started on a specified schedule if changesets exist.
     */
    Schedule(8),

    /**
     * A build should be started on a specified schedule whether or not
     * changesets exist.
     */
    ScheduleForced(16),

    /**
     * A validation build should be started for each check-in.
     */
    GatedCheckIn(32),

    /**
     * A validation build should be started for each batch of check-ins.
     */
    BatchedGatedCheckIn(64),

    /**
     * All types.
     */
    All(127);

    private int value;

    DefinitionTriggerType(final int value) {
        this.value = value;
    }
}
