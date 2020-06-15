package com.example.AdminResource.controlador.exception;

public class BadRequestException extends RuntimeException {
    private static final String DESCRIPTION = "Bad Request Exception (400)";

    public BadRequestException(String detalle){
        super(DESCRIPTION+" "+detalle);
    }
}
