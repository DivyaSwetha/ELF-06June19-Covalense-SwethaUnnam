package com.covalense.javaapp.storingobjectinfile;

import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private transient int id; // declared as transient, so it will not be serializable, that means it will not
								// be written into file

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
