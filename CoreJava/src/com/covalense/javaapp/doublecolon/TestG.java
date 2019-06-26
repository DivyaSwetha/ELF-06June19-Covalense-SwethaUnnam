package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class TestG {

	static void open() {
		log.info("*****Open()****");
		log.info("Logic to open the door");

	}

	public static void main(String[] args) {

		Room r = TestG::open;
		r.remove();
	}
}
