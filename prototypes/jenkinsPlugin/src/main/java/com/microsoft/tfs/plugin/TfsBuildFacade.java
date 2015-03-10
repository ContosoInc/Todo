package com.microsoft.tfs.plugin;

import hudson.EnvVars;

import java.util.List;

/**
 * This class is a facade to update TFS build from Jenkins
 */
public interface TfsBuildFacade {

    public void startBuild();

    public void finishBuild();

    public void startAllTaskRecords();

    public void finishAllTaskRecords();

    public void appendJobLog(List<String> logLines);

    public int getTfsBuildId();
}
