package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class ConflictException extends BaseException {
    public ConflictException(BaseErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public ConflictException(BaseErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
