package com.covalense.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class TestEnum {

	public static void main(String[] args) {
		log.info("present at which index of enum " + Gender.MALE.ordinal());
		log.info("present at which index of enum " + Gender.FEMALE.ordinal());

		Gender t = Gender.FEMALE;

		switch (t) {
		case MALE:
			log.info("yes it is a MALE");
			break;
		case FEMALE:
			log.info("yes it is a FEMALE");
			break;
		case OTHER:
			log.info("yes it is a OTHER");
			break;
		}

	}

}
