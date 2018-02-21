package com.springboot.exception;

public class AuthenticationException extends Exception {

	private static final long serialVersionUID = -4542341039326750758L;

	public AuthenticationException() {
	}

	public AuthenticationException(String message) {
		super(message);
	}

	public AuthenticationException(Throwable t) {
		super(t);
	}

	public AuthenticationException(String message, Throwable t) {
		super(message, t);
	}
}
