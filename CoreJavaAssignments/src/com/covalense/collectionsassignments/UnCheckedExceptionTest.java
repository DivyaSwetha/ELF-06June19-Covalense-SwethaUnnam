package com.covalense.collectionsassignments;

public class UnCheckedExceptionTest {

	public static void main(String[] args) {
		String s = "Ram";
		log.info("name you entered is:"+s);
		Validator v=new Validator();
		v.validate(s);
		
	}

}
