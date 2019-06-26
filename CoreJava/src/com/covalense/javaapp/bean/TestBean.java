package com.covalense.javaapp.bean;

public class TestBean {

	public static void main(String[] args) {
		Person a = new Person();
		a.setName("Ram");
		a.setAge(24);
		DBone i = new DBone();
		i.recieve(a);
		DBthree j = new DBthree();
		j.recieve(a);
	}

}
