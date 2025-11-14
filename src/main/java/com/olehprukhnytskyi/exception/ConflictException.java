package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;
import lombok.Getter;

@Getter
public class ConflictException extends RuntimeException {
    private final BaseErrorCode errorCode;

    public ConflictException(BaseErrorCode errorCode, String detail) {
        super(detail);
        this.errorCode = errorCode;
    }

    public ConflictException(BaseErrorCode errorCode, String detail, Throwable cause) {
        super(detail, cause);
        this.errorCode = errorCode;
    }
}
