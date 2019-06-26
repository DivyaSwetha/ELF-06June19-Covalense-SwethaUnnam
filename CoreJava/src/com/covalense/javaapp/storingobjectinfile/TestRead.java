package com.covalense.javaapp.storingobjectinfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class TestRead {

	public static void main(String[] args) {
		FileInputStream fin = null; // making objects available to each blocks
		ObjectInputStream objIn = null;

		try {
			fin = new FileInputStream("Ram.txt"); // reading from file
			objIn = new ObjectInputStream(fin);
			Person p = (Person) objIn.readObject();
			log.info("Name is:" + p.getName());
			log.info("Id is: " + p.getId());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			if (objIn != null) { // if objIn value is null then no need to close it
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
