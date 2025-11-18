package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class BadRequestException extends BaseException {
	protected BadRequestException(BaseErrorCode errorCode, String message) {
		super(errorCode, message);
	}

	protected BadRequestException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
