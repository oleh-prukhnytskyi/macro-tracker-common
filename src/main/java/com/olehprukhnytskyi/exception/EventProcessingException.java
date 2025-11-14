package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;
import lombok.Getter;

@Getter
public class EventProcessingException extends RuntimeException {
	private final BaseErrorCode errorCode;

	public EventProcessingException(BaseErrorCode errorCode, String detail) {
		super(detail);
		this.errorCode = errorCode;
	}

	public EventProcessingException(BaseErrorCode errorCode, String detail, Throwable cause) {
		super(detail, cause);
		this.errorCode = errorCode;
	}
}
