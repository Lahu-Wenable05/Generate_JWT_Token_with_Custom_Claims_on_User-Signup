package com.wenable.Application.Dto;

public class ErrorResponseDto {

	private boolean success;
	private String message;

	public ErrorResponseDto() {
		super();
	}

	public ErrorResponseDto(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [success=" + success + ", message=" + message + "]";
	}

}
