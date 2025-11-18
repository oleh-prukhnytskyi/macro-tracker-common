package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;

public class EventProcessingException extends BaseException {
	public EventProcessingException(BaseErrorCode errorCode, String message) {
		super(errorCode, message);
	}

	public EventProcessingException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
