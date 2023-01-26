/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

import java.io.PrintStream;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrimitiveFunctionalInterface {
    public static void main(String[] args) {
        PrimitiveFunctionalInterface.testmethod1();
    }

    public static void testmethod() {
        Predicate<Integer> value = i -> i > 2;
        System.out.println(value.test(1));
    }

    public static void testmethod1() {
        Function<Integer, Integer> value = i -> i * 2;
        System.out.println(value.apply(3));
    }
}

