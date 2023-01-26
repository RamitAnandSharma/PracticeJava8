package com.java8.cast;

public class Ary {
	static void test() {
		Pair[] intPairArr = new Pair[10];
		addElements(intPairArr);
		Pair<Integer, Integer> pair = intPairArr[1]; // unchecked warning
		Integer i = pair.getFirst(); // fails with ClassClassException
		pair.setSecond(i);
	}

	static void addElements(Object[] objArr) {
		objArr[0] = new Pair<Integer, Integer>(0, 0);

		objArr[1] = new Pair<String, String>("", ""); // should fail, but succeeds }

	}

	public static void main(String[] args) {
		test();
	}
}
