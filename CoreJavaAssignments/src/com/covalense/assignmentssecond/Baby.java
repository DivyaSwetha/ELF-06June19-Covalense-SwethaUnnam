package com.covalense.assignmentssecond;

public class Baby {

	public void recieve(IceCream v) {
		if(v instanceof Vanilla) {
			v.take();
		}
		if(v instanceof ChocoBix) {
			v.take();
		}
	}
}
