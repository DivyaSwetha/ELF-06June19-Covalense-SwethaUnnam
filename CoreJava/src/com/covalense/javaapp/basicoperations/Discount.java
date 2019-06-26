package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class Discount {

	public static void main(String[] args) {
		double Actualcost=100;
		double discount=10;
		int count=1;
		
		if(count==1) {
			double total=Actualcost-(Actualcost*discount)/100;

			log.info("Your price is:"+total);
		}
		else {
			log.info("Your price is:"+Actualcost);
		}
	}

}
