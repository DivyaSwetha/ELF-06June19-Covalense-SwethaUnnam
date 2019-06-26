package com.covalense.javaapp.storingobjectinfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObj {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Ram");
		p.setId(123);

		try {
			FileOutputStream fout = new FileOutputStream("Ram.txt"); // writing into file
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			obj.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
