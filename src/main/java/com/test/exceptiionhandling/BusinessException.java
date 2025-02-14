package com.test.exceptiionhandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }
}
