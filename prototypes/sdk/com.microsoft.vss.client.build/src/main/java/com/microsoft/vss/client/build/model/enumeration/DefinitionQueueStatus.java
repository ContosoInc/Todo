package com.microsoft.vss.client.build.model.enumeration;

public enum DefinitionQueueStatus {
    /**
     * When enabled the definition queue allows builds to be queued by users,
     * the system will queue scheduled, gated and continuous integration builds,
     * and the queued builds will be started by the system.
     */
    Enabled,

    /**
     * When paused the definition queue allows builds to be queued by users and
     * the system will queue scheduled, gated and continuous integration builds.
     * Builds in the queue will not be started by the system.
     */
    Paused,

    /**
     * When disabled the definition queue will not allow builds to be queued by
     * users and the system will not queue scheduled, gated or continuous
     * integration builds. Builds already in the queue will not be started by
     * the system.
     */
    Disabled;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
