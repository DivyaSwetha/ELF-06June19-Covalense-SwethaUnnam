package com.covalense.assignmentthird;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class AltSwap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("ENter a sentence: ");
		String s = scan.nextLine();
		String[] st = s.split(" ");
		String temp = "";
		String temp1 = "";
		for (int i = 0; i <= st.length - 1; i++) {
			if (i % 2 == 0) {
				if (i == 0) {
					temp = st[i];
					st[i] = st[st.length - 1];
					st[st.length - 1] = temp;
					log.info(st[i]);
					log.info(" ");

				}
				if (i > 0) {
					temp1 = st[i];
					st[i] = temp;
					temp = temp1;
					log.info(st[i]);
					log.info(" ");
				}

			} else {
				log.info(st[i]);
				log.info(" ");

			}
		}
	}

}
