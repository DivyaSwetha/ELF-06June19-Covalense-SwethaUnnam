package com.covalense.javaapp.methods;

import lombok.extern.java.Log;

@Log
class Mobile {
	String brand;
	String Os;
	double cost;
	void call() {
		log.info("calling");
	}
	void message() {
		log.info("Messaging");
	}
}


class Test1 {

	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.brand="samsung";
		mob.Os="Android";
		mob.cost=20000;
		mob.call();
		mob.message();
	}


}
