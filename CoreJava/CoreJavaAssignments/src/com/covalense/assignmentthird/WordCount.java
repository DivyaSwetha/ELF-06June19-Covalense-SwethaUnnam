package com.covalense.assignmentthird;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class WordCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("Enter the sentence: ");
		String sen = scan.nextLine();
		String[] w = sen.split(" ");
		for (int i = 0; i <= w.length - 1; i++) {

			log.info(w[i] + w[i].length() + " ");
		}

	}
}
