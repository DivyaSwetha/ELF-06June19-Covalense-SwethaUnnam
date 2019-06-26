package com.covalense.javaapp.enums;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {

		String msg = "Hi all good evening";
		byte b[] = msg.getBytes();
		
		try(FileOutputStream fout = new FileOutputStream("Test.txt")) {
			
			fout.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
