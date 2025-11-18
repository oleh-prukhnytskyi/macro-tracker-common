package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class BadRequestException extends BaseException {
	public BadRequestException(BaseErrorCode errorCode, String message) {
		super(errorCode, message);
	}

	public BadRequestException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
