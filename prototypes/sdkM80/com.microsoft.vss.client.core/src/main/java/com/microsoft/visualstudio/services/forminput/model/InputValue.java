/*
 * --------------------------------------------------------- Copyright(C)
 * Microsoft Corporation. All rights reserved.
 * ---------------------------------------------------------
 * 
 * --------------------------------------------------------- Generated file, DO
 * NOT EDIT ---------------------------------------------------------
 */
package com.microsoft.visualstudio.services.forminput.model;

import java.util.HashMap;

public class InputValue {

    private HashMap<String, String> data;
    private String displayValue;
    private String value;

    public HashMap<String, String> getData() {
        return data;
    }

    /**
     * Setter for data
     * @param data
     */
    public void setData(final HashMap<String, String> data) {
        this.data = data;
    }

    /**
     * Getter for display value
     * @return String
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Setter for display value
     * @param displayValue
     */
    public void setDisplayValue(final String displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * Getter for value
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter for value
     * @param value
     */
    public void setValue(final String value) {
        this.value = value;
    }
}
