package com.covalense.javaapp.doublecolon;

public class Test_Student {

	public static void main(String[] args) {
		MyStudent my = new MyStudent();

		Average a = my::calculateAvg;
		a.avg(100, 95, 98);
	}

}
