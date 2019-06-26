package com.covalense.javaapp.threads;

import java.util.concurrent.Callable;

public class Pencil implements Callable {

	@Override
	public Object call() throws Exception {
		return 120;
	}

}
