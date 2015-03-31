/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public class TaskVersion {

    private boolean isTest;
    private int major;
    private int minor;
    private int patch;

    /**
     * Getter for IsTest
     * @return boolean
     */
    public boolean getIsTest() {
        return isTest;
    }

    /**
     * Setter for IsTest
     * @param isTest
     */
    public void setIsTest(final boolean isTest) {
        this.isTest = isTest;
    }

    /**
     * Getter for Major
     * @return int
     */
    public int getMajor() {
        return major;
    }

    /**
     * Setter for Major
     * @param major
     */
    public void setMajor(final int major) {
        this.major = major;
    }

    /**
     * Getter for Minor
     * @return int
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Setter for Minor
     * @param minor
     */
    public void setMinor(final int minor) {
        this.minor = minor;
    }

    /**
     * Getter for Patch
     * @return int
     */
    public int getPatch() {
        return patch;
    }

    /**
     * Setter for Patch
     * @param patch
     */
    public void setPatch(final int patch) {
        this.patch = patch;
    }
}
