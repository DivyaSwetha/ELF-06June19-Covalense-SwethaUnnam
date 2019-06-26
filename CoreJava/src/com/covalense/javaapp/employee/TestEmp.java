package com.covalense.javaapp.employee;

public class TestEmp {

	public static void main(String[] args) {
		Employee a = new Employee();
		a.setName("Ram");
		a.setSalary(25000);
		a.setGender('M');
		
		DBone i = new DBone();
		i.recieve(a);
		
		DBtwo j = new DBtwo();
		j.recieve(a);
	}

}
