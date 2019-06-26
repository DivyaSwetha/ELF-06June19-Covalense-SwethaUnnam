package com.covalense.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class TestLoan {

	public static void main(String[] args) {

		Loan l1 = Loan.HOME;
		Loan l2 = Loan.PERSON;
		Loan l3 = Loan.CAR;
		
		int constValue = l1.getValue();
		log.info("value of home loan is: " + constValue);
		
		int constValuep = l2.getValue();
		log.info("value of person loan is: " + constValuep);
		
		int constValuec = l3.getValue();
		log.info("value of car loan is: " + constValuec);
		
		
	}

}
