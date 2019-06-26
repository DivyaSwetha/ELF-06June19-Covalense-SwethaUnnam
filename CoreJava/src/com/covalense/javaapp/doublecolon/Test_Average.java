package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class Test_Average {

	public static void main(String[] args) {
		MyStudent s=new MyStudent();
		MyFactorial f=s::calculateFact;
		int k=f.getFactorial(5);
		log.info("factorial is: "+k);
	}

}
