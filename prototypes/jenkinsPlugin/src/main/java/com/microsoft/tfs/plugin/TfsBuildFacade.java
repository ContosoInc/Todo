package com.microsoft.tfs.plugin;

import java.util.List;

/**
 * This class is a facade to update TFS build from Jenkins.
 */
public interface TfsBuildFacade {

    void startBuild();

    void finishBuild();

    void startAllTaskRecords();

    void finishAllTaskRecords();

    void appendJobLog(List<String> logLines);

    int getTfsBuildId();
}
