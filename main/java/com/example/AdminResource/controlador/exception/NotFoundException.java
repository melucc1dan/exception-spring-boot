package com.example.AdminResource.controlador.exception;

public class NotFoundException extends RuntimeException {
    private static final String DESCRIPTION = "Not found exception (404)";

    public NotFoundException(String detalle){
        super(DESCRIPTION+", "+detalle);

    }
}
