package com.concept.loadorder;

public class Loadorder {

	private static final Object obj = new Object();
	private static Loadorder myClass = new Loadorder();

	public Loadorder() {
		System.out.println(obj); // will print null once
	}
}
