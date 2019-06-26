 package com.covalense.assignmentthird;

public class TestS {

	public static void main(String[] args) {
		StuBeanArr[] str=new StuBeanArr[2];

		str[0]= new StuBeanArr();
	
		str[0].setName("Student1");
		str[0].setRoll(123);
		str[0].setBrance("ECE");

		str[1]= new StuBeanArr();
		str[1].setName("Student2");
		str[1].setRoll(456);
		str[1].setBrance("CSE");

		
		DBstu d = new DBstu();
		d.recieve(str[0]);

	}

}
