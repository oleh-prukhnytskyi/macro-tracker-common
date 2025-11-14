package com.olehprukhnytskyi.exception;

import com.olehprukhnytskyi.exception.error.BaseErrorCode;
import lombok.Getter;

@Getter
public class BadRequestException extends RuntimeException {
	private final BaseErrorCode errorCode;

	public BadRequestException(BaseErrorCode errorCode, String detail) {
		super(detail);
		this.errorCode = errorCode;
	}

	public BadRequestException(BaseErrorCode errorCode, String detail, Throwable cause) {
		super(detail, cause);
		this.errorCode = errorCode;
	}
}
