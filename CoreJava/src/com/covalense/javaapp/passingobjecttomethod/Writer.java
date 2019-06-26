package com.covalense.javaapp.passingobjecttomethod;

public class Writer {
	void recieve(Pen p) {
		p.open();
		p.write();
	}
}
