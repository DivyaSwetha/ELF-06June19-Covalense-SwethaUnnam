package com.covalense.javaapp.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMouse {

	public static void main(String[] args) {

		Mouse m1 = new Mouse("MyFirst");
		Mouse m2 = new Mouse("MySecond");
		Mouse m3 = new Mouse("MyThird");
		Mouse m4 = new Mouse("MyFourth");
		Mouse m5 = new Mouse("MyFifth");

		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();

	}

}
