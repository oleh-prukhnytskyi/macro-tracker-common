package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class ExternalServiceException extends BaseException {
	public ExternalServiceException(BaseErrorCode errorCode, String message) {
		super(errorCode, message);
	}

	public ExternalServiceException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
