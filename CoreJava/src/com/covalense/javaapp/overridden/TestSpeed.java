package com.covalense.javaapp.overridden;

public class TestSpeed {

	public static void main(String[] args) {
		Levelone l1=new Levelone();
		l1.speed();
		Levelone l2=new Leveltwo();
		l2.speed();
		Levelone l3=new LevelThree();
		l3.speed();

	}

}
