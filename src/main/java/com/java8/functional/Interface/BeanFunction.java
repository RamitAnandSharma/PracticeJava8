package com.java8.functional.Interface;

@FunctionalInterface
public interface BeanFunction<T, U, V, R> {
	public R apply(T var1, U var2, V var3);
}
