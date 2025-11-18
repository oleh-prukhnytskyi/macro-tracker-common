package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class InternalServerException extends BaseException {
    protected InternalServerException(BaseErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    protected InternalServerException(BaseErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
