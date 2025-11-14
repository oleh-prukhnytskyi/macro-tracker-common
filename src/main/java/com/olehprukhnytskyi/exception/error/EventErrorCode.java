package com.olehprukhnytskyi.exception.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EventErrorCode implements BaseErrorCode {
	KAFKA_SEND_FAILED("Failed to send Kafka event", 500),
	KAFKA_PROCESSING_ERROR("Error processing Kafka event", 500),
	EVENT_DESERIALIZATION_FAILED("Failed to deserialize event", 500),
	EVENT_SERIALIZATION_FAILED("Failed to serialize event", 500);

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
