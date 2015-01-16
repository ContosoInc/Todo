package com.microsoft.vss.client.build.model;

public class BuildRequestValidationResult {
    private ValidationResult result;
    private String message;

    public ValidationResult getResult() {
        return result;
    }

    public void setResult(final ValidationResult result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
