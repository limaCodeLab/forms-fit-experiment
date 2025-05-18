package com.wefit.forms.experiment.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class StandardError {


    private Instant timestamp;
    private Integer statusCode;
    private String error;
    private String message;
    private String path;

    public StandardError() {}

    public StandardError(Instant timestamp, Integer statusCode, String error, String message, String path) {
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
        this.path = path;
    }


}
