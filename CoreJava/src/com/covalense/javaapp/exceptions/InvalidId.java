package com.covalense.javaapp.exceptions;

public class InvalidId extends Exception {
	private String message = "enter valid id";

	public String toString() {
		return message;

	}

	public String getMessage() {
		return message;
	}

}
