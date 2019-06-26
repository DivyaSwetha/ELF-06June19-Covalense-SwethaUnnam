package com.covalense.javaapp.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class TestPencil {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p);

		Thread t1 = new Thread(ft);
		t1.start();

		try {
			int i = ft.get();
			log.info("value is: " + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
