package com.covalense.javaapp.lambdaassigns;

import lombok.extern.java.Log;

@Log
public class RangeOfNum {

	public static void main(String[] args) {
		NumRange n=num->{
			for(int i=0;i<=num;i++) {
				log.info("number: "+i);;
			}
		};
		n.range(10);

	}
}