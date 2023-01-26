package com.java8.common;

import java.util.HashMap;
import java.util.Map;

public class Immutability {

	public static void main(String[] args) {
		execute();
	}

	static void execute1() {

		String key = "key";
		Map map = new HashMap();
		map.put(key, "test");

		System.out.println(map.get(key));

		key = "alpha";
		System.out.println(map.get("key"));
		System.out.println(map.get(key));

		map.put(key, "test");
		System.out.println(map.get(key));

	}

	static void execute() {

		Person person = new Person("ramit", "sharma");
		Map map = new HashMap();
		map.put(person, "test");

		System.out.println(map.get(person));

		person.setLastname("anand");
		System.out.println(map.get(person));

		map.put(person, "test");
		System.out.println(map.get(person));

		person = new Person("sharma", "anand");

		System.out.println(map.get(person));

	}

}