package com.covalense.assignmentthird;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
class wordRev {

	void wordRev(String[] s) {
		for (int j = 0; j <= s.length - 1; j++) {
			char[] ch = s[j].toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				log.info(""+ch[i]);
			}
			log.info(" ");

		}
	}
}

@Log
public class RevEachWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("Enter the sentence in which you want to reverse each word");
		String s = scan.nextLine();
		String[] str = s.split(" ");
		wordRev wr = new wordRev();
		wr.wordRev(str);

	}
}