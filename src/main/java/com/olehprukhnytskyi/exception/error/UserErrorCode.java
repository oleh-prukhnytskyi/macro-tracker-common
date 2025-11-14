package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserErrorCode implements BaseErrorCode {
	USER_PROFILE_NOT_FOUND("User profile not found", 404),
	USER_ALREADY_EXISTS("User already exists", 409);

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
