package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FoodErrorCode implements BaseErrorCode {
	FOOD_NOT_FOUND("Food not found", 404),
	FOOD_ALREADY_EXISTS("Food already exists", 409);

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
