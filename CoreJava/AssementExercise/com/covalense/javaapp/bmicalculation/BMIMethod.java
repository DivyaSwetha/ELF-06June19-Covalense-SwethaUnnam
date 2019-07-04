package com.covalense.javaapp.bmicalculation;

import lombok.extern.java.Log;

@Log
public class BMIMethod {
	static double bmi(double height,double weight) {
		double bmi=(weight)/(height*height);
		return bmi;

	}
	public static void main(String[] args) {
		double bmiValue=bmi(5.7,47);

		if(bmiValue<18.5) {
			log.info(bmiValue+" is Under Weight");
		}else if(bmiValue<=24.9) {
			log.info(bmiValue+" is Normal");
		}else if(bmiValue<=29.9) {
			log.info(bmiValue+" is Over Weight");
		}else {
			log.info(bmiValue+" is Obesity");
		}

	}

}
