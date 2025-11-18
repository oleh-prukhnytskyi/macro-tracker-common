package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class InternalServerException extends BaseException {
    public InternalServerException(BaseErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public InternalServerException(BaseErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
