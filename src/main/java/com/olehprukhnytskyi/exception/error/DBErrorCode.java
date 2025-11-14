package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DBErrorCode implements BaseErrorCode {
	DB_DUPLICATE_KEY("Duplicate key in database", 409);

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
