package com.cdm.clubedolivro.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String error) {
        super(error);
    }
}
