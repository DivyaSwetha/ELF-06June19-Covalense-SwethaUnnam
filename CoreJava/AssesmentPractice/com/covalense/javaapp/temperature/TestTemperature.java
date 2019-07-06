package com.covalense.javaapp.temperature;

public class TestTemperature {

	public static void main(String[] args) {

		TemperatureValidator sv = new TemperatureValidator();
		try {
			sv.validate(19);
		} catch (HeavyTemperatureException e) {
			e.printStackTrace();
		}

	}

}
