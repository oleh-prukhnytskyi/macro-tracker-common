package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class NotFoundException extends BaseException {
    public NotFoundException(BaseErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public NotFoundException(BaseErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
