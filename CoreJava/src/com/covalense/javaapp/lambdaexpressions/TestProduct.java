package com.covalense.javaapp.lambdaexpressions;

import lombok.extern.java.Log;

@Log
public class Test_Product {

	public static void main(String[] args) {
		MyProduct m = Product::new;
		Product po = m.getProduct("mobile", 12000);
		log.info("product details are: " + po);
	}

}
