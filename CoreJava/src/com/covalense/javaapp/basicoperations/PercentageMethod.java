package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class PercentageMethod {
	
	static double percentage(int eng, int math, int sci, int total) {
		int totalMarks = eng + math + sci;
		double percentage = (totalMarks * 100) / total;
		return percentage;
	}

	public static void main(String[] args) {
		
		int eng = 97;
		int math = 100;
		int sci = 95;
		int Total = 300;
		double res = percentage(eng, math, sci, Total);
		log.info("Percentage is:" + res);
		
	}

}
