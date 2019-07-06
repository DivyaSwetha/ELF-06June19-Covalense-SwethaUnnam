package com.covalense.javaapp.immuteclass;

public class TestP {

	public static void main(String[] args) {
Person p=new Person("Ram", 23);
System.out.println("Name is: "+p.getName());
System.out.println("Age is: "+p.getAge());

Person p1=new Person("seetha", 23);
System.out.println("Name is: "+p1.getName());
System.out.println("Age is: "+p1.getAge());
	}

}
