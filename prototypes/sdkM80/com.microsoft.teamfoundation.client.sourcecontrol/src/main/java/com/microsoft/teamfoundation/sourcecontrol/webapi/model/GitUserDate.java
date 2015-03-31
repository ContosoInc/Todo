/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class GitUserDate {

    private Date date;
    private String email;
    private String name;

    /**
     * Getter for Date
     * @return Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for Date
     * @param date
     */
    public void setDate(final Date date) {
        this.date = date;
    }

    /**
     * Getter for Email
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email
     * @param email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
