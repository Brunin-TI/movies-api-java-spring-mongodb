package dev.torres.moviesapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    /**
     * Method to create message
     * @param message
     */
    public ResourceNotFoundException(String message){
        super(message);
    }
}
