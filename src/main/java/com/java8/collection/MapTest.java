package com.java8.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		new MapTest().test();
	}

	public void test() {
		Map<String, String> map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.put("Z", "z");

		
		//map.computeIfAbsent(null, null)o
		List<Entry<String, String>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

		collect.forEach(System.out::println);
		
		map.compute("Z", (k,v) -> v.concat("x"));
		map.forEach( (k,v) -> System.out.println("Key : " + k + " Value : " + v));
	}

}
