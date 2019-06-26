package com.covalense.javaapp.overloading;

import lombok.extern.java.Log;

@Log
public class Train {
	static void search(int i) {
		log.info("Venkatadri Express 111 from station1 to station2 arriving at 10.00Am");
	}

	static void search(String s) {
		log.info("Venkatadri Express from station1 to station2 arriving at 10.00Am");

	}

	public static void main(String[] args) {
		search(111);
		search("venkatadri Express");
	}

}
