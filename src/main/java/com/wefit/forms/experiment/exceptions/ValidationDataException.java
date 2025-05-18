package com.wefit.forms.experiment.exceptions;


public class ValidationDataException extends RuntimeException {

    public ValidationDataException(String attributeName, String message) {
        super(attributeName + ": " + message);
    }
}
