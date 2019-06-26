package com.covalense.javaapp.parsing;

import lombok.extern.java.Log;

@Log
public class Parsing {

	public static void main(String[] args) {
		String a = "1";
		String b = "2";
		String c = "1.12";
		String d = "true";
		
		log.info(a + b);
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		
		log.info(""+(i + j));
		double d1 = Double.parseDouble(c);
		
		log.info(""+d1);
		boolean bo = Boolean.parseBoolean(d);

	}

}
