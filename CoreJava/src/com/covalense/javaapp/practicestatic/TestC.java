package com.covalense.javaapp.practicestatic;

import lombok.extern.java.Log;

@Log
public class TestC {

	public static void main(String[] args) {

		College.s.name = "Sai";
		log.info(College.s.name = "Sai");
		College.s.play();
	}

}
