package com.covalense.javaapp.inheritance.inheritmarker;

public abstract class Pencil {
	void draw() {
		System.out.println("I am a draw()");
	}

	abstract void write();

	abstract void color();
}
