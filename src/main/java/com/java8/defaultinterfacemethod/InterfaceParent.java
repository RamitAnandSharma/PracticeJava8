
package com.java8.defaultinterfacemethod;


public interface InterfaceParent {
    public void test();

    public void test2();

    default public void test3() {
        System.out.println("Hi Parent Default");
    }

    default public void test4() {
        System.out.println("Hi Parent Default");
    }
}

