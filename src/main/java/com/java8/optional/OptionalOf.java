package com.java8.optional;

import java.util.Optional;

public class OptionalOf {

	public static void main(String[] args) {
		new OptionalOf().execute();
	}

	public void execute() {

		Optional<String> of = Optional.of("");
		if (of.isPresent()) {
			System.out.println("isPresent() - ok");
		}

		Optional<Boolean> of2 = Optional.of(true);
		if (of2.isPresent()) {
			System.out.println("isPresent() - ok");
		}
		Optional<Boolean> of3 = Optional.ofNullable(null);
		if (of3.isPresent()) {
			System.out.println("isPresent() - ok");
		}
		Optional<Object> empty = Optional.empty();
		if (empty.isPresent()) {
			System.out.println("isPresent() - ok");
		}

		empty.ifPresent(x -> System.out.println("hi"));
		empty.orElse(of);
		try {
			empty.orElseThrow(Exception::new);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
