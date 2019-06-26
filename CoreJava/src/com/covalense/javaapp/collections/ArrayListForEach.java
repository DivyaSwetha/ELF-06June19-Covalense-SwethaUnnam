package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Divya");
		al.add("Ram");

		for (Object r : al) {			//using for-each loop
			
			System.out.println(r);
		}
	}

}
