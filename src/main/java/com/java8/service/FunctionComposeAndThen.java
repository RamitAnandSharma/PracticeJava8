/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

import java.io.PrintStream;
import java.util.function.Function;

public class FunctionComposeAndThen {
    public static void main(String[] args) {
        FunctionComposeAndThen.testMethod();
    }

    private static void testMethod() {
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> squared = e -> e - 1;
        int apply = times2.compose(squared).apply(4);
        System.out.println(apply);
        int apply2 = times2.andThen(squared).apply(4);
        System.out.println(apply2);
        Function<String, String> conc1 = e -> String.valueOf(e) + "AA";
        Function<String, String> conc2 = e -> String.valueOf(e) + "BB";
        String apply3 = conc1.compose(conc2).apply("");
        System.out.println(apply3);
        String apply4 = conc1.andThen(conc2).apply("");
        System.out.println(apply4);
    }
}

