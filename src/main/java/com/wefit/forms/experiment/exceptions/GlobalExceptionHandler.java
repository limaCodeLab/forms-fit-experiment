package com.wefit.forms.experiment.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.converter.HttpMessageNotReadableException;
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
        String error = "Requisicao invalida, verifique os dados informados";
        status = HttpStatus.BAD_REQUEST;
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> validationNullData(MethodArgumentNotValidException e, HttpServletRequest request) {
        String error = "Erro de validacao de dados, verifique os dados informados";
        status = HttpStatus.BAD_REQUEST;
        String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error,
                message, request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<StandardError>  handleNotReadable(HttpMessageConversionException e, HttpServletRequest request) {
        String error = "Requisicao invalida, verifique os dados informados";
        status = HttpStatus.BAD_REQUEST;
        String message = e.getMessage();
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, message, request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<StandardError>  dataEmpty(HttpMessageNotReadableException e, HttpServletRequest request) {
        String error = "Requisicao invalida, verifique os dados informados";
        status = HttpStatus.BAD_REQUEST;
        String message = "Verifique seu JSON e certifique-se de ter todos os dados informados e tente novamente";
        StandardError bodyResponseError = new StandardError(Instant.now(), status.value(), error, message, request.getRequestURI());
        return ResponseEntity.status(status).body(bodyResponseError);
    }
}
