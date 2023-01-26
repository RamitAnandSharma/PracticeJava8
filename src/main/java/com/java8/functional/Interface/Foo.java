package com.java8.functional.Interface;

@FunctionalInterface
public interface Foo {

    String method(String string);

    default void defaultMethod() {
    }
}