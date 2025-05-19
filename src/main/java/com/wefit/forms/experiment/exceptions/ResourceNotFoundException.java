package com.wefit.forms.experiment.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Recurso nao encontrado ou inexistente na base de dados. Id: " + id);
    }

}
