package com.covalense.assignmentthird;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class RevString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		log.info("Enter the string to be reversed: ");
		String name = scan.nextLine();

		log.info("Name you entered is: " + name);

		char[] ch = name.toCharArray();

		log.info("Reverse of Name you entered is: ");

		for (int i = ch.length - 1; i >= 0; i--) {
			log.info(""+ch[i]);
		}
	}

}
