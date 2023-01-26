/*
 * Decompiled with CFR 0_110.
 */
package com.java8.streammethods;

import com.java8.stream.BeanPojo;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        MapTest.testMap();
    }

    private static void testMap() {
        BeanPojo beanPojo1 = new BeanPojo("1", "a", 1);
        BeanPojo beanPojo2 = new BeanPojo("2", "b", 2);
        BeanPojo beanPojo3 = new BeanPojo("2", "xxxx", 3);
        BeanPojo beanPojo4 = new BeanPojo("4", "c", 4);
        BeanPojo beanPojo5 = new BeanPojo("5", "d", 5);
        ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
        list.add(beanPojo1);
        list.add(beanPojo2);
        list.add(beanPojo3);
        list.add(beanPojo4);
        list.add(beanPojo5);
        Map<String, String> collect = list.stream().collect(Collectors.toMap(BeanPojo::getObj1, BeanPojo::getObj2, (old, newVal) -> newVal));
        collect.forEach((k, v) -> {
            System.out.println(String.valueOf(k) + " : " + v);
        }
        );
        Map<String, List<BeanPojo>> collect2 = list.stream().collect(Collectors.groupingBy(BeanPojo::getObj1));
        collect2.forEach((k, v) -> {
            System.out.println(String.valueOf(k) + " : " + v);
        }
        );
    }
}

