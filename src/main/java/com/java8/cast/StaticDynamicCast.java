package com.java8.cast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaticDynamicCast {
	public static void main(String[] args) {
		new StaticDynamicCast().m1();
	}

	void m1() {
		List<Date> list = new ArrayList<Date>();
		list.add(new Date());
		m2(list);
	}

	void m2(Object arg) {
		/*
		 * The cast from Object to List<String> in method m2 looks like a cast to List<String> , 
		 * but actually is a cast from Object to the raw type List.
		 * It would succeed even if the object referred to were a List<Date> instead of a List<String> .
		 *
		 * In order to draw attention to the potentially unsafe cast the compiler issues an "unchecked" warning
		 * when it translates the dubious cast expression
		 */
		List<String> list = (List<String>) arg; // unchecked warning
		m3(list);
	}

	void m3(List<String> list) {
		/*
		 * After this successful cast we have a reference variable of type List<String> which refers to an object of type List<Date>.
		 * When we retrieve elements from that list we would expect String s, but in fact we receive Date s - 
		 * and a ClassCastException will occur in a place where nobody had expected it.
		 */
		String s = list.get(0); // ClassCastException
		System.out.println(s);
	}
}
