package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestD {

	public static void main(String[] args) {
		String poem = " eating sugar..no pappa";
		byte b[] = poem.getBytes();
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("poem.txt", true);// if we write true old data will not be overridden
			fout.write(b);
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
