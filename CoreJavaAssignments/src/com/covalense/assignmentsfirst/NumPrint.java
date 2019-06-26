package com.covalense.assignmentsfirst;

import lombok.extern.java.Log;

@Log
public class Num5To1 {
	static int i=0;
	static void printNum() {
		i++;
		log.info(""+i);
		if(i<5) {
			printNum();
		}
	}
	public static void main(String[] args) {
		printNum();
	}
}
