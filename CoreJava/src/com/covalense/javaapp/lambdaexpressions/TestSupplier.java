package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class Test_Supplier {

	public static void main(String[] args) {

		Supplier<Gun> s=()->new Gun(100);
		Gun g=s.get();
		log.info("No.Of Bullets " +g.bullets);

	}

}
