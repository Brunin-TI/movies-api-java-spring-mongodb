package dev.torres.moviesapi.handler;

import dev.torres.moviesapi.error.ErrorMessage;
import dev.torres.moviesapi.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
    /**
     * Method to control not found exception
     * @param ex
     * @return error message object
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFound(ResourceNotFoundException ex){
        ErrorMessage errorMessage = new ErrorMessage("Not found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}
