package com.hongtayvy.beybladexapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BeybladeXExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<BeybladeXErrorResponse> handleException(BeybladeXNotFoundException beybladeXNotFoundException){
        BeybladeXErrorResponse beybladeXErrorResponse = new BeybladeXErrorResponse();
        beybladeXErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        beybladeXErrorResponse.setMessage(beybladeXNotFoundException.getMessage());
        beybladeXErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(beybladeXErrorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<BeybladeXErrorResponse> handleException(Exception exception){
        BeybladeXErrorResponse beybladeXErrorResponse = new BeybladeXErrorResponse();
        beybladeXErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        beybladeXErrorResponse.setMessage(exception.getMessage());
        beybladeXErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(beybladeXErrorResponse, HttpStatus.BAD_REQUEST);
    }
}
