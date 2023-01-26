package com.java8.functional.Interface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturnNull {

	// http://vanillajava.blogspot.com/2014/09/lambdas-and-side-effects.html
	ExecutorService es = Executors.newSingleThreadExecutor();

	public void testReturnNull() {
		Future<Object> submit = es.submit(() -> {
			System.out.println("testReturnNull ");
			return null;
		});
	}

	public void testNoReturn() {
		es.submit(() -> {
			System.out.println("testNoReturn ");
		});
	}

	public void testNoReturn2() {
		es.submit(() -> {
			try (Scanner scanner = new Scanner(new FileReader("file.txt"))) {
				String line = scanner.nextLine();
				System.out.println("testNoReturn 2");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// return null;
		});

	}

	public void testNoReturn3() {
		Callable<Integer> calls = (Callable<Integer> & Serializable) () -> {
			return null;
		};
	}

	public static void main(String[] args) {
		new ReturnNull().testNoReturn2();
	}

}
