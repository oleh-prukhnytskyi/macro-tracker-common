package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {
    private final BaseErrorCode errorCode;

    public NotFoundException(BaseErrorCode errorCode, String detail) {
        super(detail);
        this.errorCode = errorCode;
    }

    public NotFoundException(BaseErrorCode errorCode, String detail, Throwable cause) {
        super(detail, cause);
        this.errorCode = errorCode;
    }
}
