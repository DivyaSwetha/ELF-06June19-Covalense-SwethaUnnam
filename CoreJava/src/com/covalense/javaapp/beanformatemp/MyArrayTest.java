package com.covalense.javaapp.beanformatemp;


import lombok.extern.java.Log;

@Log    //use:- no need to create logger object
public class MyArrayTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MyArray ma = new MyArray();
		MyArray ma2=new MyArray();
		int size = 8;

		// Adding  values
		for (int i = 0; i < size; i++) {
			ma.add("value " + i);
		}
		
		
		log.info("removed value");
		ma.remove(9);

		// Getting values
		for (int i = 0; i < size; i++) {
			log.info("element present at " + i + " is: " + ma.get(i));
		}
		long endTime = System.currentTimeMillis();
		log.info("Total Execution time: " + (endTime - startTime) + "ms");

	}

}
