package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class Test_Boy {

	public static void main(String[] args) {
		MyBoy mb = Boy::new;
		Boy b = mb.getBoy("Ram", 5.6, 20);

		log.info("name is: " + b.name);
		log.info("height is: " + b.height);
		log.info("age is: " + b.age);

	}

}
