package com.covalense.assignmentthird;

import lombok.extern.java.Log;

@Log
public class StringSwap1 {

	public static void main(String[] args) {
		String s = "hoga beda hudgi nana bittu";
		String[] s1 = s.split(" ");
		for (int j = 0; j <= s1.length - 1; j++) {
			if (j % 2 == 0) {
				char[] ch = s1[j].toCharArray();
				for (int i = ch.length - 1; i >= 0; i--) {
					log.info(""+ch[i]);
				}
				log.info(" ");

			} else {

				log.info(s1[j]);
				log.info(" ");

			}
		}
	}
}
