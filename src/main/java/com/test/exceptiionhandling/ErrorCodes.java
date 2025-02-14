package com.test.exceptiionhandling;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorCodes {

    private final int errorCode;

    private final String errorMessage;

}
