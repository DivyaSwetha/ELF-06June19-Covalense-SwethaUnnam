package com.covalense.javaapp.temperature;

public class HeavyTemperatureException extends Exception {

	String str = " Server room temperature is high";

	@Override
	public String toString() {
		return str;
	}

	@Override
	public String getMessage() {
		return str;
	}

}
