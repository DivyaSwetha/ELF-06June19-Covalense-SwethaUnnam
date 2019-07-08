package com.covalense.javaapp.sipercentagefacttestcases;

import lombok.extern.java.Log;

@Log
public class CalculationOpp {

	public int simpleInterest(int principal, int time, int rate) {
		int si = (principal * time * rate) / 100;
		return si;
	}

	public static int percentage(int eng, int math, int sci, int total) {
		int totalMarks = eng + math + sci;
		int percentage = (totalMarks * 100) / total;
		return percentage;
	}

	public int fact(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fact(num - 1);
	}
	public static void main(String[] args) {
		
		double res=percentage(100,100,100,300);
		log.info("Percentage is: " +res);
	}

		
}
