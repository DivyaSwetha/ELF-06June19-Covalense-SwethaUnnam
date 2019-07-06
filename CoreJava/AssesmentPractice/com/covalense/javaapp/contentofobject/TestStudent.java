package com.covalense.javaapp.contentofobject;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class TestStudent {

	public static void main(String[] args) {
		
		Student st=new Student();

	Consumer<Student> f=s->{
		log.info("Contents are: "+s);
		
	};
	f.accept(st);
	}

}
