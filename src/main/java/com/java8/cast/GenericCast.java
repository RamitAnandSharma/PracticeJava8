package com.java8.cast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericCast {
	public static void main(String[] args) {
		new GenericCast().m1();
	}

	/*
	 * A ArrayList<String> object cannot be passed as argument to a method that asks for a ArrayList<Object> because the two types are instantiations
	 * of the same generic type, but for different type arguments, and for this reason they are not compatible with each other
	 */ 
	void m1() {
		ArrayList<String> list = new ArrayList<String>();
		// printAll(list);
	}

	void printAll(ArrayList<Object> c) {
		for (Object o : c)
			System.out.println(o);
	}

	// On the other hand, instantiations of different generic types for the same type argument can be compatible.
	void m2() {
		List<Object> list = new ArrayList<Object>();
		printAll2(list);
	}

	void printAll2(Collection<Object> c) {
		for (Object o : c)
			System.out.println(o);
	}
}