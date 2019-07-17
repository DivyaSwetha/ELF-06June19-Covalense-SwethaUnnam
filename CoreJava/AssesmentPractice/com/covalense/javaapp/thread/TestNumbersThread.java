
package com.covalense.javaapp.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestNumbersThread {

	public static void main(String[] args) {

		NumbersThread m1 = new NumbersThread("MyFirst");
		NumbersThread m2 = new NumbersThread("MySecond");
		NumbersThread m3 = new NumbersThread("MyThird");
		NumbersThread m4 = new NumbersThread("MyFourth");
		NumbersThread m5 = new NumbersThread("MyFifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();

	}

}
