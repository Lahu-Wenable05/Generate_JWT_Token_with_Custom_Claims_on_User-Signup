package com.wenable.Application.customException;

public class UserException extends RuntimeException {

	public UserException(String msg) {
		super(msg);
	}

	public UserException(String msg, Throwable caus) {
		super(msg, caus);
	}

}
