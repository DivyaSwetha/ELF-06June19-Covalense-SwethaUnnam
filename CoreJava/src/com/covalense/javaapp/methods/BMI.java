package com.covalense.javaapp.methods;

import lombok.extern.java.Log;

@Log
class BMIValue {
	double height;
	double weight;

	double calculateBmi() {
		double bmiValue = weight / (height * height);
		return bmiValue;
	}

	void generateResult(double bmiValue) {
		if (bmiValue < 18.5) {
			log.info("Under Weight");

		} else if (bmiValue <= 24.9) {
			log.info("Normal");
		} else if (bmiValue <= 29.9) {
			log.info("Over Weight");
		} else {
			log.info("Obesity");
		}
	}
}

@Log
class BMI {
	public static void main(String[] args) {

		BMIValue b = new BMIValue();
		b.height = 167;
		b.weight = 47;
		double BMIvalue = b.calculateBmi();
		log.info("BMI value is: " + BMIvalue);
		b.generateResult(BMIvalue);
	}
}