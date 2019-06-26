package com.covalense.javaapp.casting;

public class TestChips {

	public static void main(String[] args) {
		Chips c = new Lays();
		Lays l = (Lays) c;
		l.open();
		l.eat();

		Chips k = new Bingo();
		Bingo b = (Bingo) k;
		b.open();
		b.byteBingo();
	}

}
