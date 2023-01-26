/*
 * Decompiled with CFR 0_110.
 */
package com.java8.defaultinterfacemethod;


public interface InterfaceChild extends InterfaceParent {
    @Override
    public void test();

    @Override
    default public void test2() {
        System.out.println("Hi Parent Default");
    }

    @Override
    public void test3();

    @Override
    default public void test4() {
        System.out.println("Hi Child Default");
    }
}

