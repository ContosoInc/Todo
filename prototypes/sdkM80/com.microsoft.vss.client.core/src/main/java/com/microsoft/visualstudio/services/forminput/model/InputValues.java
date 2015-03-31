/*
 * --------------------------------------------------------- Copyright(C)
 * Microsoft Corporation. All rights reserved.
 * ---------------------------------------------------------
 * 
 * --------------------------------------------------------- Generated file, DO
 * NOT EDIT ---------------------------------------------------------
 */
package com.microsoft.visualstudio.services.forminput.model;

import java.util.List;

public class InputValues {

    private String defaultValue;
    private InputValuesError error;
    private String inputId;
    private boolean isDisabled;
    private boolean isLimitedToPossibleValues;
    private boolean isReadOnly;
    private List<InputValue> possibleValues;

    /**
     * Getter for default value
     * @return String
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Setter for default value
     * @param defaultValue
     */
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Get input value errors
     * @return InputValuesError
     */
    public InputValuesError getError() {
        return error;
    }

    /**
     * Set input value errors
     * @param error
     */
    public void setError(final InputValuesError error) {
        this.error = error;
    }

    /**
     * Getter for input id
     * @return String
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * Setter for input id
     * @param inputId
     */
    public void setInputId(final String inputId) {
        this.inputId = inputId;
    }

    /**
     * Getter for disabling input
     * @return boolean
     */
    public boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * Setter for disabling input
     * @param isDisabled
     */
    public void setIsDisabled(final boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * Getter to limit input to possible values
     * @return boolean
     */
    public boolean getIsLimitedToPossibleValues() {
        return isLimitedToPossibleValues;
    }

    /**
     * Setter to limit input to possible values
     * @param isLimitedToPossibleValues
     */
    public void setIsLimitedToPossibleValues(final boolean isLimitedToPossibleValues) {
        this.isLimitedToPossibleValues = isLimitedToPossibleValues;
    }

    /**
     * Getter to mark input read only
     * @return boolean
     */
    public boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Setter to mark input read only
     * @param isReadOnly
     */
    public void setIsReadOnly(final boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    /**
     * Getter for possible input values
     * @return List
     */
    public List<InputValue> getPossibleValues() {
        return possibleValues;
    }

    /**
     * Setter for possible input values
     * @param possibleValues
     */
    public void setPossibleValues(final List<InputValue> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
