package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class PrintArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Divya");
		al.add("Ram");
		System.out.println(al);  //printing using reference variable of array list
	}

}
