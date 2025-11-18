package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class NotFoundException extends BaseException {
    protected NotFoundException(BaseErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    protected NotFoundException(BaseErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
