package org.encode.rabo.exception;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String message){
        super (message);
    }
}
