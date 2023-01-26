package com.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentTest {

	public static void main(String[] args) {
		new ConcurrentTest().runThread();
	}

	ExecutorService executor = Executors.newSingleThreadExecutor();
	public void runThread() {
		executor.submit(runnable);
		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow(); 
			System.out.println("shutdown finished");
		}
	}

	Runnable runnable = () -> {
		String name = Thread.currentThread().getName();
		System.out.println("currentThread Name : " + name);
		System.out.println("Hi User");
	};

}