package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class MathAddTest {

	public static void main(String[] args) {
		Addition a=MathAdd::add;
		int i=a.sum(10, 20);
		log.info("result is: "+i);

	}

}
