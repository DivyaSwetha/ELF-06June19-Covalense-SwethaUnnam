package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestF {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("poem.txt"); // selecting file from which u want to read data
			int i;
			while ((i = fin.read()) != -1) { // -1 indicates end of file
				System.out.print((char) i); // fin.read() gives ASCII value, convrt that to char
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
