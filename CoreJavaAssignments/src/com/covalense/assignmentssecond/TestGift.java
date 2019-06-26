package com.covalense.assignmentssecond;

public class TestGift {

	public static void main(String[] args) {
		Gift g1 = new Birthday();
		Gift g2 = new Marriage();
		Friend f = new Friend();
		f.recieved(g1);
	}

}
