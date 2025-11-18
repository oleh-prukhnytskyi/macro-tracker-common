package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;
import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
	private final BaseErrorCode errorCode;

	protected BaseException(BaseErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	protected BaseException(BaseErrorCode errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

}
