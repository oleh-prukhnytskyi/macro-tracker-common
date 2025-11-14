package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AuthErrorCode implements BaseErrorCode {
	INVALID_CREDENTIALS("Invalid credentials", 401),
	EMAIL_ALREADY_EXISTS("Email already exists", 400),
	UNSUPPORTED_PROVIDER("Unsupported social provider", 400),
	PROVIDER_API_ERROR("Error from social provider API", 502),
	TOKEN_VERIFICATION_FAILED("Token verification failed", 401),
	INVALID_TOKEN("Invalid token", 401);

	private final String title;
	private final int status;

	@Override
	public String getCode() {
		return this.name();
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public int getStatus() {
		return status;
	}
}
