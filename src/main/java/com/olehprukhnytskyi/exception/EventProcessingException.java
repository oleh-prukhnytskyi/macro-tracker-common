package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class EventProcessingException extends BaseException {
	protected EventProcessingException(BaseErrorCode errorCode, String message) {
		super(errorCode, message);
	}

	protected EventProcessingException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
