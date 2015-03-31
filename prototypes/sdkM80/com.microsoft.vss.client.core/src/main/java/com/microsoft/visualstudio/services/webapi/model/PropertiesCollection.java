/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.visualstudio.services.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;

public class PropertiesCollection {

    private int count;
    private Object item;
    private List<String> keys;
    private List<String> values;

    /**
     * Getter for property count
     * @return int
     */
    public int getCount() {
        return count;
    }

    /**
     * Setter for property count
     * @param count
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * Getter for item
     * @return Object
     */
    public Object getItem() {
        return item;
    }

    /**
     * Setter for item
     * @param item
     */
    public void setItem(final Object item) {
        this.item = item;
    }

    /**
     * Getter for keys
     * @return List
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * Setter for keys
     * @param keys
     */
    public void setKeys(final List<String> keys) {
        this.keys = keys;
    }

    /**
     * Getter for property values
     * @return
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * Setter for property values
     * @param values
     */
    public void setValues(final List<String> values) {
        this.values = values;
    }
}
