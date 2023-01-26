/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

import java.util.ArrayList;
import java.util.Comparator;

import com.java8.functional.Interface.BeanFunction;
import com.java8.stream.BeanPojo;

public class StreamMap {
    public static void main(String[] args) {
        StreamMap.testMap();
    }

    private static void testMap() {
        //BeanFunction<String, String, Integer, BeanPojo> beanFunction = (arg_0, arg_1, arg_2) -> BeanPojo.new(arg_0, arg_1, arg_2);
    	
    	 BeanFunction<String, String, Integer, BeanPojo> beanFunction =  BeanPojo::new;
    	
        ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
        list.add(beanFunction.apply("1", "a", 1));
        list.add(beanFunction.apply("4", "b", 4));
        list.add(beanFunction.apply("3", "c", 3));
        list.add(beanFunction.apply("3", "d", 2));
        list.add(beanFunction.apply("2", "d", 2));
        list.add(beanFunction.apply("12", "d", 2));
        Comparator<BeanPojo> c = (u1, u2) -> Integer.valueOf(u1.getObj1()).compareTo(Integer.valueOf(u2.getObj1()));
        c = c.thenComparing(BeanPojo::getObj3);
        list.sort(c);
        list.forEach(System.out::println);
    }
}

