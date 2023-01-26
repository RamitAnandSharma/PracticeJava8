package com.java8.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new CallableTest().runThread();
	}

	ExecutorService executor = Executors.newSingleThreadExecutor();

	public void runThread() throws InterruptedException, ExecutionException {
		Future<String> future = executor.submit(callable); 
		System.out.println("future done? " + future.isDone()); 
		System.out.print("result: " + future.get());

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

	Callable<String> callable = () -> {
		String name = Thread.currentThread().getName();
		System.out.println("currentThread Name : " + name);
		System.out.println("Hi User");
		TimeUnit.SECONDS.sleep(5);
		return name;
	};

}