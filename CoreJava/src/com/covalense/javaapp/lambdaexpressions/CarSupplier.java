package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class Car_Supplier {

	public static void main(String[] args) {
		Supplier<Car> s = () -> new Car(30.33);
		Car c = s.get();
		log.info("Fuel is: " + c.fuel);
	}

}
