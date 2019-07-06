package com.covalense.javaapp.temperature;

import lombok.extern.java.Log;

@Log
public class TemperatureValidator {
	public void validate(double temperature) throws HeavyTemperatureException {
		if (temperature > 18) {
			throw new HeavyTemperatureException();
		} else {
			log.info("Temperature is: "+temperature);
		}
	}
}
