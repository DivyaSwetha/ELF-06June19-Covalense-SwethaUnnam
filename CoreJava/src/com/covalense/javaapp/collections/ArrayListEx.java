package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add(null); 						// allows null
		al.add('A');
		al.add("Divya");
		al.add("Ram");
		al.add("Divya");					 // Arraylist allows duplicates
		al.add(null); 							// Allows multiple null values

		for (int i = 0; i < al.size(); i++) {	 // size() gives length of collection object
			Object o = al.get(i); 				// as arrayList consists of different type of values, so we are using Object
												// here
			System.out.println(o);
		}

	}

}
