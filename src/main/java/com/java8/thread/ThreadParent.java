package com.java8.thread;

public class ThreadParent {

	public static void main(String[] args) {

		new ThreadParent().runThread();

	}

	public void runThread() {
		// Thread thread = new Thread(runnable);
		// thread.start();
		runnable.run();
	}

	Runnable runnable = () -> {
		String name = Thread.currentThread().getName();
		System.out.println("currentThread Name : " + name);
		System.out.println("Hi User");
	};

}
