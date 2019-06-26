package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class testG {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("password.txt");
			int i;
			while ((i = fr.read()) != -1) {
				log.info("" + (char) i);

			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
