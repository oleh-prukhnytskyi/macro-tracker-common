package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CommonErrorCode implements BaseErrorCode {
	INTERNAL_ERROR("Internal server error", 500),
	BAD_REQUEST("Bad request", 400),
	INVALID_DATE("Invalid date", 400),
	UPSTREAM_SERVICE_UNAVAILABLE("Upstream service unavailable", 502),
	VALIDATION_ERROR("Validation failed", 400);

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
