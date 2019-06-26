package com.covalense.javaapp.filehandling;

import java.io.File;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		File f = new File("programfiles");
		boolean res = f.mkdir();
		log.info("Result is:" + res);

		File f1 = new File("movies/kannada/new");
		boolean res1 = f1.mkdirs();
		log.info("Result is:" + res1);

	}
}
