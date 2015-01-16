package com.microsoft.vss.client.build.exception;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.vss.client.build.model.BuildRequestValidationResult;
import com.microsoft.vss.client.core.exception.VssServiceException;

public class BuildRequestValidationFailedException
    extends VssServiceException {

    private List<BuildRequestValidationResult> validationResults;

    public BuildRequestValidationFailedException(String message) {
        super(message);
    }

    public BuildRequestValidationFailedException(final String message, final Exception e) {
        super(message, e);
    }

    public BuildRequestValidationFailedException(
        final String message,
        final List<BuildRequestValidationResult> validationResults) {
        super(message);
        this.validationResults = new ArrayList<BuildRequestValidationResult>();

    }

    public List<BuildRequestValidationResult> getValidationResults() {
        return validationResults;
    }

    public void setValidationResults(final List<BuildRequestValidationResult> validationResults) {
        this.validationResults = validationResults;
    }
}
