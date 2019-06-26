package com.covalense.javaapp.inheritance.practicegoogle;

public class TestG {

	public static void main(String[] args) {
		Gmail g = new Gmail();
		GDrive gd = new GDrive();
		Browser b = new Browser();
		b.open(g);
	}

}
