package com.test.exceptiionhandling;


import com.test.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorCodes> handleBusinessException() {
        ErrorCodes errorCodes = new ErrorCodes(Constants.INVALID_REQ_CODE,Constants.INVALID_REQ);
        return new ResponseEntity<>(errorCodes, HttpStatus.BAD_REQUEST);
    }


}
