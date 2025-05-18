package com.wefit.forms.experiment.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    private HttpStatus status;
    private String errorMessage;
    private String fieldName;


    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardError> badRequest(BadRequestException e, HttpServletRequest request) {
        String error = "Requisição inválida";
        status = HttpStatus.BAD_REQUEST;
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

    @ExceptionHandler(ValidationDataException.class)
    public ResponseEntity<StandardError> violationRule (ValidationDataException e, HttpServletRequest request) {
        String error = "Erro de validacao de dados";
        status = HttpStatus.UNPROCESSABLE_ENTITY;
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> violationRule (MethodArgumentNotValidException e, HttpServletRequest request) {
        String error = "Erro de validacao de dados";
        status = HttpStatus.UNPROCESSABLE_ENTITY;
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

}
