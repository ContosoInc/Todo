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
import java.util.List;

public class InputValuesQuery {

    private HashMap<String, String> currentValues;
    private List<InputValues> inputValues;
    private Object resource;

    public HashMap<String, String> getCurrentValues() {
        return currentValues;
    }

    /**
     * Setter for current values
     * @param currentValues
     */
    public void setCurrentValues(final HashMap<String, String> currentValues) {
        this.currentValues = currentValues;
    }

    /**
     * Getter for input values
     * @return List
     */
    public List<InputValues> getInputValues() {
        return inputValues;
    }

    /**
     * Setter for input values
     * @param inputValues
     */
    public void setInputValues(final List<InputValues> inputValues) {
        this.inputValues = inputValues;
    }

    /**
     * Getter for resource object
     * @return Object
     */
    public Object getResource() {
        return resource;
    }

    /**
     * Setter for resource object
     * @param resource
     */
    public void setResource(final Object resource) {
        this.resource = resource;
    }
}
