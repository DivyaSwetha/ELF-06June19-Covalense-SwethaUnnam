package com.covalense.collectionsassignments;

public class InvalidAgeException extends Exception{
	private String message = "You are not eligible to vote";

	public String toString() {
		return message;

	}

	public String getMessage() {
		return message;
	}
}
