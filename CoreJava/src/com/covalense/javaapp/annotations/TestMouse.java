package com.covalense.javaapp.annotations;

@SuppressWarnings({ "deprecation", "unused" }) // if we have more than one parameters to suppress, we have to write in
												// curly braces

public class TestMouse {
	/*
	 * @SuppressWarnings("deprecation")
	 */
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.click();
		m.scroll();

	}

	/* @SuppressWarnings("unused") */
	void hai() {
		int a;
	}

}
