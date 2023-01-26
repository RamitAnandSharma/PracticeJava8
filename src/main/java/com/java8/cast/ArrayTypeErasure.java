package com.java8.cast;

public class ArrayTypeErasure {
	public static void main(String[] args) {
		new ArrayTypeErasure().test();
	}

	void m1() {
		// Pair<Integer, Integer>[] pair = new Pair<Integer, Integer>[10];
		// Object[] objArr = intPairArr;
		// objArr[0] = new Pair<String, String>("", ""); // should fail, but would succeed

		Pair<?, ?>[] intPairArr1 = new Pair<?, ?>[10];
		Object[] objArr1 = intPairArr1;
		// For the same reason, arrays holding elements whose type is a wildcard parameterized type are banned, too.
		// Only arrays with an unbounded wildcard parameterized type as the component type are permitted.
		objArr1[0] = new Pair<String, String>("", ""); // should fail, but would succeed
	}

	void test() {
		Pair<String, String>[] arr = createArrayOfStringPairs();
		printArrayOfStringPairs(arr);
		extractStringPairsFromArray(arr);

	}

	Pair<String, String>[] createArrayOfStringPairs() {
		Pair<String, String>[] arr = new Name[2];
		arr[0] = new Name("Angelika", "Langer"); // fine
		arr[1] = new Pair<String, String>("a", "b"); // fine (causes ArrayStoreException)
		return arr;
	}

	void printArrayOfStringPairs(Pair<String, String>[] pa) {
		for (Pair<String, String> p : pa) {
			if (p != null)
				System.out.println(p.getFirst() + " " + p.getSecond());
		}
	}

	void extractStringPairsFromArray(Pair<String, String>[] arr) {
		Name name = (Name) arr[0]; // fine
		Pair<String, String> p1 = arr[1]; // fine
	}
}