package com.covalense.javaapp.overridden;
public class TestC {

	public static void main(String[] args) {
		Pen p=new Marker();
		p.write();
		Pen pe=new Pen();
		pe.write();
		Marker m=new Marker();
		m.write();
	}

}
